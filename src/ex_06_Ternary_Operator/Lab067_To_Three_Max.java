package ex_06_Ternary_Operator;

public class Lab067_To_Three_Max {
    public static void main(String[] args) {

        int n1 = 4;
        int n2 = 10;
        int n3 = -14;

        // Logic Building Formula

        // Step 1 ->  Find the inputs and outputs data type
        // I/O -> n1,n2,n3 -> int
        // O/P -> int - max number or String we can message with max number

        // Step 2 - Rough Logic, Think about it.
        //  n1 >  n2 && n1 > n3 -> n1
        // n2 > n3 && n2 > n1 -> n2
        // n3

        // Step 3 - Dry run program
        //

        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
        //n1 > n2 ? Exp1 (True) : Exp2 (False);
        //Exp1 = n1 > n3 ? n1 : n3;
        //Wxp2 = n2 > n3 ? n2 : n3;
        System.out.println(max);

    }
}
