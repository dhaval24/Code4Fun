package Google;

public class Version {
	public int compareVersion(String version1, String version2) {
		 String s[]=version1.split("\\.");
         String s2[]=version2.split("\\.");
         System.out.println(s2[0]);
         int length;
         int flag=0;
         int i=0;
         if(s.length<s2.length){
        	 length=s.length;
        	 flag=1;
         }
         else{
        	 length=s2.length;
         }
         for( i=0;i<length;i++){
        	 if(Integer.valueOf(s[i])==Integer.valueOf(s2[i])){
        		 continue;
        	 }
        	 else{
        		 if(Integer.valueOf(s[i])>Integer.valueOf(s2[i])){
            		 return 1;
            	 }
        		 else {
        			 return -1;
        		 }
  
        	 }
         }
         if(flag==0 && i<s.length){
        	 while(i<s.length){
        		 if(Integer.valueOf(s[i])>0){
            		 return 1;
            	 }
        		 i++;
        	 }
        	 
        	
        		 return 0;
        	 
         }
         if(flag==1 && i<s2.length){
        	 while(i<s2.length){
        		 if(Integer.valueOf(s2[i])>0){
            		 return -1;
            	 }
        		 i++;
        	 }
        	 
        	 return 0;
        	 
         }
         return 0;
    }
	public static void main(String[] args) {
		Version v=new Version();
		System.out.println(v.compareVersion("1", "1.1"));
		
		

	}

}
