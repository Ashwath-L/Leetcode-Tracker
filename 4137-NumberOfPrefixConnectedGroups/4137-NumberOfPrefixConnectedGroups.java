// Last updated: 7/9/2026, 3:06:19 PM
class Solution {
    public int prefixConnected(String[] words, int k) {
        
        HashMap<String, Integer> a = new HashMap<>();
        
        for (int i = 0; i < words.length; i++) {
            
            if (words[i].length() >= k) {
                
                String b = words[i].substring(0, k);
                
                a.put(b, a.getOrDefault(b, 0) + 1);
            }
        }
        
        int c = 0;
        
        for (int d : a.values()) {
            if (d >= 2) {
                c++;
            }
        }
        
        return c;
    }
}
