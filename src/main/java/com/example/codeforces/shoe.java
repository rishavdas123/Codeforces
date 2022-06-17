package com.example.codeforces;
import java.util.*;
public class shoe {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,n,h1,h2,h3;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            n=sc.nextInt();
            h1=h2=h3=n/3;
            if(n%3==0){
                h1++;
                h3--;
            }
            else if(n%3==1){
                h1+=2;
                h3--;
            }
            else{
                h1+=2;
                h2++;
                h3--;
            }
            System.out.println(h2+" "+h1+" "+h3);
        }
    }
}
