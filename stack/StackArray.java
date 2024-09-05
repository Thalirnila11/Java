package stack;

import java.util.Scanner;

class stack{
    Scanner sc=new Scanner(System.in);
    //System.out.print("enter the size of th stack: ");
    int n=sc.nextInt();
    int top=-1;
    int stack[]=new int[n];
    void push()
    {
        if(top==n-1)
        {
            System.out.println("stack overflow");
        }
        else
        {
            if(top<n)
            {
                System.out.print("enter the data: ");
                int data=sc.nextInt();
                top++;
                stack[top]=data;
            }
        }
    }
    void pop()
    {
        if (top==-1)
        {
            System.out.println("stack underflow");
        }
        else{
            top--;
        }
    }
    void display()
    {
        if (top==-1)
        {
            System.out.println("stack underflow");
        }
        else{
          
            for(int i=top;i>=0;i--)
            {
                System.out.print(stack[i]+"");
            }
        }
    }
    void peek()
    {
        if (top==-1)
        {
            System.out.println("stack underflow");
        }
        else{
          
          System.out.println(stack[top]);
        }
    }
}

public class StackArray {
    public static void main(String[] args) {
        stack obj=new stack();
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
