package com.example.codeforces;
import java.util.*;
public class easy {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,n,i,c,k;
        String s;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextInt();
            s=sc.next();
            k=0;
            c=1;
            for(i=1;i<n;i++){
                if(s.charAt(i)==s.charAt(i-1))
                    c++;
                else {
                    if (c%2==1){
                        s=s.substring(0,i-1)+s.charAt(i)+s.substring(i);
                        c=2;
                    k++;
                    }
                    else
                        c=1;
                }
            }
            c=0;
            for(i=1;i<s.length();i++){
                if(s.charAt(i)!=s.charAt(i-1))
                    c++;
            }
            System.out.println(k+" "+c);
        }
    }
}
