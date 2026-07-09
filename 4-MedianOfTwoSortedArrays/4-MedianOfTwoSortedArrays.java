// Last updated: 7/9/2026, 3:11:25 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m = nums2.length;
        int l =m+n;
        int[] ans=new int[m+n];
        for(int i =0;i<n;i++){
            ans[i]=nums1[i];
        }
        for(int j=0;j<m;j++){
            ans[n+j]=nums2[j];
        }
        Arrays.sort(ans);
        if(l%2==1){
            double fin = ans[l/2];
            return fin;
        }else{
            double fin = (ans[(l/2)-1] + ans[l/2])/2.0;
            return fin;
        }
    }
}