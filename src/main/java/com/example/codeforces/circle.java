package com.example.codeforces;
import java.util.*;
public class circle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,i,n,p,q;
        long a[],b[];
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextInt();
            a=new long[n];
            b=new long[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextLong();
            PriorityQueue<Long> p1=new PriorityQueue<>();
            PriorityQueue<Long> p2=new PriorityQueue<>(Collections.reverseOrder());
            for(i=0;i<n;i++){
                p1.add(a[i]);
                p2.add(a[i]);
            }
            for(i=0;i<n;i++){
                if(i%2==0)
                    b[i]=p1.poll();
                else
                    b[i]=p2.poll();
            }
            for(i=0;i<n;i++){
                if(i==0){
                    p=n-1;
                    q=1;
                }
                else if(i==(n-1)){
                    p=n-2;
                    q=0;
                }
                else{
                    p=i-1;
                    q=i+1;
                }
                if((b[i]<b[p]&&b[i]<b[q])||(b[i]>b[p]&&b[i]>b[q]))
                    continue;
                break;
            }
            if(i!=n)
                System.out.println("NO");
            else{
                System.out.println("YES");
                for(i=0;i<n;i++)
                    System.out.print(b[i]+" ");
                System.out.println();
            }
        }
    }
}
