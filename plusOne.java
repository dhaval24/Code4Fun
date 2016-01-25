package Google;

public class plusOne {
	public int[] plusOne1(int[] digits) {
        int length=digits.length-1;
        long num=0;
        for(int i=0;i<digits.length;i++){
            num=num+(digits[i]*(long)Math.pow(10,length));
            length--;
        }
        num=num+1;
        System.out.println(num);
        String numstr=""+num;
        int newDigits[]=new int[numstr.length()];
        for(int i=0;i<numstr.length();i++){
            newDigits[i]=(int)numstr.charAt(i)-'0';
        }
        return newDigits;
    }
	public static void main(String[] args) {/*
		plusOne p=new plusOne();
		int a[]={9,8,7,6,5,4,3,2,1,0};
		System.out.println(p.plusOne1(a));*/
		int a[][]=new int[3][3];
		System.out.println(a.length);
		System.out.println(a[0].length);

	}

}
