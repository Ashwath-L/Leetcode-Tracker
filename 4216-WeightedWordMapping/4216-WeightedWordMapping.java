// Last updated: 7/9/2026, 3:05:50 PM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        
        String a = "";
        
        for (int i = 0; i < words.length; i++) {
            
            int b = 0;
            
            for (int j = 0; j < words[i].length(); j++) {
                
                char c = words[i].charAt(j);
                int d = c - 'a';
                
                b = b + weights[d];
            }
            
            int e = b % 26;
            
            char f = (char) ('z' - e);
            
            a = a + f;
        }
        
        return a;
    }
}