import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> arr=new ArrayList<Integer>();
    int t=2;
    while(t!=0){
      int n=sc.nextInt();
      while(n>0){
        arr.add(sc.nextInt());
        n--;
  }
      t--;
}
    Collections.sort(arr);
    for(int i:arr)
      System.out.print(i+"->");
    System.out.print("NULL");
  }
}
