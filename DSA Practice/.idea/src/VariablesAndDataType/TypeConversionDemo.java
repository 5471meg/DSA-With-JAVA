package VariablesAndDataType;
import java.util.Scanner;
public class TypeConversionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  int number=sc.nextFloat();We can't assign float in integer
        float number=sc.nextInt();
        System.out.printf("%.2f",number);
    }
}