package preorderTra_tree;
class node{
	int data;
	node left;
	node right;
	node(int data){
		this.data= data;
		left= null;
		right= null;
	}
}
public class susobhan {
	public static void main(String args[]) {
		node root= new node(10);
		root.left= new node(20);
		root.right= new node(30);
		root.right.left= new node(40);
		root.right.right=new node(50); // root  left right
		preorder(root);
	}
	
	public static void preorder(node root) {
		//fist make sure that root is not null
		if(root!=null) {
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		}
	}

}
