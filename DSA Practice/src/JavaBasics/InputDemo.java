package JavaBasics;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String input=sc.next();
        //System.out.println(input);
        String name=sc.nextLine();
        System.out.println(name);
        int number=sc.nextInt();
        System.out.println(number);
        float price=sc.nextFloat();
        System.out.println(price);
        long salary=sc.nextLong();
        System.out.println(salary);
        double balance=sc.nextDouble();
        System.out.println(balance);
    }
}
