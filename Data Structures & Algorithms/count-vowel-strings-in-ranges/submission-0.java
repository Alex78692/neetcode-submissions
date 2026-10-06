class Solution {
    public int[] vowelStrings(String[] w, int[][] q) {

        int arr[] = new int[q.length];
        int i = 0;

        for (int a[] : q) {

            int first = a[0];
            int second = a[1];
            int count = 0;

            while (first <= second) {

                String s = w[first];

                int length = s.length() - 1;

                if ((s.charAt(0) == 'a' || s.charAt(0) == 'e' ||
                     s.charAt(0) == 'i' || s.charAt(0) == 'o' ||
                     s.charAt(0) == 'u')
                    &&
                    (s.charAt(length) == 'a' || s.charAt(length) == 'e' ||
                     s.charAt(length) == 'i' || s.charAt(length) == 'o' ||
                     s.charAt(length) == 'u')) {

                    count++;
                }

                first++;
            }

            arr[i] = count;
            i++;
        }

        return arr;
    }
}