package com.company;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        // kalder factorial fra 1 til 30
        for (int i = 1; i < 30 ; i++)
            factorial(i);
    }
        //factorial med bigInteger
    public static void factorial(long n){
        BigInteger b = BigInteger.valueOf(n);
        for( BigInteger i = BigInteger.valueOf(n);  //int i=n
             i.compareTo(BigInteger.ONE)>0;         //i>1
             i=i.subtract(BigInteger.ONE)){         //i--

            b = b.multiply(i.subtract(BigInteger.valueOf(1))); //n = n*(i-1);
        } System.out.println(b);
    }
    /*
    public static void factorial(int n){
        for(int i=n;i>1;i--){
       n = n*(i-1);
        } System.out.println(n);
    }*/


}
