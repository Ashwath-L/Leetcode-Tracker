// Last updated: 7/9/2026, 3:11:27 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int one = 0;
        int n = s.length();
        for (int i=0;i<n;i++){
            int freq[]=new int [256];
            for(int j=i;j<n;j++){
                if(freq[s.charAt(j)]>0){
                    break;
                }else{
                    freq[s.charAt(j)]++;
                    one=Math.max(one,j-i+1);
                }
            }
            
        }
        return one;

    }
}