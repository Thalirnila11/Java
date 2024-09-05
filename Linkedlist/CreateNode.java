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
    void insert_at_begin()
    {
        if(head==null)
        {
            create();
        }
        else{
            Scanner sc=new Scanner(System.in);
        System.out.print("enter the data:");
        int data=sc.nextInt();
        Node currentnode=new Node(data);
        currentnode.next=head;
        head=currentnode;

        }
    }
    void insert_at_end()
    {
        if(head==null)
        {
            create();
        }
        else{
            Scanner sc=new Scanner(System.in);
        System.out.print("enter the data:");
        int data=sc.nextInt();
        Node currentnode=new Node(data);
        tail.next=currentnode;
        tail=currentnode;

        }
    }
    void insert_at_position()
    {
        if(head==null)
        {
            create();
        }
        else{
            Scanner sc=new Scanner(System.in);
        System.out.print("enter the data:");
        int data=sc.nextInt();
        int position=sc.nextInt();
        Node currentnode=new Node(data);
        int i=0;
        Node temp=head;
        while(i<position-1)
        {
           temp=temp.next;
           i++;
        }
        currentnode.next=temp.next;
        temp.next=temp;

        }
    }
}


public class CreateNode {
    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        obj.create();
        obj.create();
        obj.create();
        
    }
}
