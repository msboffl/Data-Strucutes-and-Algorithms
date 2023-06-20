package Solutions101to200.Solution189;


import java.util.Arrays;

// Extra Space
class Approach1 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int rotated[] = new int[n];

        k = k % n;
        for(int i = 0; i < n; i++) {
            int newPos = (i + k) % n;
            rotated[newPos] = nums[i];
        }
         System.out.println(Arrays.toString(rotated));
        // Copy the rotated array back to the original array
        for(int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }
    }
}

// Time Complexity = O(N + N) = O(2N) = O(N)
// Space Complexity = O(N)


// In Place (Two Pointers)
class Approach2 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

// Time Complexity  O(N)
// Space Complexity = O(1)
public class Solution189 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        Approach1 approach1 = new Approach1();
        approach1.rotate(nums, k);

        Approach2 approach2 = new Approach2();
        approach2.rotate(nums, k);
    }
}
