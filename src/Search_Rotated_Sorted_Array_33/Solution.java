package Search_Rotated_Sorted_Array_33;

public class Solution {
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int start, int end) {
        if (start > end)
            return -1;
        if (nums[start] == target)
            return start;
        if (nums[end] == target)
            return end;
        int mid = start + (end - start) / 2;
        int curr = nums[mid];
        if (curr == target)
            return mid;
        if (nums[start] < curr) {
            return (nums[start] < target && target < curr)
                    ? search(nums, target, start, mid - 1)
                    : search(nums, target, mid + 1, end);
        }
        return (curr < target && target < nums[end])
                ? search(nums, target, mid + 1, end)
                : search(nums, target, start, mid - 1);
    }
}
