package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        int number = 26;
        String result = (number > 18) ? (number > 25 ? "You can drink in Goa" : "You can't Drink") : "You can't go to GOA";
        System.out.println(result);
    }
}
