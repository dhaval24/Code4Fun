package Google;

public class LongestPrefix {
	public String LongestCommonPrefix(String[] strs) {
        String lgs="";
        if(strs.length==0){
            return lgs;
        }
        if(strs.length==1 && strs[0].length()!=0){
            return lgs+strs[0].charAt(0);
        }
        if(strs.length==1 && strs[0].length()==0){
            return lgs;
        }

        int max=1000000;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<max){
                max=strs[i].length();
            }
        }
        //System.out.println(max);
        for(int i=0;i<max;i++){
        	for(int j=0;j<strs.length-1;j++){
        		if(strs[j].charAt(i)==strs[j+1].charAt(i)){
        			
        			continue;
        		}
        		else{
        			return lgs;
        		}
        		
        	}
        	lgs=lgs+strs[0].charAt(i);
        }
		return lgs;
        
    }
	public static void main(String args[]){
		LongestPrefix l=new LongestPrefix();
		String strs[]={""};
		System.out.println(l.LongestCommonPrefix(strs));
	}
}
