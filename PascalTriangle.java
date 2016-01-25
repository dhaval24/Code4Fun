package Google;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l1=new ArrayList<List<Integer>>();
        for(int i=0;i<2;i++){
        	List<Integer> l=new ArrayList<Integer>();
        	for(int j=0;j<i+1;j++){
        		
        		l.add(1);
        	}
        	l1.add(l);
        }
       
        for(int i=2;i<numRows;i++){
        	List<Integer> l=new ArrayList<Integer>();
        	l.add(1);
        	for(int j=1;j<i;j++){
        		int temp=l1.get(i-1).get(j-1);
        		//System.out.println(temp);
        		int temp1=l1.get(i-1).get(j);
        		//System.out.println(temp1);
        		temp1=temp+temp1;
        		l.add(temp1);
        	}
        	l.add(1);
        	l1.add(l);
        }
        System.out.println(l1);
		return l1;
		
    }
	
	
	
	
	public static void main(String args[]){
		PascalTriangle p=new PascalTriangle();
		p.generate(5);
	}
}
