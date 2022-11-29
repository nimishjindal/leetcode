package Gas_Station_134;

public class Solution {

    int[] gas;
    int[] cost;
    int size;

    public int canCompleteCircuit(int[] gas, int[] cost) {
        this.cost = cost;
        this.gas = gas;
        this.size = gas.length;

        return (sum() < 0) ? -1 : getStart();
    }

    private int sum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += (gas[i] - cost[i]);
        }
        return sum;
    }

    private int getStart() {
        int total = 0;
        int start = 0;
        for (int i = 0; i < size; i++) {
            total += gas[i] - cost[i];
            if (total < 0) {
                total = 0;
                start = i + 1;
            }
        }
        return start;
    }
}
