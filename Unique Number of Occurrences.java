//POTD
//
//
//
//
//
class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr)
        map.put(x, map.getOrDefault(x,0)+1);
        
        
        Set<Integer> set =new HashSet<>();
        for(int x:map.values())
        {
            if(set.contains(x))
            return false;
            
            set.add(x);
        }
        return true;
    }
}
