import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PreInPostOrder 
{
	//Used to create tree node
	public static class TreeNod
	{
		int data;
		TreeNod left;
		TreeNod right;

		TreeNod(int data)
		{
			this.data = data;
		}
	}
	
	//40 20 10 30 60 50 70 
	public static TreeNod createBinaryTree(int n, int[] data)
	{
		TreeNod rootNode = new TreeNod(data[0]);
		
		for(int i=1; i<data.length-1; i++)
		{
			String objString = Integer.toString(i);
			TreeNod rootNode_objString = new TreeNod(data[i]);
		}
		
		int i = 1;
		while(data.length-1 > 0)
		{
			String objString = Integer.toString(i);
			
			if(data[i] < rootNode.data)
			{
				//rootNode.left = rootNode_objString;
			}
			else
			{
				//rootNode.right = rootNode_objString;
			}
		}

		return rootNode;
	}

	//Pre-Order recursive solution

	public void preOrderTraversal(TreeNod root)
	{
		if(root != null)
		{
			System.out.print(root.data+" ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}

	public void inOrderTraversal(TreeNod root)
	{
		if(root != null)
		{
			inOrderTraversal(root.left);
			System.out.print(root.data+" ");
			inOrderTraversal(root.right);
		}
	}

	public void postOrderTraversal(TreeNod root)
	{
		if(root != null)
		{
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data+" ");
			
		}
	}

	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PreInPostOrder btp = new PreInPostOrder();
		
		System.out.println("How many nodes : ");

		int n = Integer.parseInt(br.readLine());
		
		System.out.println("Enter "+n+" nodes one by one : ");
		
		int[] nodeData = new int[n];
		
		for(int i=0; i<nodeData.length; i++)
		{
			System.out.println("Enter "+(i+1)+" node value");
			int no = Integer.parseInt(br.readLine());
			
			nodeData[i] = no;
		}
		
		TreeNod tnode = createBinaryTree(n,nodeData);

		btp.preOrderTraversal(tnode);

		System.out.println("\n");

		btp.inOrderTraversal(tnode);

		System.out.println("\n");

		btp.postOrderTraversal(tnode);
	}
}
