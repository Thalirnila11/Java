package Linkedlist;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head=null;
    Node tail=null;
    void create()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the data:");
        int data=sc.nextInt();
        Node currentnode=new Node(data);
        if(head==null)
        {
            head=tail=currentnode;
        }
        else{
            tail.next=currentnode;
            tail=currentnode;
        }
    }
    void traversal_func()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
    }
    void length()
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        System.out.println(count);
    }
}

public class traversal {

    
}
