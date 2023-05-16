package Soultions1to100;

import java.util.Arrays;
import java.util.HashMap;

// Brute Force
class Approach1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}

// Time Complexity - O(N^2)
// Space Complexity - O(1)

// Two Pass Table
class Approach2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i, map.get(complement)};
            }
        }
        return null;
    }
}
// Time Complexity - O(N)
// Space Complexity - O(N)


// One Pass Table
class Approach3 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[] {i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
public class Solution1 {
    public static void main(String[] args) {
        Approach1 approach1 = new Approach1();

        int[] nums = {2, 7, 11, 15}; int target = 9;
        int[] nums1 = {3,2,4}; int target1 = 6;
        int[] nums2 = {3,3}; int target2 = 6;

        System.out.println(Arrays.toString(approach1.twoSum(nums, target)));
        System.out.println(Arrays.toString(approach1.twoSum(nums1, target1)));
        System.out.println(Arrays.toString(approach1.twoSum(nums2, target2)));


        Approach2 approach2 = new Approach2();

        System.out.println(Arrays.toString(approach2.twoSum(nums, target)));
        System.out.println(Arrays.toString(approach2.twoSum(nums1, target1)));
        System.out.println(Arrays.toString(approach2.twoSum(nums2, target2)));

        Approach3 approach3 = new Approach3();

        System.out.println(Arrays.toString(approach3.twoSum(nums, target)));
        System.out.println(Arrays.toString(approach3.twoSum(nums1, target1)));
        System.out.println(Arrays.toString(approach3.twoSum(nums2, target2)));

    }
}
