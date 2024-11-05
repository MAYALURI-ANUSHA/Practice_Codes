import java.util.Scanner;
public class BinarySearch{
    static int Binsearch(int arr[],int low,int high,int key){
        int mid=(low+high)/2;
        int n=arr.length;
        if(low<=high){
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                return Binsearch(arr,mid+1,high,key);
            }
            else if(arr[mid]>key){
                return Binsearch(arr,low,mid-1,key);
            }
            }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println(Binsearch(arr,0,arr.length,key));
    }
}