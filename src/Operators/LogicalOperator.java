package Operators;

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println((5>3)&&(6<10));
        System.out.println((5<3)&&(6>10));
        System.out.println((5<3)&&(6<10));
        System.out.println((5>3)||(6<10));
        System.out.println((5<3)||(6<10));
        System.out.println((5<3)||(6>10));
        System.out.println(!(5>3));
        System.out.println(!(6<3));
    }
}
