package com.example.codeforces;
import java.util.*;
public class wow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s,w="";
        int i,j,k,p;
        long c=0;
        s=sc.next();
        for(i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='v') {
                if(s.charAt(i+1)=='v')
                w=w+'w';
            }
            else
                w=w+s.charAt(i);
        }
        for(i=0;i<w.length();i++){
            if(w.charAt(i)!='w')
                continue;
            p=1;
            if(w.substring(i+1).indexOf('o')>=0)
            for(j=w.substring(i+1).indexOf('o')+1;j<w.substring(i+1).length();j++){
                if(w.substring(i+1).charAt(j)=='w')
                    c=c+p;
                else
                    p++;
            }
        }
        //System.out.println(w);
        System.out.println(c);
    }
}
