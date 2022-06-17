package com.example.codeforces;
import java.util.*;
public class replace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q,j;
        String s,t;
        q=sc.nextInt();
        for(j=1;j<=q;j++){
            s=sc.next();
            t=sc.next();
            if(t.indexOf('a')>=0){
                if(t.length()==1)
                    System.out.println(1);
                else
                    System.out.println(-1);
                continue;
            }
            System.out.println((long)Math.pow(2,s.length()));
        }
    }
}
