import java.util.*;
public class Longest_Sequence{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int length[]=new int[n];
    for(int i=0;i<n;i++){
      length[i]=1;
    }
    int sequence[]=new int[n];
    for(int i=0;i<n;i++){
      for(int j=0;j<i;j++){
        if(arr[j]<arr[i]){
          if((length[j]+1)>length[i]){
            length[i]=length[j]+1;
            sequence[i]=j;
          }
        }
      }
    }
    int max=0;
    for(int i=0;i<n;i++){
        if(length[i]>max){
            max=length[i];
        }
    }
    int count[]=new int[n];
   for(int i=0;i<n;i++){
    count[i]=0;
   }
   for(int i=n-1;i>0;i--){
    if(length[i]==max){
        count[i]=1;
        for(int j=1;j<i;j++){
            if(length[i-j]==max-j){
                count[i-j]=1;
            }
            else{
                break;
            }
        }
    }
   }
   int sum = Arrays.stream(count).sum();
    for(int i=0;i<n;i++){
      System.out.print(length[i]+" ");
    }
    System.out.println();
    for(int i=0;i<n;i++){
      System.out.print(sequence[i]+" ");
    }
    System.out.println();
    for(int i=0;i<n;i++){
      System.out.print(count[i]+" ");
    }
    System.out.println();
    System.out.print(sum);
  }
}