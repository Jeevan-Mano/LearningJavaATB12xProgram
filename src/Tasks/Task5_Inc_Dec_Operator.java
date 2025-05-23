package Tasks;

public class Task5_Inc_Dec_Operator {
    public static void main(String[] args) {

        int i = 1, j = 2, k = 3;
        int m = i-- - j-- - k--;
//          m = 1   - 2   - 3 = -4
        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
//                               0             1            2            -4


    }
}
