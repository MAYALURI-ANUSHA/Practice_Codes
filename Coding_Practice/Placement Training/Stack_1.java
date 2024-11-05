import java.util.*;
import  java.lang.*;
public class Stack_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] s_char=s.toCharArray();
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s_char[i]=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.empty()){
                    st.push(i);
                    max=Math.max(max,i-st.peek());
                }
                else{
                    max=Math.max(max,i-st.peek());
                }
            }
        }
        System.out.println(max);
    }
}