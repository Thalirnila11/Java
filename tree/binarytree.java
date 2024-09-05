package tree;

import java.util.Scanner;

class Node
{
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
class tree{
    Node root=null;
   Scanner sc=new Scanner(System.in);
   Node create()
   {
    System.out.print("enter the data: ");
    int data=sc.nextInt();
    Node newnode =new Node(data);
    if(data==-1)
    {
        return null;
    }
    newnode.left=create();
    newnode.right=create();
    return newnode;

   }
   void inorder(Node root)
   {
    if(root==null)
    {
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
   }
   void preorder(Node root)
   {
    if(root==null)
    {
        return;
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
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
}
public class binarytree {
    public static void main(String[] args) {
        tree obj=new tree();
        Node root=obj.create();
        obj.inorder(root);
        System.out.println("");
        obj.preorder(root);
        System.out.println("");
        obj.postorder(root);
    }
    
}
