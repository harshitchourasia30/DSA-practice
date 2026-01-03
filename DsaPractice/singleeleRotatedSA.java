//There is an integer array nums sorted in ascending order (with distinct values).

// Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].

// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

// You must write an algorithm with O(log n) runtime complexity.


class Solution {
    public int search(int[] arr, int tar) {
        int lo =0, hi=arr.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==tar) return mid;
            else if(arr[lo]<=arr[mid]){ // left half sorted
            if(arr[lo]<=tar && tar<arr[mid]) hi=mid-1;
            else lo=mid+1;
            }
            else{// mid to hi sorted
            if(arr[mid]<tar && tar<=arr[hi]) lo=mid+1;
            else hi=mid-1;

            }
        }
        return -1;
        
    }
}