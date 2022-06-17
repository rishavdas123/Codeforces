package com.example.codeforces;
import java.util.*;
public class power {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,n,i,c;
        long a[];
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            c=0;
            n=sc.nextInt();
            a=new long[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextLong();
            for(i=0;i<n;i++){
                if(a[i]%2==0)
                    c++;
            }
            System.out.println((int)Math.ceil(c/2.0));
        }
    }
}
