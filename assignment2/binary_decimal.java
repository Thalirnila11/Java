package assignment2;

public class binary_decimal {
    public static void main(String[] args) {
        int num=10101001;
        int decimal=0;
        int base=1;
        int temp=num;
        while(temp>0)
        {
            int last=temp%10;
            temp=temp/10;
            decimal+=last*base;
            base=base*2;
        }
        System.out.println(decimal);
    }
    
}
