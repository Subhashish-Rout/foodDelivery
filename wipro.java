import java.util.*;
public class wipro {
    public static void main(String[] args) {
        int arr[] = {5, 2, 4, 7, 9, 3, 1, 6, 8};
        // int k = 4;
        // int arr2[] = new int[arr.length];
        sort(arr,3,8);
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i]);
        }
    }
    static void sort(int[] a,int x , int y){
        while(x<y){
            int temp = a[x];
            a[x]= a[y];
            a[y] = temp;
            x++;
            y--;
        }
    }
}
