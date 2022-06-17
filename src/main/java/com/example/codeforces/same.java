package com.example.codeforces;
import java.util.*;
public class same {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,n,j,i,s,k,r=0;
        t=sc.nextInt();
        for(j=1;j<=t;j++) {
            n = sc.nextInt();
            k = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (i = 0; i < n; i++)
                pq.add(sc.nextInt());
            s = 0;
            if (n % 2 == 1) {
                for (i = 0; i < n; i++) {
                    if (i == n / 2) {
                        k = pq.poll();
                        continue;
                    }
                    s += pq.poll();
                }
                if ((double) k == s / (double) (n - 1))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else {
                for (i = 0; i < n; i++) {
                    if (i == n / 2)
                        k = pq.peek();
                    else if (i == n / 2 - 1)
                        r = pq.peek();
                    s += pq.poll();
                }
                if ((double) k == (s - k) / (double) (n - 1))
                    System.out.println("YES");
                else if ((double) r == (s - r) / (double) (n - 1))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
