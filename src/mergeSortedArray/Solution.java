package mergeSortedArray;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0, i = 0, j = 0;
        int[] nums = new int[m + n];
        if (m == 0 || n == 0) {
            if (n + m >= 0 && m == 0)
                System.arraycopy(nums2, 0, nums1, 0, n + m);
            return;
        }
        while (k < m + n) {
            if (i < m && j < n) {
                nums[k] = nums1[i] <= nums2[j] ? nums1[i++] : nums2[j++];
            } else {
                if (j < n){
                    nums[k] = nums2[j++];
                }else
                    nums[k] = nums1[i++];
            }
            k++;
        }
        if (n + m >= 0)
            System.arraycopy(nums, 0, nums1, 0, n + m);
    }
}