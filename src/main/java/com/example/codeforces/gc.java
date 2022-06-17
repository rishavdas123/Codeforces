package com.example.codeforces;
import java.util.*;
public class gc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j=0,a[],c=0;
        char k;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        i=0;
        while(i<n&&a[i]==0){
            i++;
            c++;
        }
        k='a';
        while(i<n&&a[i]==3)
            i++;
            for(;i<n;i++){
                if(a[i]==0) {
                    c++;
                    k='a';
                }
                else if(a[i]==1) {
                    if(k=='a'||k=='g')
                        k='c';
                    else {
                        c++;
                        k = 'a';
                    }
                }
                else if(a[i]==2) {
                    if (k=='a'||k=='c')
                        k='g';
                    else {
                        c++;
                        k = 'a';
                    }
                }
                else{
                    if(k=='c')
                        k='g';
                    else
                        k='c';
                }
            }
            System.out.println(c);
    }
}
