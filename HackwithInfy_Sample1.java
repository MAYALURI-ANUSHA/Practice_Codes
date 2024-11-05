import java.util.*;
public class HackwithInfy_Sample1{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int E=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        if((2*sum)<E){
            System.out.println(-1);
        }
        else{
            Arrays.sort(arr);
            int e=0;
            for(int i=0;i<n;i++){
                e=e+(arr[n-i-1]);
                if(e>=E){
                    System.out.print((2*i)+1);
                    break;
                }else{
                    e=e+(arr[n-i-1]);
                    if(e>=E){
                        System.out.println((2*(i+1)));
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}