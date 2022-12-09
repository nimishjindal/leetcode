package Merge_Sorted_Array_88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[n + m];
        int i = 0, j = 0, x = 0;
        while (i < m && j < n)
            res[x++] = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
        while (i < m)
            res[x++] = nums1[i++];
        while (j < n)
            res[x++] = nums2[j++];
        x--;
        while (x >= 0)
            nums1[x] = res[x--];
    }
}