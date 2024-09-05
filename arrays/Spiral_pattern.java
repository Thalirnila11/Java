package arrays;

import java.util.Scanner;

public class Spiral_pattern {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int spiral[][]=new int[n][n];
        int data=1;
        int LRstart=0,LRend=n-1,LRpillar=0;
        int TBstart=1,TBend=n-1,TBpillar=n-1;
        int RLstart=n-2,RLend=0,RLpillar=n-1;
        int BTstart=n-2,BTend=1,BTpillar=0;
        for(int j=0;j<=2;j++)
        {
            for(int i=LRstart;i<=LRend;i++)
            {
                spiral[LRpillar][i]=data;
                data++;
            }
            for(int i=TBstart;i<=TBend;i++)
            {
                spiral[i][TBpillar]=data;
                data++;
            }
            for(int i=RLstart;i>=RLend;i--)
            {
                spiral[RLpillar][i]=data;
                data++;
            }
            for(int i=BTstart;i>=BTend;i--)
            {
                spiral[i][BTpillar]=data;
                data++;
            }
            LRstart++;LRend--;LRpillar++;
            TBstart++;TBend--;TBpillar--;
            RLstart--;RLend++;RLpillar--;
            BTstart--;BTend++;BTpillar++;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("%02d ",spiral[i][j]);
            }
            System.out.println();
        }
    }
}
    

