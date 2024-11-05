import java.util.*;
class Problem_6
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int H=sc.nextInt();
    int M=sc.nextInt();
    int minutes=(H*60)+M;
    int total=24*60;
    int h=0;
    int m=0;
    int diff=0;
    if(minutes<total){
      diff=total-minutes;
      m=diff%60;
      h=diff/60;
      if(h>9&&m>9){
      System.out.print(h+"::"+m);}else if(h>9&&m<9){System.out.print(h+"::0"+m);}else if(h<9&&m<9){System.out.print("0"+h+"::0"+m);}else{System.out.print("0"+h+"::"+m);}
    }
    else if(total<minutes){
      diff=minutes-total;
      m=diff%60;
      h=diff/60;
      if(h>9&&m>9){
      System.out.print("-"+h+"::"+m);}else if(h>9&&m<9){System.out.print("-"+h+"::0"+m);}else if(h<9&&m<9){System.out.print("-0"+h+"::0"+m);}else{System.out.print("-0"+h+"::"+m);}
    }else{
      System.out.print("00::00");
    }
    }
  }