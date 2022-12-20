https://leetcode.com/problems/keys-and-rooms/solutions/1116707/js-python-java-c-easy-dfs-stack-solution-w-explanation/
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> R) {
        boolean[] vis = new boolean[R.size()];
        vis[0] = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int count = 1;
        while (stack.size() > 0)
            for (int k : R.get(stack.pop()))
                if (!vis[k]) {
                    stack.push(k);
                    vis[k] = true;
                    count++;
                }
        return R.size() == count;
    }
}
