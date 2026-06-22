package VariablesAndDataType;

public class MemoryAllocDemo {
    public static void main(String[] args) {
        int a =5; // Stack Memory
                  // value 5 store hui
        int b =10; // stack Memory
                   // value 10 store hui
        int sum = a+b; // CPU ne a(5) aur b(10) ko read kiya
                       // 5+10 = 15 calculate kiya
                       // stack Memory me sum variable create hua
                      // value 15 store hui
        System.out.println(sum); // sum ki value (15) read karke print
    }
}
