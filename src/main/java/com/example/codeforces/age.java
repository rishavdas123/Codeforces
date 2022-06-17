package com.example.codeforces;
import java.util.*;
public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t,j;
        long a,b,c;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            a=sc.nextLong();
            b=sc.nextLong();
            c=sc.nextLong();
            System.out.print((a+b+c)+" ");
            System.out.print((b+c)+" ");
            System.out.println((c));
        }
    }
}