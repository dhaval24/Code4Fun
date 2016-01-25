package Google;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates2 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
	       Map<Integer, Integer> m=new HashMap<Integer, Integer>();
	       for(int i=0;i<nums.length;i++){
	           if(m.containsKey(nums[i])){
	               if(i-m.get(nums[i])<=k){
	            	   System.out.println(m);
	                   return true;
	               }
	               else{
	                   m.put(nums[i], i);
	               }
	           }
	           else{
	               m.put(nums[i],i);
	           }
	           
	       }
	       System.out.println(m);
	        return false;
	    }
	public static void main(String args[]){
		FindDuplicates2 f=new FindDuplicates2();
		int a[]={-1,-1};
		int k=1q;
		System.out.println(f.containsNearbyDuplicate(a, k));
	}
}
