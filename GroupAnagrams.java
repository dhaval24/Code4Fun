package Google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	 Map<Character, Integer> m=new HashMap<Character, Integer>();
	 public List<List<String>> groupAnagrams1(String[] strs) {
		  //Map<String, List<String> > m=new HashMap<String,List<String>>();
		  //m.put("asdasd",m.get("asdasd").add("fdsdfs"));
		 	List<List<String>> result=new ArrayList<List<String>>();
	        List<String> inp=new ArrayList<String>();
	        for(int i=0;i<strs.length;i++){
	        	inp.add(strs[i]);
	        }
	       
	        int count=1;
	        for(int i=0;i<inp.size();i++){
	        	for(int j=0;j<inp.get(i).length();j++){
	        		char a=inp.get(i).charAt(j);
	        		if(m.containsKey(a)){
	        			continue;
	        		}
	        		else{
	        			m.put(a,count);
	        		}
	        		
	        	}
	        	List<String> l1=new ArrayList<String>();
	        	l1.add(inp.get(i));
 	        	for(int k=i+1;k<inp.size();k++){
	        		if(isAnagram(inp.get(i),inp.get(k))==true){
	        			l1.add(inp.get(k));
	        			inp.remove(k);
	        			k--;
	        		}
	        	}
	        	result.add(l1);
	        	//inp.remove(i);
	        	m.clear(); 	
	        }
	       
	       //System.out.println(inp); 
	        return result;
	    }
	 private boolean isAnagram(String s1, String s2){
		 if(s1.length()!=s2.length()){
			 return false;
		 }
		 else{
			 for(int i=0;i<s1.length();i++){
				 if(m.containsKey(s2.charAt(i))){
					 continue;
					 
				 }
				 else{
					 return false;
				 }
			 }
		 }
		
		return true;
	 }
	 public static void main(String args[]){
		 GroupAnagrams g=new GroupAnagrams();
		 String s[]={""};
		 System.out.println(g.groupAnagrams1(s));
	 }
}
