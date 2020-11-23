import java.util.*;
public class pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        // int arr2= arr1
        for(int i = 0 ; i<= n-k ;i++){
            int arr1[] = new int[k];
            int m = 0 ;
            for(int j = i ; j< i+k ; j++){
                arr1[m]= arr[j];
                m++; 
            }
            int z = check(arr1);
            System.out.print(z+" ");
        }
        // int u = check(arr1);
        // System.out.println(u+" ");
    }
    public static int check(int[] arr){
        for(int i = 0; i< arr.length ; i++){
            if(arr[i]<0){
                return arr[i];
            }
        }
        return 0;
    }
}
