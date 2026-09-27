// Last updated: 9/27/2026, 2:20:46 PM
1class Solution {
2private:
3    int lower_bound(vector<int>& nums, int low, int high, int target){
4        while(low <= high){
5            int mid = (low + high) >> 1;
6            if(nums[mid] < target){
7                low = mid + 1;
8            }
9            else{
10                high = mid - 1;
11            }
12        }
13        return low;
14    }
15public:
16    vector<int> searchRange(vector<int>& nums, int target) {
17        int low = 0, high = nums.size()-1;
18        int startingPosition = lower_bound(nums, low, high, target);
19        int endingPosition = lower_bound(nums, low, high, target + 1) - 1;
20        if(startingPosition < nums.size() && nums[startingPosition] == target){
21            return {startingPosition, endingPosition};
22        }
23        return {-1, -1};
24    }
25};