public class BinaryTree_Preorder 
{
	//Used to create tree node
	public static class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data)
		{
			this.data = data;
		}
	}

	public static TreeNode createBinaryTree()
	{
		TreeNode rootNode = new TreeNode(40);

		TreeNode node20 = new TreeNode(20);
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node60 = new TreeNode(60);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);


		rootNode.left = node20;
		rootNode.right = node60;

		node20.left = node10;
		node20.right = node30;

		node60.left = node50;
		node60.right = node70;

		return rootNode;
	}

	//Pre-Order recursive solution

	public void preOrderTraversal(TreeNode root)
	{
		if(root != null)
		{
			System.out.print(root.data+" ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}

	public void inOrderTraversal(TreeNode root)
	{
		if(root != null)
		{
			inOrderTraversal(root.left);
			System.out.print(root.data+" ");
			inOrderTraversal(root.right);
		}
	}

	public void postOrderTraversal(TreeNode root)
	{
		if(root != null)
		{
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data+" ");
			
		}
	}

	public static void main(String[] args)
	{
		TreeNode tnode = createBinaryTree();
		BinaryTree_Preorder btp = new BinaryTree_Preorder();

		btp.preOrderTraversal(tnode);

		System.out.println("\n");

		btp.inOrderTraversal(tnode);

		System.out.println("\n");

		btp.postOrderTraversal(tnode);
	}
}
