import java.util.Scanner;
public class Problem_1{
    static int factorial(int a){
        int k=1;
        for(int i=1;i<=a;i++){
            k=k*i;
        }
        return k;
    }
    static int Combination(int a,int b){
        int c=(factorial(a)/(factorial(a-b)*factorial(b)));
        return c;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int P=sc.nextInt();
        int E=sc.nextInt();
        int result=Combination(N,P)*Combination(M,E);
        System.out.println(result);
    }
}