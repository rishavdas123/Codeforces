package com.example.codeforces;
import java.util.*;
public class walk {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,i,n,m,s,a[];
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextInt();
            m=sc.nextInt();
            a=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            s=0;
            for(i=0;i<n;i++)
                s+=a[i];
            if(s>m)
                System.out.println(s-m);
            else
                System.out.println(0);
        }
    }
}
