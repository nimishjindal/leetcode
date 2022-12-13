package Increasing_Triplet_Subsequence_334;

public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int size = nums.length;
        if (size < 3)
            return false;

        int min = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;

        for (int curr : nums) {
            if (curr < min)
                min = curr;
            else if (min < curr && curr < mid)
                mid = curr;
            else if (curr > mid)
                return true;
        }
        return false;
    }
}
