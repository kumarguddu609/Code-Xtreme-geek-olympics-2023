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
///
//
class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    
    { 
       long p=1;
        int ans=0,i=0,j=0;
        for(i=0, j=0; j<n ; j++)
        {
            p = p*a[j];
            while(p>=k && i<j)
            {
                p/=a[i];
                i++;
            }
            
            if(p<k)
            ans+= (j-i+1);
        
        }
        return ans;
        
        }
        
    }
