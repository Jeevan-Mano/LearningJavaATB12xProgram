package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'A';
       // char c = "A";// "" == String = Bunch of characters

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' ';

        // Escape char

        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("JeevanKumar");
        System.out.println("Jeevan"+new_line+"Kumar");
        System.out.println("Jeevan\nKumar");
        System.out.println("Jeevan"+tab_line+"Kumar");
        System.out.println("Jeevan"+back_space+"Kumar");
        System.out.println("Jeevan is old"+carriage_return+"Kumar");

        char c10 = 'A';
        // ASCII, (Limited numbers) - A -> 65


    }
}
