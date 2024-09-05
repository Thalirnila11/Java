package assignment2;

public class SortArray {
    public static void main(String[] args) {
        int arr[]={0,1,2,0,0,2,1};
        int n=arr.length;
        int c1=0,c2=0,c3=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                c1++;
            }
            else if(arr[i]==1)
            {
                c2++;
            }
            else
            {
                c3++;
            }
        }
        int i=0;
        while(c1-->0)
        {
           arr[i++]=0;
        }
        while(c2-->0)
        {
           arr[i++]=1;
        }
        while(c3-->0)
        {
           arr[i++]=2;
        }

        for(int j=0;j<n;j++)
        {
          System.out.print(arr[j]+" ");
        }

    }
    
        
    
}