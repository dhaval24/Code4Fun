package Google;

import java.util.ArrayList;
import java.util.List;

public class MultiplyStrings {

	int carry;
	 StringBuilder row1=new StringBuilder();
	 
	 public String multiply(String num1, String num2) {
		 if(num1.equalsIgnoreCase("0") || num2.equalsIgnoreCase("0")){
			 return "0";
		 }
		 StringBuilder b=new StringBuilder(num1);
		 StringBuilder b1=new StringBuilder(num2);
		 List<String> s=new ArrayList<String>();
		 b.reverse();
		 b1.reverse();
		 
		 for(int i=0;i<b1.length();i++){
			 for(int k=0;k<i;k++){
				 row1.append('0');
			 }
			 
			 for(int j=0;j<b.length();j++){
				 row1=row1.append(addBits(b1.charAt(i),b.charAt(j)));
			 }
			 //row1.reverse();
			 if(carry>0){
				 row1=row1.append(carry);
			 }
			 s.add(row1.toString());
			 row1.setLength(0);
			 carry=0;
		 }
		 
		 System.out.println(s);
		 
	
		return addListElements(s);
		 
	    }
	 
	 private int addBits(char a, char b){
		 int num1=Character.getNumericValue(a);
		 int num2=Character.getNumericValue(b);
		 int res=num1*num2+carry;
		 int bit=res%10;
		 carry=res/10;
		 //row1=row1+bit;
		 return bit;
	 }
	 private int addBits1(char a, char b){
		 int num1=Character.getNumericValue(a);
		 int num2=Character.getNumericValue(b);
		 int res=num1+num2+carry;
		 int bit=res%10;
		 carry=res/10;
		 //row1=row1+bit;
		 return bit;
	 }
	 private String addListElements(List<String> s){
		 String temp="";
		 int i;
		 while(s.size()>1){
			 if(s.get(0).length()<s.get(1).length()){
				 for(i=0;i<s.get(0).length();i++){
					 temp=temp+addBits1(s.get(0).charAt(i),s.get(1).charAt(i));
				 }
				 
				 while(s.get(1).length()>i){
					 if(carry==0){
						 temp=temp+(Character.getNumericValue(s.get(1).charAt(i)));
					 }
					 else{
						 temp=temp+((Character.getNumericValue(s.get(1).charAt(i))+carry)%10); 
						 carry=(Character.getNumericValue(s.get(1).charAt(i))+carry)/10;
					 }
					i++;
					 System.out.println(temp);
				 }
			 }
			 else{
				 for(i=0;i<s.get(1).length();i++){
					 temp=temp+addBits1(s.get(0).charAt(i),s.get(1).charAt(i));
				 }
				 
				 while(s.get(0).length()>i){
					 if(carry==0){
						 temp=temp+(Character.getNumericValue(s.get(0).charAt(i)));
					 }
					 else{
						 temp=temp+((Character.getNumericValue(s.get(0).charAt(i))+carry)%10);
						 carry=(Character.getNumericValue(s.get(0).charAt(i))+carry)/10;
					 }
					i++;
					 System.out.println(temp);
				 }
			 }
			 
			/* else{
				 
				 temp=temp+carry;
			 }*/
			 
			 i=0;
			 //System.out.println(temp);
			 
			 carry=0;
			 s.remove(0);
			 s.remove(0);
			 s.add(0, temp);
			 temp="";
			 System.out.println(s);
		
		 }
		 StringBuilder result=new StringBuilder(s.get(0));
		 System.out.println(result);
		 result.reverse();
		 String result1=result.toString();
		 if(result1.charAt(0)=='0'){
			return result1.substring(1, result1.length());
		 }
		 //System.out.println(result);
		 else{
			 return result1;
		 }
		 
		 
	 }
	 
	 
	 
	 public static void main(String args[]){
		 MultiplyStrings s= new MultiplyStrings();
		 System.out.println(s.multiply("7070","7075"));
	 }
}
