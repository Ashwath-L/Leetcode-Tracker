// Last updated: 7/9/2026, 3:05:52 PM
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        
        Set<Integer> a = new HashSet<>();
        
        for (int i = 0; i < bulbs.size(); i++) {
            
            int b = bulbs.get(i);
            
            if (a.contains(b)) {
                a.remove(b);
            } else {
                a.add(b);
            }
        }
        
        List<Integer> c = new ArrayList<>(a);
        Collections.sort(c);
        
        return c;
    }
}
