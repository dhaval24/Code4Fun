package Google;

import java.util.ArrayList;
import java.util.List;

public class SplitString {
	private String s;
	private List<String> sp=new ArrayList<String>();
	public SplitString(String s){
		this.s=s;
	}
	public String[] split(){
		s=s.trim();
		//System.out.println(s);
		int length=s.length();
		int j=0;
		int i;
		for( i=0;i<length-1;i++){
			if(s.charAt(i)!=' '){
				continue;
			}
			else{
				if(i-j>1){
					sp.add(s.substring(j,i));
					
				}
				else{
					sp.add(""+s.charAt(j));
					j=i;
				}
				
				while(s.charAt(i)==' '){
					i++;
				}
				j=i;
				i--;
			}
		}
		sp.add(s.substring(j,i+1));
		return sp.toArray( new String[sp.size()]);
	}
	public static void main(String args[]){
		SplitString s=new SplitString("Hello, ,       , world");
		String array[]=s.split();
		System.out.println(array.length);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}
