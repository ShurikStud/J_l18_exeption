package com.shurik.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try {

            int result  = Factorial.getFactorial(0);
            System.out.println("result -> " + result);

        } catch (FactorialException fe){
            System.out.println(fe.getMessage());
            System.out.println(fe.getNumber());
        }

    }
}
