package queue;

import java.util.Scanner;

class queueclass{
    int n=4;
    int front=-1,rear=-1;
    int queue[]=new int[n];
    void enqueue()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the data:");
        int data=sc.nextInt();
        if(front==-1&&rear==-1)
        {
            front++;
            rear++;
            queue[rear]=data;
        }
        if(rear<n)
        {
            rear++;
            queue[rear]=data;
           
        }
        
    }
    void dequeue()
    {
        if(front==-1&&rear==-1)
        {
            System.out.println("queue is empty");
        }
        else{
            for(int i=front;i<rear;i++)
            {
                queue[i]=queue[i+1];
            }
            rear--;
        }
    }
    void display()
    {
        if(front==-1&&rear==-1)
        {
            System.out.println("queue is empty");
        }
        else{
            for(int i=front;i<rear;i++)
            {
                System.out.print(queue[i]+" ");
            }
           
        } 
    }
}

public class QueueArray {
    public static void main(String[] args) {
        queueclass obj=new queueclass();
        obj.enqueue();
        obj.enqueue();
        obj.enqueue();
        obj.dequeue();
        obj.display();
        
    }
    
}
