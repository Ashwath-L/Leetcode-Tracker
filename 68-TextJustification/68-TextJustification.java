// Last updated: 7/9/2026, 3:10:29 PM
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> a = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int j = i;
            int b = 0;

            while (j < words.length && b + words[j].length() + (j - i) <= maxWidth) {
                b += words[j].length();
                j++;
            }

            int c = j - i - 1;
            StringBuilder d = new StringBuilder();

            if (j == words.length || c == 0) {
                for (int k = i; k < j; k++) {
                    d.append(words[k]);
                    if (k != j - 1) d.append(" ");
                }
                while (d.length() < maxWidth) d.append(" ");
            } else {
                int e = (maxWidth - b) / c;
                int f = (maxWidth - b) % c;

                for (int k = i; k < j; k++) {
                    d.append(words[k]);
                    if (k != j - 1) {
                        for (int l = 0; l < e; l++) d.append(" ");
                        if (f > 0) {
                            d.append(" ");
                            f--;
                        }
                    }
                }
            }

            a.add(d.toString());
            i = j;
        }

        return a;
    }
}