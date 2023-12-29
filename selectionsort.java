//import java.util.*;
public class selectionsort {
    public static void Selectionsort (int arr[]) {
        for(int i=0;i<arr.length-1;i++) {
            int minpose=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpose]<arr[j]) {
                    minpose=j;
                }
            }
            int temp=arr[minpose];
            arr[minpose]=arr[i];
            arr[i]=temp;
        }

    }
    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] ={5,4,1,3,2};
        Selectionsort(arr);
        printarr(arr);
    }
}