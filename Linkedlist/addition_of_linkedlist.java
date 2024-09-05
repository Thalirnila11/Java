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

  void add(LinkedList l1,LinkedList l2) {
       
        Node temp1=l1.head;
        Node temp2=l2.head;
       int carry=0;
        while(temp1!=null||temp2!=null)

        {
            int sum=carry;
            if(temp1!=null)
            {
               sum+=temp1.data;
               temp1=temp1.next;
            }
            if(temp2!=null)
            {
               sum+=temp2.data;
               temp2=temp2.next;
            }
            Node newnode=new Node(sum%10);
            carry=sum/10;
            if(head==null)
            {
                head=tail=newnode;
            }
            else{
            tail.next=newnode;
            tail=newnode;
            }
        }
        if(carry>0)
        {
            Node newnode=new Node(carry);
            tail.next=newnode;
            tail=newnode;
        }
       
    }
    void traversal()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
    }
    
}
public class addition_of_linkedlist {
    public static void main(String[] args) {
        LinkedList list1=new LinkedList();
        System.out.println("LINKEDLIST 1");
        list1.create();
        list1.create();
        list1.create();
        LinkedList list2=new LinkedList();
        System.out.println("LINKEDLIST 2");
        list2.create();
        list2.create();
        list2.create();
        LinkedList list3=new LinkedList();
        System.out.println("RESULTANT LINKEDLIST");
        list3.add(list1, list2);
        list3.traversal();
    }
}
