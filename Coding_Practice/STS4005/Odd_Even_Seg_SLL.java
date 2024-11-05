//This code is used to segregate odd & even nodes in a SLL
//20-02-2024
import java.util.*;
public class Odd_Even_Seg_SLL {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int n=sc.nextInt();
        while(n>=0){
            arr.add(n);
            n=sc.nextInt();
        }
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)%2==0){
                even.add(arr.get(i));
            }
            else{
                odd.add(arr.get(i));
            }
        }
        even.addAll(odd);
        System.out.println("Elements after arranging even numbers first and odd numbers later");
        for(int num:even){
            System.out.print(num+" ");
        }
    }
}
