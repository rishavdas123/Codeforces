package com.example.codeforces;
import java.util.*;
public class beauty {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,i,k;
        String s,q,w;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            s=sc.next();
            Set<Character> s1=new HashSet<>();
            Set<Character> s2=new HashSet<>();
            for(i=0;i<s.length();i++)
                s1.add(s.charAt(i));
            for(i=0;i<s.length();i++){
                if(s.lastIndexOf(s.charAt(i))!=i){
                    w=s.substring(i+1);
                    for(k=0;k<=w.indexOf(s.charAt(i));k++)
                        s2.add(w.charAt(k));
                    if(s1.size()!=s2.size())
                        break;
                    s2.clear();
                }
            }
            if(i==s.length())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
