package Google;

public class Series {
	
	public int nSeries(int a, int b, int n){
		
		int num=a+b;
		for(int i=1;i<n;i++){
			num=a+num+(i*2*b);
		}
		
		return num;
	}
	public static void main(String argsp[]){
		Series s=new Series();
		System.out.println(s.nSeries(1, 4, 3));
	}
}
