package com.example.codeforces;
import java.util.*;
public class inverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,n,j,a[],i,c;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextInt();
            a=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            c=0;
            for(i=0;i<n-1;i++){
                if(a[i]>a[i+1]){
                    c++;
                    i++;
                }
            }
            System.out.println(c);
        }
    }
}
