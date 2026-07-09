// Last updated: 7/9/2026, 3:09:05 PM
class Solution {
    public int calculate(String s) {
        Stack<Integer> a = new Stack<>();
        int b = 0;
        int c = 0;
        int d = 1;

        for (int i = 0; i < s.length(); i++) {
            char e = s.charAt(i);

            if (Character.isDigit(e)) {
                c = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    c = c * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                b += d * c;
            } else if (e == '+') {
                d = 1;
            } else if (e == '-') {
                d = -1;
            } else if (e == '(') {
                a.push(b);
                a.push(d);
                b = 0;
                d = 1;
            } else if (e == ')') {
                b = a.pop() * b + a.pop();
            }
        }

        return b;
    }
}