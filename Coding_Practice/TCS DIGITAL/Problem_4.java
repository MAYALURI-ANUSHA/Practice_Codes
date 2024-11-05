import java.util.*;
class Problem_4
{
  static int findN(int N,int arr[]){
    int arr1[]=new int[N];
    for(int i=0;i<N;i++){
      arr1[i]=i;
    }
    int arr2[]=new int[N];
    int result=0;
    int flag=0;
    while(flag==0){
      for(int i=0;i<N;i++){
        arr2[arr[i]]=arr1[i];
      }
      result=result+1;
      int c=0;
      for(int i=0;i<N;i++){
        if(arr2[i]==i){
            c=c+1;
        }
      }
      if(c==N){
        flag=1;
        return result;
      }
      else{
        for(int i=0;i<N;i++){
            arr1[i]=arr2[i];
        }
      }
    }
    return 0;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int arr[]=new int[N];
    for(int i=0;i<N;i++){
      arr[i]=sc.nextInt()-1;
    }
    System.out.println(findN(N,arr));
    
  }
}