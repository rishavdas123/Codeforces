package com.example.codeforces;
import java.util.*;
public class machine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s;
        int c=1,i,k=0;
        s=sc.next();
        if(s.indexOf('m')>=0||s.indexOf('w')>=0){
            System.out.println(0);
            System.exit(0);
        }
        for(i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)&&(s.charAt(i)=='n'||s.charAt(i)=='u'))
                c++;
            else{
                if(c!=1)
                k=k+c;
                c=1;
            }
        }
        if(c>1)
            k=k+c;
        if(k!=0)
        System.out.println(k);
        else
            System.out.println(1);
    }
}
