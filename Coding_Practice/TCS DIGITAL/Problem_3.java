import java.util.*;
class Problem_3
{
  static void findCommon(int N,int a,int b,int c,int d){
    int result=0;
    int p;
    int q;
    int i=0;
    int j=0;
    while(result==0 &&i<N && j<N){
      p=b+(i*a);
      q=d+(c*j);
      if(p==q){
        result=p;
        break;
      }
      else if(p>q){
        j=j+1;
      }
      else if(p<q){
        i=i+1;
      }
    }
    if(result!=0){
      System.out.println(result);
    }
    else{
      System.out.println("No same amount of fuel found");
    }
    
    return;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    findCommon(N,a,b,c,d);
  }
}