// Last updated: 7/9/2026, 3:05:29 PM
import java.util.*;

class Solution {
    public int minCost(int[] nums1, int[] nums2) {

        int n = nums1.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums1[i], map.getOrDefault(nums1[i],0)+1);
            map.put(nums2[i], map.getOrDefault(nums2[i],0)+1);
        }

        for(int v : map.values()){
            if(v % 2 != 0) return -1;
        }

        HashMap<Integer,Integer> need = new HashMap<>();

        for(int i=0;i<n;i++){
            if(nums1[i] != nums2[i]){
                need.put(nums1[i], need.getOrDefault(nums1[i],0)+1);
                need.put(nums2[i], need.getOrDefault(nums2[i],0)-1);
            }
        }

        int cost = 0;

        for(int v : need.values()){
            cost += Math.abs(v);
        }

        return cost / 4;
    }
}