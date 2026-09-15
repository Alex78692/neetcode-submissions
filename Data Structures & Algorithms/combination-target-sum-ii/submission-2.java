class Solution {
    public List<List<Integer>> combinationSum2(int[] can, int t) {

        List<Integer> c = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(can);

        summ(can, ans, c, 0, t, 0);

        return ans;
    }

    void summ(int[] can,
              List<List<Integer>> ans,
              List<Integer> c,
              int sum,
              int t,
              int in) {

        if (sum == t) {
            ans.add(new ArrayList<>(c));
            return;
        }

        if (in == can.length || sum > t) {
            return;
        }

        for (int i = in; i < can.length; i++) {

            // Skip duplicate choice at the same level
            if (i > in && can[i] == can[i - 1]) {
                continue;
            }

            c.add(can[i]);

            summ(can, ans, c,
                 sum + can[i],
                 t,
                 i + 1);

            c.remove(c.size() - 1);
        }
    }
}