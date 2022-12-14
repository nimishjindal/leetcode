package Product_Array_Except_Self_238;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] res = new int[size];
        int[] back = new int[size];
        int[] front = new int[size];
        back[0] = front[size - 1] = 1;

        for (int i = 1; i < size; i++)
            back[i] = back[i - 1] * nums[i - 1];
        for (int i = size - 2; i >= 0; i--)
            front[i] = nums[i + 1] * front[i + 1];
        for (int i = 0; i < size; i++)
            res[i] = back[i] * front[i];
        return res;
    }
}
