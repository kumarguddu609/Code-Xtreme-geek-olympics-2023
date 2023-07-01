//Problem link
//"https://practice.geeksforgeeks.org/problems/set-bits0143/1"
///
class Solution {
    static int setBits(int N) {
         int total = 0;
        
         while (N > 0){
            
            // Taking AND of N with N - 1
            N = N & (N - 1);
            
            // Increment total on each iteration.
            ++total;
        }
        return total;
    }
}
