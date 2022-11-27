import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {

    boolean[] visited;
    int[] nums;
    List<List<Integer>> ans;
    int size;
    int numPerms;

    Stack<Integer> curr;

    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        this.size = nums.length;
        numPerms = factortial(size);
        visited = new boolean[size];
        ans = new ArrayList<>();
        curr = new Stack<>();

        sol();
        return ans;
    }

    private void sol() {
        if (curr.size() == size) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < size; i++) {
            if (!visited[i]) {
                curr.push(nums[i]);
                visited[i] = true;
                sol();
                curr.pop();
                visited[i] = false;
            }
        }
    }

    private int factortial(int size) {
        if (size < 1)
            return 1;
        return size * factortial(size - 1);
    }
}