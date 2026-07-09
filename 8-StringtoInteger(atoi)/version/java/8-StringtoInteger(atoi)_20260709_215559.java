// Last updated: 7/9/2026, 9:55:59 PM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int n = nums.length;
4        int i = n-2;
5        while(i>= 0 && nums[i] >= nums[i+1]){
6                i--;
7        }
8
9        if(i>=0){
10            int j = n-1;
11            while(j >= 0 && nums[j] <= nums[i]){
12                j--;
13            }
14            swap(nums, i, j);
15        }
16        reverse(nums, i+1, n-1);
17    }
18
19    public void swap(int[] nums, int i , int j){
20        int temp = nums[i];
21        nums[i] = nums[j];
22        nums[j] = temp;
23    }
24
25    private void reverse(int[] nums, int start, int end) {
26        while(start<end){
27            swap(nums, start, end);
28            start++;
29            end--;
30        }
31    }
32}