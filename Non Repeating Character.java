//POTD
//
//
//
//
class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String s)
    {
        //Your code here 
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
 
         for(int i=0; i<s.length(); i++)
         if(map.get(s.charAt(i))==1)
         return s.charAt(i);
         
         
         return '$';
    }
}
