package Google;

public class MoveZeros {
	public void moveZeroes(int[] nums) {
        int pos1, pos2;
        int flag=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                pos1=i;
                i++;
                while(i<nums.length && nums[i]==0){
                    
                    i++;
                }
                	if(i<nums.length){
                    pos2=i;
                    swap(nums,pos1,pos2);
                    flag=0;
                    i=0;
                	}
                
                
            }
        }
        for(int i=0;i<nums.length;i++){
        	System.out.println(nums[i]);
        }
    }
    public void swap(int[] nums, int pos1, int pos2){
    	System.out.println("hwehew");
        int temp=nums[pos1];
        nums[pos1]=nums[pos2];
        nums[pos2]=temp;
    }
    public static void main(String args[]){
    	MoveZeros m=new MoveZeros();
    	int a[]={2,0,3,0,5};
    	m.moveZeroes(a);
    }
}
