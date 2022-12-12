package First_Last_Pos_of_Elem_Sorted_Arr_34;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[]{-1, -1};
        int first = searchFirst(nums, target);
        int last = searchLast(nums, target);
        return new int[]{first, last};
    }

    private int searchLast(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start + 1) / 2;
            int curr = nums[mid];
            if (nums[end] == target)
                return end;
            else if (curr == target)
                start = mid;
            else if (curr < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start < nums.length && nums[start] == target ? start : -1;
    }

    private int searchFirst(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int curr = nums[mid];
            if (nums[start] == target)
                return start;
            if (curr == target)
                end = mid;
            else if (curr < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start < nums.length && nums[start] == target ? start : -1;
    }
}
