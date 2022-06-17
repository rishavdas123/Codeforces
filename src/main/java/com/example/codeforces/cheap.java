package com.example.codeforces;
import java.util.*;
public class cheap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,q,a[],i,j,x,y;
        long s;
        n=sc.nextInt();
        q=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(j=1;j<=q;j++){
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
            for(i=0;i<n;i++)
                pq.add(a[i]);
            x=sc.nextInt();
            y=sc.nextInt();
            Stack<Integer> st=new Stack<>();
            for(i=0;i<x;i++)
                st.push(pq.poll());
            s=0;
            for(i=0;i<y;i++)
                s+=st.pop();
            System.out.println(s);
        }
    }
}
