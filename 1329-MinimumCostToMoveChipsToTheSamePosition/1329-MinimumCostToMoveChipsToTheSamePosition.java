// Last updated: 7/9/2026, 3:07:45 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
       int a = 0;
       int b = 0;
        for (int i=0;i<position.length;i++) {
            if (position[i] % 2 == 0) {
                a+=1;
            } else {
                b+=1;
            }
        }
        if (a < b) {
            return a;
        } else {
            return b;
        } 
    }
}