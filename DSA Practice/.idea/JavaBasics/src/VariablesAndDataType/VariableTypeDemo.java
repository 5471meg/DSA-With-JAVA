package VariablesAndDataType;

import java.util.Scanner;

public class VariableTypeDemo {
    public static void main(String[] args) {
        byte b = 8;
        System.out.println(b);
        char ch = 'a';
        System.out.println(ch);
        boolean var = true;
        System.out.println(var);
        float price = 10.5f;
        System.out.println(price);
        int number = 30;
        System.out.println(number);
        //long
        //double
        short n = 333;
        System.out.println(n);


    }

    public static class ProductInput {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int product=a*b;
            System.out.println(product);
        }
    }
}
