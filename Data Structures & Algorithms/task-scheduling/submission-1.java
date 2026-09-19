class Solution {
    public int leastInterval(char[] tasks, int n) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        int time = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : tasks) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int f : map.values()) {
            pq.add(f);
        }

        while (!pq.isEmpty()) {

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 1; i <= n + 1; i++) {

                if (!pq.isEmpty()) {

                    int in = pq.poll();
                    in--;

                    if (in > 0) {
                        list.add(in);
                    }
                }

                // Agar saare tasks finish ho gaye
                // to remaining slots count nahi karne
                if (pq.isEmpty() && list.isEmpty()) {
                    time++;
                    break;
                }

                time++;
            }

            for (int s : list) {
                pq.add(s);
            }
        }

        return time;
    }
}
