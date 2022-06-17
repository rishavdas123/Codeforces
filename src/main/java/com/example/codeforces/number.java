package com.example.codeforces;
import java.util.*;
public class number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,i,min;
        String n;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.next();
            if(n.length()==2){
                    System.out.println(n.charAt(1));
                    continue;
            }
            min=9;
            for(i=0;i<n.length();i++){
                if(((int)n.charAt(i)-48)<min)
                    min=((int)n.charAt(i)-48);
            }
            System.out.println(min);
        }
    }
}
