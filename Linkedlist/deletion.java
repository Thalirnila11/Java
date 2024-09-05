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
        if(head==null)
        {
            System.out.println("linedlist is empty");
        }
        else{
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the position:");
            int position=sc.nextInt();
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
    
    }


public class deletion {
    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        obj.create();
        obj.create();
        obj.create();
        
    }
}
