package Google;
/*This code converts a string into zigzag string*/
public class ZigZag {


    public void convert(String s, int numRows) {
        int stringLength=s.length();
        char stringCon[][]=new char[numRows][stringLength];
        int temp=0;
        int flag=0;
        int column=0;
        int temp1=0;
        while(temp1<stringLength){
            if(flag==0){
                while(temp<numRows && temp>=0 && temp1<stringLength){
                	
                    stringCon[temp][column]=s.charAt(temp1);
                    temp++;
                    temp1++;
                }
                flag=1;
                temp=temp-2;;
                column++;
            }
            else{
                while(temp>=0 && temp1<stringLength){
                    stringCon[temp][column]=s.charAt(temp1);
                    temp--;
                    column++;
                    temp1++;
                }
                temp=temp+2;
                flag=0;
            }
        }
        String output="";
        for(int i=0;i<numRows;i++){
        	for(int j=0;j<stringLength;j++){
        		if(stringCon[i][j]!=' ' &&stringCon[i][j]!='\0')
        		{
        			output=output+stringCon[i][j];
        		}
        		
        	}
        }
        System.out.println(output);
        
    }
   public static void main(String args[]){
	   ZigZag z=new ZigZag();
	   z.convert("PAYPALISHIRING", 3);
   }
}
