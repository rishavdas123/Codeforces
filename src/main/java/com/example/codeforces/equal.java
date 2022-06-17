package com.example.codeforces;
import java.util.*;
public class equal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,n,i;
        long a[],b[],d;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextInt();
            a=new long[n];
            b=new long[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextLong();
            for(i=0;i<n;i++)
                b[i]=sc.nextLong();
            for(i=0;i<n;i++){
                if(a[i]<b[i])
                    break;
            }
            if(i!=n){
                System.out.println("NO");
                continue;
            }
            i=0;
            while(i<n&&b[i]==0){
                i++;
            }
            if(i==n){
                System.out.println("YES");
                continue;
            }
            d=a[i]-b[i];
            for(;i<n;i++){
                if(b[i]==0)
                    continue;
                if((a[i]-b[i])!=d)
                    break;
            }
            if(i!=n){
                System.out.println("NO");
                continue;
            }
            for(i=0;i<n;i++){
                if(b[i]!=0)
                    continue;
                if((a[i]-b[i])>d)
                    break;
            }
            if(i==n)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
