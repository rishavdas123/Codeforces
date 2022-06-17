package com.example.codeforces;
import java.util.*;
public class lex {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,n,m,i,k,c1,c2;
        String a,b,s;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextInt();
            m=sc.nextInt();
            k=sc.nextInt();
            a=sc.next();
            b=sc.next();
            PriorityQueue<Character> pq1=new PriorityQueue<>();
            PriorityQueue<Character> pq2=new PriorityQueue<>();
            for(i=0;i<n;i++)
                pq1.add(a.charAt(i));
            for(i=0;i<m;i++)
                pq2.add(b.charAt(i));
            c1=c2=0;
            s="";
            while(pq1.size()>0&&pq2.size()>0){
                if(pq1.peek()<=pq2.peek()){
                    if(c1<k) {
                        s=s+pq1.poll();
                        c1++;
                        c2=0;
                    }
                    else{
                        s=s+pq2.poll();
                        c2++;
                        c1=0;
                    }
                }
                else{
                    if(c2<k){
                        s=s+pq2.poll();
                        c2++;
                        c1=0;
                    }
                    else{
                        s=s+pq1.poll();
                        c1++;
                        c2=0;
                    }
                }
            }
            System.out.println(s);
        }
    }
}
