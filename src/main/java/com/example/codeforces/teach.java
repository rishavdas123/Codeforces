package com.example.codeforces;
import java.util.*;
public class teach {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,x,i;
        long s=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        n=sc.nextInt();
        x=sc.nextInt();

        for(i=0;i<n;i++)
            pq.add(sc.nextInt());
        i=0;
        while(pq.size()>0){
            s+=pq.poll()*Math.max(x-i,1);
            i++;
        }
        System.out.println(s);
    }
}
