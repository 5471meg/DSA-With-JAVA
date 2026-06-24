package VariablesAndDataType;

public class VariableDemo {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String name="jo";
        System.out.println(a+b);
        System.out.println(name);
    }

    public static class TypePromotion {
        public static void main(String[] args) {
            char a= 'a';
            char b= 'b';
            System.out.println((int)(b));
            System.out.println((int)(a));
            System.out.println(b-a);
        }
    }

    public static class TypePromotionAccoly {
        public static void main(String[] args) {
            int a=10;
            float b=20.25f;
            long c=25;
            double d=30;
            double ans= a +b +c +d;
            System.out.println(ans);
        }
    }
}
