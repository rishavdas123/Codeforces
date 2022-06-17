package com.example.codeforces;
import java.util.*;
public class div3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,x,y,j,d,i;
        double k;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            x=sc.nextInt();
            y=sc.nextInt();
            if(y%x!=0){
                System.out.println(0+" "+0);
                continue;
            }
            d=y/x;
            System.out.println(1+" "+d);
        }
    }
}
