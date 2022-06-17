package com.example.codeforces;
import java.util.*;
public class sort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q,n,j,i,k,r,s;
        q=sc.nextInt();
        for(j=1;j<=q;j++){
            n=sc.nextInt();
            List<Integer> a=new ArrayList<>();
            List<Integer> b=new ArrayList<>();
            List<Integer> ll=new ArrayList<>();
            for(i=0;i<n;i++)
                a.add(sc.nextInt());
            for(i=0;i<n;i++)
                b.add(sc.nextInt());
            for(i=1;i<=n;i++){
                if(a.indexOf(i)==(i-1))
                    continue;
                r=a.indexOf(i);
                ll.add(i);
                ll.add(a.indexOf(i)+1);
                a.set(r,a.get(i-1));
                b.set(r,b.get(i-1));
                a.set(i-1,i);
                b.set(i-1,i);
            }
        }
    }
}
