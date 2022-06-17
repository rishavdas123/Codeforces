package com.example.codeforces;
import java.util.*;
public class xor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q,n,i,c,j;
        String s,w,t;
        q=sc.nextInt();
        for(j=1;j<=q;j++){
            n=sc.nextInt();
            s=sc.next();
            t=w="1";
            c=0;
            for(i=1;i<s.length();i++){
               if(s.charAt(i)=='2'){
                   if(c==0){
                       w=w+'1';
                       t=t+'1';
                   }
                   else{
                       w=w+'0';
                       t=t+'2';
                   }
               }
               else if(s.charAt(i)=='1'){
                   if(c==0){
                       w=w+'1';
                       t=t+'0';
                       c++;
                   }
                   else{
                       w=w+'0';
                       t=t+'1';
                   }
               }
               else{
                   w=w+'0';
                   t=t+'0';
               }
            }
            System.out.println(w);
            System.out.println(t);
        }
    }
}
