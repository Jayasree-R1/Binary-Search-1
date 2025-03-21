// Time Complexity : log(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach in three sentences only
// Dividing the input into half and getting rid of other half to optimie the time complexity

class Solution {
    public int search(int[] nums, int target) {
        int low = 0; 
        int high = nums.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid]==target) return mid;
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && nums[mid]>target){
                    high = mid -1;
                }else{
                    low = mid+1;
                }
            }
            else{
                if(nums[mid]<target && nums[high]>=target){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}