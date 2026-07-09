// Last updated: 7/9/2026, 3:05:32 PM
class Solution {
public long countCommas(long n) {
    long a = 0;
    long b = 1000;
    int c = 1;

    while(b <= n){
        long d = b * 1000 - 1;
        long e = Math.min(n, d);
        a += (e - b + 1) * c;
        b *= 1000;
        c++;
    }

    return a;
}

}
