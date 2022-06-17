package com.example.codeforces;
import java.util.*;
public class gfg {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n,k,m,l,u;
        n=sc.nextLong();
        k=sc.nextLong();
        l=1;
        u=(long)Math.pow(2,n)-1;
        while(true){
            m=(l+u)/2;
            if(k<m)
                u=m-1;
            else if(k>m)
                l=m+1;
            else
                break;
            n--;
        }
        System.out.println(n);
    }
}
