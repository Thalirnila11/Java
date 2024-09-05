package tree;

import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class bst

{
    Node root=null;
    Node bst_tree(Node root,int value)
    {
        if (root==null)
        {
            return new Node(value);
        }
        if(value<root.data)
        {
            root.left=bst_tree(root.left, value);
        }
        if(value>root.data)
        {
            root.right=bst_tree(root.right, value);
        }
        return root;
    }
    void postorder(Node root)
   {
    if(root==null)
    {
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+" ");
   }
   Node search(Node root,int value)
   {
    if(root.data==value||root==null)
    {
        return root;
    }
    if(value<root.data)
    {
          return search(root.left, value);
    }
    else{
        return search(root.right, value);
    }
   }
}
public class BinarySearchTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        bst obj=new bst();
        Node root=null;
        for(int i:arr)
        {
            root=obj.bst_tree(root, i);
        }
        obj.postorder(root);
        System.out.print("enter target data: ");
        int target=sc.nextInt();
        Node val=obj.search(root,target);
        if(val==null)
        {
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
    
}
