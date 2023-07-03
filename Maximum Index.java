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


//// Time Complexity-- O(n)
//Space Complexity-- O(n)  //extra auxillary space
class Solution {

    int maxIndexDiff(int arr[], int n) {
       int LMin[]=new int[n];
       int RMax[]=new int[n];
       
       //Storing min from left in array
       LMin[0]=arr[0];
       for(int i=1;i<n;i++){
           
               LMin[i]=Math.min(arr[i],LMin[i-1]);
           
       }
       
        //Storing max from right in array
        RMax[n-1]=arr[n-1];
       for(int j=n-2;j>=0;--j){
           RMax[j]=Math.max(arr[j],RMax[j+1]);
       }
       
       int i=0; 
       int j=0;
       int max_diff=-1;
       while(i<n &&j<n){
           if(LMin[i]<=RMax[j]){
               max_diff=Math.max(max_diff,j-i);
               j++;
           }
           else{
               i++;
           }
       }
       return max_diff;
    }
}
