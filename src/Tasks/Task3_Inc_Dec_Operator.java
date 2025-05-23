package Tasks;

public class Task3_Inc_Dec_Operator {
    public static void main(String[] args) {

        int i = 11;
        i = i++ + ++i;
        System.out.println(i);

        // i++ -> A -> ExpA - > 11, i = 12
        // +
        // ++i -> B -> ExpA - > 13, i = 13
        // ExpA+ExpB -> 11+13 -> 24,


    }
}
