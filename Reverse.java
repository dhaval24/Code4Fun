package Google;

public class Reverse {
	public String reverseWords(String s) {
        s=s.trim();
        System.out.println(s);
        String a[]=s.split("\\s+");
        if(a.length==0){
            return "";
        }
        
        s="";
        if(a.length>0){
            s=a[a.length-1];
        }
        for(String s1: a){
        	System.out.println(s1);
        }
        for(int i=a.length-2;i>=0;i--){
            if(!a[i].equals(" ")){
            	System.out.println("dasda");
            	 s=s+" "+a[i];
            }
            
           
        }
        return s;
    }
	public static void main(String args[]){
		Reverse s=new Reverse();
		System.out.println(s.reverseWords("   a   b "));
	}
}
