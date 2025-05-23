package Tasks;

public class Task4_Inc_Dec_Operator {
    public static void main(String[] args) {

        int a = 11, b = 22, c;
        c = a + b + a++ + b++ + ++a + ++b;
//      c =11 + 22 + 11 + 22  + 13  + 24 = 103
        System.out.println("a=" + a); // a = 13
        System.out.println("b=" + b); // b = 24
        System.out.println("c=" + c);

    }
}
