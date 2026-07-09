// Last updated: 7/9/2026, 3:10:39 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] a = s.trim().split(" ");
        int n = a.length;
        String b = a[n-1];
        return b.length();
    }
}