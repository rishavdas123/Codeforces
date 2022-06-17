package com.example.codeforces;
import java.util.*;
public class brac {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,i;
        String s;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            s=sc.next();
            Stack<Character> st=new Stack<>();
            for(i=0;i<s.length();i++){
                if(s.charAt(i)=='(')
                    st.push('(');
                else if(s.charAt(i)==')'){
                    if(!st.isEmpty()&&st.peek()=='(')
                        st.pop();
                    else
                        st.push(')');
                }
                else{
                    if(st.isEmpty())
                        st.push('(');
                    else if(st.peek()=='(')
                        st.pop();
                    else
                        st.push('(');
                }
            }
            if(st.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
