import Search_2D_Matrix_74.Solution;

public class Sample {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(s.searchMatrix(matrix, target));
    }
}
