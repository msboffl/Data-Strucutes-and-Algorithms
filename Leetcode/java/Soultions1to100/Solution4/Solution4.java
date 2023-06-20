package Soultions1to100.Solution4;

import java.util.Arrays;

// 1. Merge & Sort
class Approach1 {
    public double[] findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        double[] merged = new double[m + n];
        for(int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }
        for(int i = 0; i < n; i++) {
            merged[i + m] = nums2[i];
        }

        Arrays.sort(merged);

        int length = merged.length;
        if (length % 2 == 0) {
            int midIndex = length / 2;
            return new double[]{(merged[midIndex - 1] + merged[midIndex]) / 2};
        } else {
            int midIndex = length / 2;
            return new double[]{merged[midIndex]};
        }

    }
}

// Time Complexity - O(m+n)log(m+n)
// Space Complexity - O(m+n)

// Merge (without sort) and Find Median
class  Approach2 {
    public double[] findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        // Merge the two arrays into the 'merged' array
        while (i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }
        // Copy any remaining elements from nums1
        while (i < m) {
            merged[k] = nums1[i];
            i++;
            k++;
        }

        // Copy any remaining elements from nums1
        while (j < n) {
            merged[k] = nums2[j];
            j++;
            k++;
        }

        // Find the median of the merged array
        int length = merged.length;
        if (length % 2 == 0) {
            int midIndex = length / 2;
            int mid1 = merged[midIndex - 1];
            int mid2 = merged[midIndex];
            return new double[]{(double) (mid1 + mid2) / 2};
        } else {
            int midIndex = length / 2;
            return new double[]{merged[midIndex]};
        }

    }

}
public class Solution4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        Approach1 approach1 = new Approach1();
        System.out.println(Arrays.toString(approach1.findMedianSortedArrays(nums1, nums2)));

        Approach2 approach2 = new Approach2();
        System.out.println(Arrays.toString(approach2.findMedianSortedArrays(nums1, nums2)));

    }
}
