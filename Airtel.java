import java.util.*;
public class Airtel {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int n=sc.nextInt();
        boolean[] chosenarea=new boolean[l];
        for(int i=0;i<n;i++){
            int s=sc.nextInt();
            int e=sc.nextInt();
            int sum=0;
            for(int j=s;j<=e;j++){
                sum=sum+j;
                chosenarea[j]=true;
            }
            while(s>=0&&chosenarea[s]){
                s--;
            }
            if(s!=-1){
                sum=sum+s;
                chosenarea[s]=true;
            }
            while(e<l&&chosenarea[e]){
                e++;
            }
            if(e!=l){
                sum=sum+e;
                chosenarea[e]=true;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
