import Merge_Sorted_Array_88.Solution;

public class Sample {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1};
        s.merge(
                new int[]{1,2,3,0,0,0}, 3,
                new int[]{2,5,6}, 3
        );
    }
}
