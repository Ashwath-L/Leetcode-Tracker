// Last updated: 7/9/2026, 3:07:20 PM
class Solution {
    public long interchangeableRectangles(int[][] rec) {
        int n = rec.length;
        HashMap<Double , Integer> map = new HashMap<>();
        long count = 0;
        for(int i=0; i<n; i++){
            double ratio = (double) rec[i][0] / rec[i][1];

            int x = map.getOrDefault(ratio , 0);
            count += x;
            map.put(ratio, map.getOrDefault(ratio, 0) + 1);
        }
        return count;
    }
}