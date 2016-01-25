package Google;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public void majorityElement(int[] nums) {
        Map<Integer,Integer> m=new HashMap<Integer ,Integer>();
        int majority;
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
            	
            	m.put(nums[i], m.get(nums[i])+1);
            }
            else{
            	m.put(nums[i],1);
            }
        }
        System.out.println(m);
        for(Map.Entry<Integer, Integer> entry:m.entrySet()){
        	if(entry.getValue()>(nums.length/2)){
        		System.out.println(entry.getKey());
        	}
        }
        
	}    
        //return 0;
	public static void main(String args[]){
		MajorityElement m=new MajorityElement();
		int a[]={3,2,3};
		m.majorityElement(a);
	}
	
}
