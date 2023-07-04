//POTD-4
//https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1
//
//
class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    
    { 
        if (k <= 1) return 0;
        int left = 0, right = 0, count = 0, product = 1;
        while (right < a.length) {
            product *= a[right];
            while (product >= k) product /= a[left++];
            count += 1 + (right - left);
            right++;
        }
        return count;
        
        }
        
    }
