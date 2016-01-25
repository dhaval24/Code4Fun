package Google;

public class Solution {
	public String reverse(String s1){
        String out="";
        for(int i=s1.length()-1;i>=0;i--){
            out=out+s1.charAt(i);
        }
        System.out.println(out);
        return out;
    }
    public boolean isPalindrome(String s) {
        if(s==""){
            return true;
        }
        else{
        	String s1="";
        	for(int i=0;i<s.length();i++){
        		if(Character.isLetter(s.charAt(i))){
        			s1=s1+s.charAt(i);
        		}
        	}
        	String out=reverse(s1);
            if(s1.equalsIgnoreCase(out)){
            	System.out.println("true");
                return true;
            }
            else{
                return false;
            }
        }
    }
 static void main(String[] args) {
		Solution s=new Solution();
		s.isPalindrome("A man, a plan, a canal: Panama");

	}

}
