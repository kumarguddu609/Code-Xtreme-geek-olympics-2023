//POTD-7
//
//
//
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
    int l = n+m;
        int gap = (l/2) + (l%2);
        while(gap>0)
        {
            int st=0; int end=st+gap;
            while(end<l)
            {
                // st in arr1 and end in arr2
                if(st<n && end>=n)
                {
                    swap(arr1, arr2, st, end-n);
                }
                // st in arr2 and end in arr2
                else if(st>=n)
                swap(arr2, arr2, st-n, end-n);
                //st in arr1 and end in arr1
                else
                swap(arr1, arr1, st, end);
                
                st++; end++;
            }
            if(gap==1) break;
            gap = (gap/2) + (gap%2);
            
        }
    }
    static void swap( long arr1[], long arr2[], int x1, int x2)
    {
        if(arr1[x1] > arr2[x2])
        {
            long t = arr1[x1]; arr1[x1] = arr2[x2] ; arr2[x2] = t;
        }
    }
}

