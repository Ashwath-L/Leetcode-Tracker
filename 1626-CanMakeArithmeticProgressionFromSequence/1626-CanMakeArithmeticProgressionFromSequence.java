// Last updated: 7/9/2026, 3:07:36 PM
import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        for(int i = 1;i<arr.length-1;i++){
            if(arr[i]-arr[i-1] != arr[i+1]-arr[i]) return false;
        }
        return true;
    }
}