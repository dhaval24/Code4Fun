package Google;
import java.util.ArrayList;
import java.util.List;
public class OptimizedRange {
	 ArrayList<Integer> l=new ArrayList<Integer>();
	 public void set(){
		 l.add(2);
		 l.add(6);
		 l.add(3);
		 l.add(5);
		 l.add(7);
		 l.add(21);
		 l.add(20);
		 l.add(21);
	 }
	 public ArrayList<Integer> delete(ArrayList<Integer>l1, int pos1, int pos2){
		 l1.remove(pos1);
		 l1.remove(pos2-1);
		 return l1;
	 }
	 public void optimize(){
		 for(int i=0;i<l.size();i=i+2){
			 for(int j=i+2;j<l.size();){
				 if(l.get(j)>l.get(i)){
					 if(l.get(j+1)<=l.get(i+1)){
						 l=delete(l,j,j+1);
						 
					 }
					 else{
						 j=j+2;
					 }
				 }
				 else{
					 j=j+2;
				 }
				 
			 }
		 }
	 }
	 public void traverse(){
		 for(int i=0;i<l.size();i++){
			 System.out.println(l.get(i));
		 }
	 }
	 public static void main(String args[]){
		OptimizedRange o=new OptimizedRange();
		o.set();
		o.optimize();
		o.traverse();
	 }
} 
