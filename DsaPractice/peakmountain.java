// You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

// Return the index of the peak element.

// Your task is to solve it in O(log(n)) time complexity

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int lo=1, hi=arr.length-2;  
      while(lo<=hi){
        int mid = (lo+hi)/2;
        if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1])return mid;
        else if(arr[mid]>arr[mid-1]&& arr[mid]<arr[mid+1]) lo=mid+1;
        else hi =mid-1;
      } 
      return -1;
    }
}