//POTD-5
//
//
//Time Complexity--O(n)
//Space Complexity--O(1)
//------------------------------------------------------------------------------------------------------
class Solution {
    public static int stockBuyAndSell(int n, int[] prices) {
        int profit=0;
        for(int i=1;i<n;i++){
            if(prices[i-1]<prices[i]){
            profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    } 
}
        
