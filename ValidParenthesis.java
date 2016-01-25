package Google;

import java.util.Stack;
public class ValidParenthesis {
	public boolean isValid(String s){
		Stack<Character> st= new Stack<Character>();
		if(s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']'){
			return false;
		}
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
				st.push(s.charAt(i));
			}
			else{
				if(s.charAt(i)==']'){
					if(!st.isEmpty() && st.peek()=='['){
						st.pop();
					}
					else{
						return false;
					}
				}
				else if(s.charAt(i)=='}'){
					if(!st.isEmpty() && st.peek()=='{'){
						st.pop();
					}
					else{
						return false;
					}
				}
				else if(s.charAt(i)==')'){
					if(!st.isEmpty() && st.peek()=='(' ){
						st.pop();
					}
					else{
						return false;
					}
				}
			}
		}
		if(st.isEmpty()){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		ValidParenthesis p=new ValidParenthesis();
		System.out.println(p.isValid("["));

	}

}
