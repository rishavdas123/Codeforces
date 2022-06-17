package com.example.codeforces;
import java.util.*;
public class lecture {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,j,k,i,a[],b[];
        long sum,max,s;
        n=sc.nextInt();
        k=sc.nextInt();
        a=new int[n];
        b=new int[n];
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(i=0;i<n;i++)
            b[i]=sc.nextInt();
        sum=max=0;
        for(i=0;i<n;i++){
            if(b[i]==1)
                sum+=a[i];
        }
        for(i=0;i<=n-k;i++){
            s=0;
            for(j=i;j<i+k;j++){
                if(b[j]==0)
                    s+=a[j];
            }
            if(s>max)
                max=s;
        }
        //System.out.println(max);
        System.out.println(sum+max);
    }
}
