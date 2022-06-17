package com.example.codeforces;
import java.util.*;
public class Hello {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,s1,s2,j,i,n;
        long k,d;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextInt();
            k=sc.nextLong();
            s1=(int)Math.ceil((Math.sqrt(1+8*k)-1)/2);
            s2=(int)Math.floor((Math.sqrt(1+8*k)-1)/2);
            d=k-((long)s2*((long)s2+1))/2;
            if(d==0)
                d=s1;
            for(i=1;i<=n;i++){
                if(i==n-s1||i==n+1-(int)d)
                    System.out.print('b');
                else
                    System.out.print('a');
            }
            System.out.println();
        }
    }
}
