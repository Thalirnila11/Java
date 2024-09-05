package stack;

import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}     
class stacklink
{
    Node top=null;
    void push()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the data:");
        int data=sc.nextInt();
        Node currentnode=new Node(data);
        currentnode.next=top;
        top=currentnode;
        }
    
    void pop()
    {
        if(top==null)
        {
            System.out.println("stack is empty");
        }
        else{
           top=top.next;
        }
    }
    void display()
    {
        if (top == null) {
            System.out.println("Stack is empty");
        } 
        else {
        Node temp=top;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    }
    void peek(){
        if (top == null) {
            System.out.println("Stack is empty");
        } 
        else {
        System.out.println(top.data);
        }
    }

}

public class stacklinkedlist {
    public static void main(String[] args) {
        stacklink obj=new stacklink();
        obj.push();
        obj.push();
        obj.push();
        obj.push();
        obj.display();
        obj.peek();
        obj.pop();
        obj.display();
    }
    
}
