import java.util.Scanner;
public class longseqafterflip {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toBinaryString(n);
        int c=0,p=0,m=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
            }
            else{
                m=Math.max(m,c+p+1);
                p=c;
                c=0;
            }
        }
        System.out.println(m);
        sc.close();
    }
}