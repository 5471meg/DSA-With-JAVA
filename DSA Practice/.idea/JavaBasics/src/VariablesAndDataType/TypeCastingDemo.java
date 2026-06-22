package VariablesAndDataType;
//import java.util.Scanner;
public class TypeCastingDemo {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        float a=25.12f;
       // int b=a; possible lossy conversion from float to int
        int b=(int)a;
        System.out.println(b);
    }
}
