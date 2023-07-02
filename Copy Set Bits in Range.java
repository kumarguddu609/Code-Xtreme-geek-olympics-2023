//POTD-2
//link: "https://practice.geeksforgeeks.org/problems/copy-set-bits-in-range0623/1"
//
class Solution{
    static int setSetBit(int x, int y, int l, int r){
        --l;
        --r;
        int set=0;
        for(int i=l ;i<=r;i++)
        {
           
            int bit = (y >> i) & 1;
            x |= bit << i;
        
            
        }
        
       
        return x;
    }
}
