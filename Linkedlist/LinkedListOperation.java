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
        Scanner sc=new Scanner(System.in);
        int position=sc.nextInt();
        
        if(head==null)
        {
            create();
        }
        if(position==length_func())
        {
            insert_at_end();
        }
        else{
           
        System.out.print("enter the data:");
        int data=sc.nextInt();
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
    void delete_at_begin()
    {
        if(head==null)
        {
            System.out.println("linedlist is empty");
        }
        else{
            head=head.next;

        }
    }
    void delete_at_end()
    {
        if(head==null)
        {
            System.out.println("linedlist is empty");
        }
        else{
            Node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;

        }
    }
    void delete_at_position()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the position:");
        int position=sc.nextInt();
        if(head==null)
        {
            System.out.println("linedlist is empty");
        }
        if(position==length_func())
        {
            delete_at_end();
        }
        else{
            
            int i=0;
            Node temp=head;
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
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
    }
    int length_func()
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        //System.out.println(count);
        return count;
    }
}



public class LinkedListOperation {
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
