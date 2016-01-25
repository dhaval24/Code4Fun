package Google;

public class atoi {
	
	public int myAtoi(String str) {
        int MAX=2147483647;
        int MIN=-2147483647;
        if(str.isEmpty()){
            return 0;
        }
        String temp;
        int i=0;
        int num=0;
        while(str.charAt(i)==' '){
            i++;
        }
        temp=str.substring(i,str.length());
        System.out.println(temp);
        int length=temp.length()-1;
        if(temp!=""){
            if(temp.charAt(0)=='-' ){
            	
                for(int k=temp.length()-1;k>=1;k--){
                	if(temp.charAt(k)-'0'<48 || temp.charAt(k)-'0'>57){
                		return 0;
                	}
                    int pow=(int)Math.pow(10,length-k);
                    if(num<MIN){
                        return MIN;
                    }
                    else{
                        num=num-Character.getNumericValue(temp.charAt(k))*pow;
                        
                    }
                    
                }
            }
            else{
            	int flag;
            	if(temp.charAt(0)=='+' || temp.charAt(0)=='0'){
            		 flag=1;
            	}
            	else{
            		flag=0;
            	}
                for(int k=temp.length()-1;k>=flag;k--){
                	if(temp.charAt(k)-'0'<48 || temp.charAt(k)-'0'>57){
                		return 0;
                	}
                    int pow=(int)Math.pow(10,length-k);
                    if(num>MAX){
                        return MAX;
                    }
                    else{
                        num=num+Character.getNumericValue(temp.charAt(k))*pow;
                        System.out.println(num);
                    }
                }
            }
        }
        System.out.println(num);
        return num;
    }

	    public static void main(String args[]){
	    	atoi i=new atoi();
	    	System.out.println(i.myAtoi("    010"));
	    }
	}

