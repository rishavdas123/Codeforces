package com.example.codeforces;
import java.util.*;
public class duration {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,n,j,i;
        long s[],f[];
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextInt();
            s=new long[n];
            f=new long[n];
            for(i=0;i<n;i++)
                s[i]=sc.nextLong();
            for(i=0;i<n;i++)
                f[i]=sc.nextLong();
            System.out.print((f[0]-s[0])+" ");
            for(i=1;i<n;i++){
                if(s[i]<f[i-1])
                    System.out.print((f[i]-f[i-1])+" ");
                else
                    System.out.print((f[i]-s[i])+" ");
            }
            System.out.println();
        }
    }
}
