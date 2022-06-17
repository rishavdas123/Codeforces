package com.example.codeforces;
import java.util.*;
public class sugar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,i,n,c;
        long s,w;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextInt();
            w=sc.nextLong();
            PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
            for(i=0;i<n;i++)
                pq.add(sc.nextLong());
            s=0;c=1;
            while(pq.size()>0){

            }
            System.out.println(c);
        }
    }
}
