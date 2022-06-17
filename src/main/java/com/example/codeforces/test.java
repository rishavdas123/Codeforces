package com.example.codeforces;
import java.util.*;
public class test {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q,j,n,i,c;
        String s,t,w;
        q=sc.nextInt();
        for(j=1;j<=q;j++) {
            n=sc.nextInt();
            s=sc.next();
            c=1;
            t="";w="";
            for(i=0;i<n;i++) {
                if(s.charAt(i)=='1')
                    break;
                if(s.charAt(i)=='2') {
                    t=t+'1';
                    w=w+'1';
                } else {
                    t=t+'0';
                    w=w+'0';
                }
            }
            for (;i<n;i++) {
                if(s.charAt(i)=='1') {
                    if(c==1){
                        t=t+'1';
                        w=w+'0';
                    }
                    else {
                        t=t+'0';
                        w=w+'1';
                    }
                    c++;
                }
                else if(s.charAt(i)=='0') {
                    t=t+'0';
                    w=w+'0';
                } else {
                    t=t+'0';
                    w=w+'2';
                }
            }
            System.out.println(t);
            System.out.println(w);
        }
    }
}
