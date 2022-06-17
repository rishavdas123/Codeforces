package com.example.codeforces;
import java.util.*;
public class character {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q,n,i,sum,j;
        String s,t;
        q=sc.nextInt();
        for(j=1;j<=q;j++){
            n=sc.nextInt();
            s=sc.next();
            t=sc.next();
            List<Integer> ll=new ArrayList<>();
            for(i=0;i<n;i++){
                if(s.charAt(i)!='0'&&t.charAt(i)!='0')
                    ll.add(0);
                else if(s.charAt(i)!='1'&&t.charAt(i)!='1')
                    ll.add(1);
                else
                    ll.add(2);
            }
            sum=0;
            //for(i=0;i<n;i++)
            //    System.out.print(ll.get(i)+" ");
            for(i=0;i<n;i++){
                if(i<n-1&&ll.get(i)==0&&ll.get(i+1)==1){
                    if(s.charAt(i)=='1'&&t.charAt(i)=='1'&&s.charAt(i+1)=='0'&&t.charAt(i+1)=='0') {
                        sum+=2;
                        i++;
                    }
                }
                else if(i<n-1&&ll.get(i)==1&&ll.get(i+1)==0){
                    if(s.charAt(i)=='0'&&t.charAt(i)=='0'&&s.charAt(i+1)=='1'&&t.charAt(i+1)=='1'){
                        sum+=2;
                        i++;
                    }
                    else
                        sum++;
                }
                else
                    sum+=ll.get(i);
            }
            System.out.println(sum);
        }
    }
}
