package com.example.codeforces;
import java.util.*;
public class odd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,i,n,o,e;
        long a[];
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextInt();
            a=new long[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextLong();
            o=0;
            for(i=0;i<n;i++){
                if(a[i]%2==1)
                    o++;
            }
            e=n-o;
            System.out.println(Math.min(o,e));
        }
    }
}
