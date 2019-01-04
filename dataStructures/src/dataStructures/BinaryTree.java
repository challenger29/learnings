package dataStructures;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	Node root;
	HashMap<Integer , Integer> diagSum = new HashMap<>();

	public BinaryTree(Node root) {
		this.root = root;
	}

	public BinaryTree() {
		this.root=null;
	}
	
	public void add(int value){
		this.root = this.addRecursive(this.root,value);
	}
	public Node addRecursive(Node current,int value){
		if(current == null){
			return new Node(value);
		}
		if(current.value > value){
			current.left = this.addRecursive(current.left, value);
		}
		else{
			current.right = this.addRecursive(current.right, value);
		}
		return current;
	}
	public BinaryTree createBinaryTree(){
		BinaryTree bt = new BinaryTree();
		bt.add(15);
		bt.add(10);
		bt.add(25);
		bt.add(8);
		bt.add(12);
		bt.add(20);
		bt.add(30);
		bt.add(6);
		bt.add(9);
		bt.add(18);
		bt.add(22);

		return bt;
	}
	public void preorder(){
		if (root ==null){
			System.out.println("Empty tree");
		}
		Queue<Node> q = new LinkedList<>();
	}
	
	void printInorder(Node temp){
		if(temp == null)
			return;
		if(temp.left != null) 
			printInorder(temp.left);
		System.out.print(temp.value+"\t");
		if(temp.right != null)
			printInorder(temp.right);
		
	}
	int maxWidth(Node root){
		if (root == null)
			return 0;
		int maxWidth = 0;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			int count = q.size();
			maxWidth = Math.max(maxWidth, count);
			while(count > 0){
				Node temp = q.poll();
				if(temp.left != null) q.add(temp.left);
				if(temp.right != null) q.add(temp.right);
				count--;
			}
		}
		
		return maxWidth;
	}
	Node lca( Node current , int a , int b){
		if(a > current.value && b > current.value)
			return lca(current.right, a , b);
		if( a < current.value && b< current.value)
			return lca(current.left , a, b);
		return current;
	}
	
	
	void printCousin(int n){
		Queue<Node>  q = new LinkedList<>();
		if(this.root == null)
			return;
		q.add(this.root);
		while(!q.isEmpty()){
			int size = q.size();
			while(size>0){
				size-- ;
				Node temp = q.poll();
				if(temp.left != null && temp.right != null && (temp.left.value == n || temp.right.value == n)){
					break;
				}
				else{
					q.add(temp.left);
					q.add(temp.right);
				}
			}
		}
		System.out.println("Cousins of "+n +"are: " + q.toString());
	}
	
	
//	void correctBSTUtil(Node current  ,  Node first , Node last , Node middle , Node prev){
//		if ( current != null){
//			if(prev != )
//		}
//		
//	}
//	void correctBST(Node root){
//		Node first , last , middle , prev = null;
//		correctBSTUtil(root , first , last , middle , null);
//		if(first != null && last != null){
//			int temp = first.value;
//            first.value = last.value;
//            last.value = temp; 
//		}
//		else if ( first != null && middle != null){
//			int temp = first.value;
//            first.value = middle.value;
//            middle.value = temp; 
//
//		}
//	}
	
	
	int rankOfElement(Node root , int[] arr){
		if(root == null)
			return 0;
//		if(root.value == x) return root.leftSize;
		return 0;
	}
	
	
	void computeDiagSum(Node root , int currDiag ){
		if(root == null)
			return;
		computeDiagSum(root.left , currDiag+1 );
		int prevSum = 0;
		if(diagSum.get(currDiag) != null){
			prevSum = diagSum.get(currDiag);
		}
		diagSum.put(currDiag , prevSum + root.value);
		computeDiagSum(root.right, currDiag);
	}
	
	
    public static void main(String[] args) {
    	BinaryTree bt = new BinaryTree();
    	bt = bt.createBinaryTree();
//    	bt.printInorder(bt.root);
//    	System.out.println(bt.maxWidth(bt.root));
//    	System.out.println("LCA 6 - 12 ==== "+bt.lca(bt.root , 6,12).value);
//    	System.out.println("LCA 20- 6 ==== "+bt.lca(bt.root , 20,6).value);
//    	bt.printCousin(20);
    	bt.computeDiagSum(bt.root , 0);
    	System.out.println(bt.diagSum.toString());
    	
//    	String[] arr = {"i" ,"camee","i","saw","left"};
//        Set<String> uniques = new HashSet<String>();
//        Set<String> dups    = new HashSet<String>();
//
//        for (String a : arr)
//            if (!uniques.add(a))
//                dups.add(a);
//
//        // Destructive set-difference
//        uniques.removeAll(dups);
//
//        System.out.println("Unique words:    " + uniques);
//        System.out.println("Duplicate words: " + dups);
    }

}
