package assignment7;

public class ncr {
   
static long nCr(int n, int r)
{
    return fact(n) / (fact(r) *
                  fact(n - r));
}

static long fact(int n)
{
      if(n==0 || n==1)
      return 1;
    long res = 1;
    for (int i = 2; i <= n; i++)
        res = res * i;
    return res;
}


public static void main(String[] args)
{
    int n = 5, r = 3;
    System.out.println(nCr(n, r));
}
}

// This code is Contributed by
// Smitha Dinesh Semwal.

    
}
