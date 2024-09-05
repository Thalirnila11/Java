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
    
    Node tail=null;
    void create()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the data:");
        int data=sc.nextInt();
        Node currentnode=new Node(data);
        if(tail==null)
        {
            tail=currentnode;
            tail.next=tail;
        }
        else{
            currentnode.next=tail.next;
            tail.next=currentnode;
            tail=currentnode;
        }
    }
    void insert_at_begin()
    {
        if(tail==null)
        {
            create();
        }
        else{
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the data:");
        int data=sc.nextInt();
        Node currentnode=new Node(data);
        currentnode.next=tail.next;
        tail.next=currentnode;

        }
    }
    void insert_at_end()
    {
        if(tail==null)
        {
            create();
        }
        else{
            Scanner sc=new Scanner(System.in);
        System.out.print("enter the data:");
        int data=sc.nextInt();
        Node currentnode=new Node(data);
        currentnode.next=tail.next;
        tail.next=currentnode;
        tail=currentnode;

        }
    }
    void insert_at_position()
    {
        if(tail==null)
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
        Node temp=tail.next;
        while(i<position-1)
        {
           temp=temp.next;
           i++;
        }
        currentnode.next=temp.next;
        temp.next=currentnode;


        }
    }
    void delete_at_begin()
    {
        if(tail==null)
        {
            System.out.println("linedlist is empty");
        }
        else{
            tail.next=tail.next.next;

        }
    }
    void delete_at_end()
    {
        if(tail==null)
        {
            System.out.println("linedlist is empty");
        }
        else{
            Node temp=tail.next;
            while(temp.next.next!=tail.next)
            {
                temp=temp.next;
            }
            temp.next=tail.next;
            tail=temp;

        }
    }
    void delete_at_position()
    {
        if(tail==null)
        {
            System.out.println("linedlist is empty");
        }
        else{
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the position:");
            int position=sc.nextInt();
            int i=0;
            Node temp=tail.next;
            while(i<position-1)
            {
                temp=temp.next;
                i++;
            }
            temp.next=temp.next.next;
        }
    }
    void traversal_func()
    {
        Node temp=tail.next;
        do
        {
            System.out.println(temp.data+"->");
            temp=temp.next;
        }while(temp!=tail.next);
    }
    void length_func()
    {
        Node temp=tail.next;
        int count=0;
        do
        {
            count++;
            temp=temp.next;
        }while(temp!=tail.next);
        System.out.println(count);
    }
}




public class CircularLinkedList {
    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        System.out.println("0.exit");
        System.out.println("1.create a node");
        System.out.println("2.insert at beginning");
        System.out.println("3.insert at end");
        System.out.println("4.insert at position");
        System.out.println("5.delete at beginning");
        System.out.println("6.delete at end");
        System.out.println("7.delete at position");
        System.out.println("8.traverse");
        System.out.println("9.length");
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
        System.out.println("enter your choice");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1: 
            obj.create();
            break;
            case 2:
            obj.insert_at_begin();
            break;
            case 3:
            obj.insert_at_end();
            break;
            case 4:
            obj.insert_at_position();
            break;
            case 5:
            obj.delete_at_begin();
            break;
            case 6:
            obj.delete_at_end();
            break;
            case 7:
            obj.delete_at_position();
            break;
            case 8:
            obj.traversal_func();
            break;
            case 9:
            obj.length_func();
            break;
            default:
            System.out.println("Invalid choice");
            
        }
    }while(ch!=0);

    }
    
}
