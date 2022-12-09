package Intersection_of_Arrays_II_350;

import java.util.*;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0, n = nums1.length, m = nums2.length;
        while (i<n && j<m){
            if (nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j])
                i++;
            else
                j++;
        }
        int[] ans = new int[list.size()];
        int x=0;
        for(int a : list) ans[x++] = a;
        return ans;
    }
}