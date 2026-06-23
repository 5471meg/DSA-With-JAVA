package Practice1;
import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float Bill=(pencil+pen+eraser);
        System.out.println("The Cost of Total item is:"+Bill);
    }
}
