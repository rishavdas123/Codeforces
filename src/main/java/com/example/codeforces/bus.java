package com.example.codeforces;
import java.util.*;
public class bus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j;
        long n,x,y,a,b;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextLong();
            if(n%2!=0||n<4){
                System.out.println(-1);
                continue;
            }
            a=n/6;b=0;
            if(n%6==2){
                a--;
                b+=2;
            }
            else if(n%6==4)
                b++;
            x=a+b;
            System.out.print(x+" ");
            a=n/4;b=0;
            if(n%4==2){
                a--;
                b++;
            }
            y=a+b;
            System.out.println(y);
        }
    }
}
