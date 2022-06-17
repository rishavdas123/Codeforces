package com.example.codeforces;
import java.util.*;
public class stone {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,n,i;
        long s;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextInt();
            List<Long> a=new ArrayList<>();
            for(i=0;i<n;i++)
                a.add(sc.nextLong());
            a.remove(0);
            a.remove(a.size()-1);
            if((a.size()==1&&a.get(0)%2==1)||(a.indexOf((long)1)>=0)){
                System.out.println(-1);
                continue;
            }
            s=0;
            for(i=0;i<a.size();i++)
                s+=(a.get(i)+1)/2;
            System.out.println(s);
        }
    }
}
