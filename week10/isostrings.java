/*
 * Solution adapted from Leetcode.com
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
	//If the s string is empty, this is trivial
        if(s == null || s.length() <= 1) 
	   return true;

	//If their lengths aren't the same, then we can't map the strings
	if(s.length() != t.length())
	   return false;

	//Set up our hashtable
        HashMap<Character, Character> map = new HashMap<Character, Character>();

	//Iterate through the string
        for(int i = 0 ; i< s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
	
            if(map.containsKey(a)){ //Character has been mapped already
                if(map.get(a).equals(b)){ //If it matches the character from t that it was mapped to, then we're good
		   continue;		
		}else{
                   return false;
		}
            }else{ //Create the mapping
                if(!map.containsValue(b))
                map.put(a,b);
                else return false;
                
            }
        }
        return true;
        
    }
}
