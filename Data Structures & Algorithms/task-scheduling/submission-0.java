class Solution {
    public int leastInterval(char[] tasks, int n) {

        HashMap<Character, Integer> map = new HashMap<>();

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (Character t : tasks) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        for (int k : map.values()) {
            pq.add(k);
        }

        int time = 0;

        while (!pq.isEmpty()) {

            ArrayList<Integer> temp = new ArrayList<>();

            for (int i = 1; i <= n + 1; i++) {

                if (!pq.isEmpty()) {

                    int fre = pq.poll();

                    fre--;

                    if (fre > 0) {
                        temp.add(fre);
                    }

                    time++;
                }
                else {

                    // PQ empty means remaining slots are idle
                    if (temp.isEmpty()) {
                        break;
                    }

                    time++;
                }
            }

            for (int f : temp) {
                pq.add(f);
            }
        }

        return time;
    }
}