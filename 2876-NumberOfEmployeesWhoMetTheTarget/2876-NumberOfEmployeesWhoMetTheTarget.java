// Last updated: 7/9/2026, 3:07:06 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
    int iCount = 0;
    for(int i = 0; i < hours.length; i++){
        if(hours[i] >= target)
        {iCount++;}}
    return iCount;
}
}