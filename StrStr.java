package Google;

class StrStr {
	 public int strStr1(String haystack, String needle) {
	        int i=0, j=0, count=0;
	        haystack.su
	        if(haystack.length()==0 && needle.length()==0){
	            return 0;
	        }
	        if(haystack.length()==1 && needle.length()==0){
	            return 0;
	        }
	        for( i=0;i<haystack.length();i++){
	            if(count==needle.length()){
	                break;
	            }
	            else{
	                if(haystack.charAt(i)==needle.charAt(j)){
	                    count++;
	                    System.out.println(count);
	                    j++;
	                    continue;
	                }
	                else{
	                	if(count>0){
	                		j=0;
		                    i--;
		                    count=0;
		                    continue;
	                	}
	                	else{
	                		continue;
	                	}
	                    
	                }
	            }
	        }
	        if(count==0){
	        	return -1;
	        }
	        return (i-count);
	    }
	 public static void main(String args[]){
		 StrStr s=new StrStr();
		 System.out.println(s.strStr1("mississippi","abc"));
	 }
}

