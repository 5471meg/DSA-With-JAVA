package Practice1;
import java.util.Scanner;
public class AverageCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int avg=(A+B+C)/3;
        System.out.println(avg);
    }
}
