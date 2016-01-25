package Google;

import java.util.HashMap;
import java.util.Map;

public class LongestSub {
	 public int lengthOfLongestSubstring(String s) {
	        Map<Character, Integer> m=new HashMap<Character, Integer>();
	        int i=0,j=0;
	        int max=0;
	        for(i=0;i<s.length();i++){
	            if(!m.containsKey(s.charAt(i))){
	                m.put(s.charAt(i), i);
	                max=Math.max(max,i-j+1);
	            }
	            else{
	            	
	                j=m.get(s.charAt(i))+1;
	                m.clear();
	                m.put(s.charAt(i), i);
	                //max=Math.max(max,i-j);
	                System.out.println(j);
	            }
	        }
	        
	        System.out.println(m);
	        return max;
	    }
	 public static void main(String args[]){
		 LongestSub l=new LongestSub();
		 System.out.println(l.lengthOfLongestSubstring("abcabcde"));
	 }
}
