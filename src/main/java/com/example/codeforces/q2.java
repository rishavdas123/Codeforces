package com.example.codeforces;
import java.util.*;
public class q2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,n,m,j,i,k,p,q;
        boolean f;
        String s[];
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextInt();
            m=sc.nextInt();
            s=new String[n];
            k=m;q=0;
            for(i=0;i<n;i++)
                s[i]=sc.next();
            for(i=0;i<n;i++){
                p=s[i].indexOf('R');
                if(p>=0&&p<k) {
                    k = p;
                    q=i;
                }
            }
            if(k==m){
                System.out.println("NO");
                continue;
            }
            for(i=0;i<q;i++){
                if(s[i].indexOf('R')>=0)
                    break;
            }
            if(i==q)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
