package Solutions1501to1600;

// 1. Brute Force
class Approach1 {
    public int countOdds(int low, int high) {
        int count = 0;
        for(int i = low; i<=high; i++){
            if(i % 2 == 1) count++;
        }
        return count;
    }
}

// Time Complexity - O(N)
// Space Complexity - O(1)

// 2. Maths
class Approach2 {
    public int countOdds(int low, int high) {
        int odd = (high - low) / 2;
        if(low % 2 == 1 || high % 2 == 1) odd++;
        return odd;
    }
}
// Time Complexity - O(1)
// Space Complexity - O(1)

public class Solution1523 {
    public static void main(String[] args) {
        Approach1 approach1 = new Approach1();
        System.out.println(approach1.countOdds(3, 7));
        System.out.println(approach1.countOdds(8, 10));

        Approach2 approach2 = new Approach2();
        System.out.println(approach2.countOdds(3, 7));
        System.out.println(approach2.countOdds(8, 10));
    }
}
