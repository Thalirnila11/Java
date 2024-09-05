package assignment4;
import java.util.*;
public class n_th {
 static void solution(int arr[], int n, int k) {
  Arrays.sort(arr);

  for (int i = 0; i < n;) {

    int cnt = 1;

    while ((i + 1) < n && arr[i] == arr[i + 1]) {

      cnt++;

      i++;
    }

    if (cnt > (n / k)) {

      System.out.print(arr[i]+" ");
    }
    i++;
  }
}
public static void main(String args[]) {
  
  int n=8, k=4;
  
  int arr[]={3,1,2,2,1,2,3,3};
  
  solution(arr, n, k);
} 
}
    

