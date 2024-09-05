package Linkedlist;

import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node prev;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class Linkedlist
{
    Node head=null;
    Node tail=null;
    void create()
    {
    Scanner sc=new Scanner(System.in);
    int data=sc.nextInt();
    Node newnode =new Node(data);
    if(head==null)
    {
        head=tail=newnode;
    }
    else
   {
    tail.next=newnode;
    newnode.prev=tail;
    tail=newnode;
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
    int data=sc.nextInt();
    Node newnode =new Node(data);
    newnode.next=head;
    head.prev=newnode;
    head=newnode;

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
    int data=sc.nextInt();
    Node newnode =new Node(data);
   tail.next=newnode;
   newnode.prev=tail;
   tail=newnode;

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
    System.out.println("enter the data");
    int data=sc.nextInt();
    System.out.println("enter the position");
    int position=sc.nextInt();
    Node newnode =new Node(data);
    int i=1;
    Node temp=head;
    while(i<position-1)
    {
        temp=temp.next;
        i++;
    }
   temp.next.prev=newnode;
   newnode.next=temp.next;
   temp.next=newnode;
   newnode.prev=temp;

    }
  }
  void delete_at_begin()
  {
    if(head==null)
    {
        System.out.println("LinkedList is empty");
    }
    else{
        head=head.next;
        head.prev=null;
    }
  }
  void delete_at_end()
  {
    if(head==null)
    {
        System.out.println("LinkedList is empty");
    }
    else
    {
        tail=tail.prev;
        tail.next=null;
    }
  }
  void delete_at_position()
  {
    if(head==null)
    {
        System.out.println("LinkedList is empty");
    }
    else{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the position");
        int position=sc.nextInt();
        int i=1;
        Node temp=head;
        if(position==1)
        {
           delete_at_begin();
        }
        else if(position==length_func())
        {
            delete_at_end();
        }
        else{
        while(i<position-1)
        {
           temp=temp.next;
           i++;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
        }
    }
  }
  void traversal()
  {
    Node temp=head;
    while(temp.next!=null)

    {
        System.out.println(temp.data+"->");
        temp=temp.next;
    }
  }
  int length_func()
  {
    Node temp=head;
    int count=0;
    while(temp.next!=null)

    {
       count++;
        temp=temp.next;
    }
    return count;
  }
}
public class doublelinkedlist {
    
}
