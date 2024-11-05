import java.util.*;
class Linearsearch{
    public static int search(int arr[],int N,int X){
        for (int i=0;i<N;i++){
            if (arr[i]==X)
                return i;
            }
            return -1;
        }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int X =sc.nextInt();
    int result = search(arr, arr.length, X);
    if (result==-1){
        System.out.println("null");
    }else{
        System.out.println(result);
    }
    sc.close();
} 
}