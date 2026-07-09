// Last updated: 7/9/2026, 3:05:25 PM

class Solution {
    public int getLength(int[] nums) {
        int a = nums.length;
        int b = 1;

        for (int c = 0; c < a; c++) {
            HashMap<Integer, Integer> d = new HashMap<>();
            HashMap<Integer, Integer> e = new HashMap<>();

            int f = 0;
            int g = 0;

            for (int h = c; h < a; h++) {
                int i = nums[h];

                int j = d.getOrDefault(i, 0);

                if (j > 0) {
                    e.put(j, e.get(j) - 1);
                    if (e.get(j) == 0) {
                        e.remove(j);
                    }
                } else {
                    g++;
                }

                j++;
                d.put(i, j);

                e.put(j, e.getOrDefault(j, 0) + 1);

                f = Math.max(f, j);

                if (g == 1) {
                    b = Math.max(b, h - c + 1);
                } else {
                    if (f % 2 == 0) {
                        int k = f / 2;

                        if (e.size() == 2 &&
                            e.containsKey(f) &&
                            e.containsKey(k)) {

                            b = Math.max(b, h - c + 1);
                        }
                    }
                }
            }
        }

        return b;
    }
}