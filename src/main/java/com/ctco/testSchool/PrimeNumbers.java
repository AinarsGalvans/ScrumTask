package com.ctco.testSchool;

public class PrimeNumbers {
    public static int getPrimeNumberClosesTo(int n) {
        for(int c=0,s=0,d,N=n;c!=2;s++)for(c=d=1,n+=n<N?s:-s;d<n;)if(n%++d<1)c++;return n;
    }
}
