package Google;

public class BinaryTree {
	TreeNode root=null;
	public void insertNode(TreeNode root, int val){
		TreeNode prev=this.root;
		TreeNode current=this.root;
		if(this.root==null){
			TreeNode p=new TreeNode(val);
			this.root=p;
			p.left=null;
			p.right=null;
		}
		else{
			while(current!=null){
				if(val<current.value){
					prev=current;
					current=prev.left;
				}
				else{
					prev=current;
					current=prev.right;
				}
			}
			if(val<prev.value){
				TreeNode p=new TreeNode(val);
				prev.left=p;
			}
			else{
				TreeNode p=new TreeNode(val);
				prev.right=p;
			}
		}
		
		
		
	}
	public void preTraverse(TreeNode root){
		//TreeNode temp=root;
		if(root!=null){
			System.out.println(root.value);
			preTraverse(root.left);
			preTraverse(root.right);
		}
		
	}
}
