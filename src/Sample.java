import Gas_Station_134.Solution;

public class Sample {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] gas = {1,2,3,4,5}, cost = {3,4,5,1,2};
        System.out.println(s.canCompleteCircuit(gas, cost));
    }
}
