package com.example.codeforces;
import java.util.*;
public class alice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,i,n,m;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextInt();
            PriorityQueue<Integer> pq1=new PriorityQueue<>(Collections.reverseOrder());
            for(i=0;i<n;i++)
                pq1.add(sc.nextInt());
            m=sc.nextInt();
            PriorityQueue<Integer> pq2=new PriorityQueue<>(Collections.reverseOrder());
            for(i=0;i<m;i++)
                pq2.add(sc.nextInt());
            if(pq1.peek()>pq2.peek()){
                System.out.println("Alice");
                System.out.println("Alice");
            }
            else if(pq1.peek()<pq2.peek()){
                System.out.println("Bob");
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
                System.out.println("Bob");
            }
        }
    }
}
