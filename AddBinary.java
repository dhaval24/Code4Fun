package Google;

public class AddBinary {
	char carry='0';
    public String addBinary(String a, String b) {
	int length1=a.length();
	int length2=b.length();
	String temp="";
	String temp1="";
	String result="";
	
    if(length1==0 && length2==0){
		return result;
	}
	if(length1!=0 && length2==0){
		return a;
	}
	if(length1==0 && length2!=0){
		return b;
	}
	if(length1>length2){
		for(int i=0;i<length1-length2;i++){
			temp=temp+'0';
		}
		temp=temp+b;
	}
	
	if(length1<=length2){
		for(int i=0;i<length2-length1;i++){
			temp=temp+'0';
		}
		temp=temp+a;	
	}
	for(int i=temp.length()-1;i>=0;i--){
		if(length1>length2){
			temp1=temp1+digitAdd(a.charAt(i), temp.charAt(i), carry);
		}
		else{
			temp1=temp1+digitAdd(b.charAt(i), temp.charAt(i),carry);
		}
	}
	temp1=temp1+carry;
	StringBuilder b1=new StringBuilder(temp1);
	return b1.reverse().toString();
    }
private char digitAdd(char a, char b, char c){
	int t1=Character.getNumericValue(a);
	int t2=Character.getNumericValue(b);
	int t3=Character.getNumericValue(c);
	System.out.println(t1);
	int sum=t1+t2+t3;
	if(sum==0){
		carry='0';
		return '0';
	}
	else if(sum==1){
		carry='0';
		return '1';
		
	}
	else if(sum==2){
		carry='1';
		return '0';
	}
	else{
		carry='1';
		return '1';
	}
}

public static void main(String args[]){
	AddBinary a=new AddBinary();
	System.out.println(a.addBinary("1", "1"));
}
}
