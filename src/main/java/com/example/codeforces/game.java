package com.example.codeforces;
import java.util.*;
public class game {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,j,i;
        long sum;
        String s;
        t=sc.nextInt();
        for(j=1;j<=t;j++){
            s=sc.next();
            if(s.length()%2==0){
               sum=0;
               System.out.print("Alice ");
               for(i=0;i<s.length();i++)
                   sum=sum+(int)s.charAt(i)-96;
               System.out.println(sum);
            }
            else{
                if(s.length()==1){
                    System.out.println("Bob "+((int)s.charAt(0)-96));
                    continue;
                }
                sum=0;
                System.out.print("Alice ");
                for(i=0;i<s.length();i++)
                    sum=sum+(int)s.charAt(i)-96;
                if(s.charAt(0)>=s.charAt(s.length()-1))
                    System.out.println(sum-2*((int)s.charAt(i-1)-96));
                else
                    System.out.println(sum-2*((int)s.charAt(0)-96));
            }
        }
    }
}
