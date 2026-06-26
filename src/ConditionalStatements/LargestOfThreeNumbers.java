package ConditionalStatements;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int A =1 , B =3 , C=6;
        if((A>=B) && (A>=C)){
            System.out.println("The largest number is A : "+A);
        }
        else if(B>=C){
            System.out.println("The largest number is B : "+B);
        }
        else{
            System.out.println("The largest number is C : "+C);
        }
    }
}
