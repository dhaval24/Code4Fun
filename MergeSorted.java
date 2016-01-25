package Google;

public class MergeSorted {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int temp=m;
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
            	System.out.println("sdfs");
               nums1[temp]=nums1[i];
               nums1[i]=nums2[j];
               temp++;
               i++;
               j++;
               
            }
            else{
            	//nums1[temp]=nums2[j];
            	//temp++;
            	i++;
            	
            }
        }
        while(j<n){
        	nums1[temp]=nums2[j];
        	temp++;
        	j++;
        }
        int pos1=0;
        int pos2=nums1.length-1;
        while(pos1<=pos2){
        	if(nums1[pos1]>nums1[pos2]){
        		int c=nums1[pos1];
        		nums1[pos1]=nums1[pos2];
        		nums1[pos2]=c;
        		
        	}
        	pos1++;
    		pos2--;
        }
        for(int k=0;k<nums1.length;k++){
            System.out.println(nums1[k]);
        }
    }

	public static void main(String args[]){
		MergeSorted m=new MergeSorted();
		int nums1[]={4,0,0,0,0,0};
		int nums2[]={1,2,3,5,6};
		m.merge(nums1, 1, nums2, 5);
	}
}
