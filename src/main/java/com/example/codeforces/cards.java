package com.example.codeforces;
import java.util.*;
public class cards {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,i,a[],n,m,b[];
        long s,r;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextInt();
            a=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            m=sc.nextInt();
            b=new int[m];
            for(i=0;i<m;i++)
                b[i]=sc.nextInt();
            s=0;
            for(i=0;i<m;i++)
                s+=b[i];
            r=s%n;
            System.out.println(a[(int)r]);
        }
   }
}
