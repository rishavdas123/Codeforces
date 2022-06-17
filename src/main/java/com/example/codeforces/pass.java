package com.example.codeforces;
import java.util.*;
public class pass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i;
        long c=2,sum=0,k=0;
        n=sc.nextInt();
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(i=0;i<n;i++)
            pq.add(sc.nextLong());
        while(pq.size()>0) {
            sum+=pq.peek()*(c++);
            k=pq.poll();
        }
        sum-=k;
        System.out.println(sum);
    }
}
