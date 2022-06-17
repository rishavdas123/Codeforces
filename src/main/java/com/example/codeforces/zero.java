package com.example.codeforces;
import java.util.*;
public class zero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,n,i,c,arr[];
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextInt();
            arr=new int[n];
            for(i=0;i<n;i++)
                arr[i]=sc.nextInt();
            List<Integer> a=new ArrayList<>();
            for(i=0;i<n;i++) {
                if(arr[i]!=0)
                a.add(arr[i]);
            }
            for(i=0;i<a.size();i++){
                if(a.lastIndexOf(a.get(i))!=i)
                    break;
            }
            if(a.size()<n)
                System.out.println(a.size());
            else if(i!=a.size())
                System.out.println(a.size());
            else
                System.out.println(a.size()+1);
        }
    }
}
