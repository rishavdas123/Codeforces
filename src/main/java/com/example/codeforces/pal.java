package com.example.codeforces;
import java.util.*;
public class pal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,i,k,n,c;
        String s;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextInt();
            s=sc.next();
            if(n%2==1) {
                c=1;
                i=n/2;
            }
            else {
                c=0;
                i=n/2-1;
            }
                HashSet<Character> set=new HashSet<>();
                List<Integer> ll=new ArrayList<>();
                for(;i>=0;i--){
                    set.add(s.charAt(i));
                    ll.add(0,set.size());
                }
                for(i=0;i<n/2;i++){
                    if(ll.get(i)==1)
                        c=c+2;
                }
                System.out.println(c);
        }
    }
}
