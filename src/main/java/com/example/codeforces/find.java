package com.example.codeforces;
import java.util.*;
public class find {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        long k;
        n=sc.nextInt();
        k=sc.nextLong();
        if(Math.ceil(Math.log(k)/Math.log(2))==Math.floor(Math.log(k)/Math.log(2)))
            System.out.println((int)Math.log(k)/Math.log(2)+1);
        else if(k%2==1)
            System.out.println(1);
        else if(k%4==2)
            System.out.println(2);
    }
}
