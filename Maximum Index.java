// POTD-3
//Link: " https://practice.geeksforgeeks.org/problems/maximum-index3307/1 "
// Time Complexity-- O(n^2)
//Space Complexity-- O(1)
//-----------------------------------------------------------------------------------------------------------------------------------
class Solution {

    int maxIndexDiff(int arr[], int n) {
        int max_diff=0;
        int curr_diff=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[i]<=arr[j])
                curr_diff=j-i;
            }
            max_diff=Math.max(max_diff,curr_diff);
        }
        return max_diff;
    }
}
