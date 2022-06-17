package com.example.codeforces;
import java.util.*;
public class dict {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,a;
        String s;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            s=sc.next();
            a=(int)s.charAt(0)-97;
            a=a*25;
            a=a+(int)s.charAt(1)-96;
            if(s.charAt(1)>s.charAt(0))
                a--;
            System.out.println(a);
        }
    }
}
