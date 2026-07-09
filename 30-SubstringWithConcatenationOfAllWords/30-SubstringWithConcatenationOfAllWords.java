// Last updated: 7/9/2026, 3:10:56 PM
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> a = new ArrayList<>();

        if (s.length() == 0 || words.length == 0) return a;

        HashMap<String, Integer> b = new HashMap<>();

        for (String i : words) {
            b.put(i, b.getOrDefault(i, 0) + 1);
        }

        int c = words[0].length();
        int d = words.length;

        for (int i = 0; i < c; i++) {
            int j = i;
            int k = i;
            int l = 0;

            HashMap<String, Integer> m = new HashMap<>();

            while (k + c <= s.length()) {
                String n = s.substring(k, k + c);
                k += c;

                if (b.containsKey(n)) {
                    m.put(n, m.getOrDefault(n, 0) + 1);
                    l++;

                    while (m.get(n) > b.get(n)) {
                        String o = s.substring(j, j + c);
                        m.put(o, m.get(o) - 1);
                        j += c;
                        l--;
                    }

                    if (l == d) {
                        a.add(j);
                        String o = s.substring(j, j + c);
                        m.put(o, m.get(o) - 1);
                        j += c;
                        l--;
                    }
                } else {
                    m.clear();
                    l = 0;
                    j = k;
                }
            }
        }

        return a;
    }
}