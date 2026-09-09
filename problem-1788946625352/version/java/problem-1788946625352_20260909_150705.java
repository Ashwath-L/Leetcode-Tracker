// Last updated: 9/9/2026, 3:07:05 PM
1class Solution {
2public long countCommas(long n) {
3    long a = 0;
4    long b = 1000;
5    int c = 1;
6
7    while(b <= n){
8        long d = b * 1000 - 1;
9        long e = Math.min(n, d);
10        a += (e - b + 1) * c;
11        b *= 1000;
12        c++;
13    }
14
15    return a;
16}
17
18}