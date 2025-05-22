package ex_04_Operators;

public class Lab039_Modulus_Operators {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        System.out.println(a%b); // Modulus -> Remainder
        //      10 | 20 | 2 - Quotient
        //         | 20 |
        //      -----------
        //            0 - Remainder

        System.out.println(13%7);
        //      7 | 13 | 1 - Quotient
        //        | 7 |
        //      -----------
        //            6 - Remainder
    }
}
