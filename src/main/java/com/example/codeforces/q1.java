package com.example.codeforces;
import java.util.*;
public class q1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,l1,r1,l2,r2,s;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            l1=sc.nextInt();
            r1=sc.nextInt();
            l2=sc.nextInt();
            r2=sc.nextInt();
            if(l1<=l2){
                if(r1<l2)
                    s=r1+l2;
                else
                    s=l2;
            }
            else{
                if(r2<l1)
                    s=l1+r2;
                else
                    s=l1;
            }
            System.out.println(s);
        }
    }
}
