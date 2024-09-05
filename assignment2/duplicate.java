package assignment2;

public class duplicate {
    public static void main(String[] args) {
        int []arr={1,23,4,1,7};
        int i,j,k=0,n=arr.length;
        int [] temp=new int[n];
        for(i=0;i<n;i++){
            boolean flag=false;
            for(j=0;j<k;j++)
            {
                if(arr[i]==temp[j])
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)
            {
                temp[k]=arr[i];
                k++;
            }
        
        }
        for(i=0;i<k;i++)
        {
    
            System.out.println(temp[i]);
        }
        
    
}
    
}
