import java.util.ArrayList;

public class Calc {

    public static int Addition(int n1, int n2) {
        return (n1 + n2);
    }

    public static int subtraction(int n1, int n2) {
        return (n1 - n2);
    }

    public static int multiplication(int n1, int n2) {
        return (n1 * n2);
    }

    public static int division(int n1, int n2) {
        return (n1 / n2);
    }

    public static int modulus(int n1, int n2) {
        return (n1 % n2);
    }

    public static int min(int n1, int n2) {
        int min = n1;
        if (min > n2) {
            min = n2;
        }
        return min;
    }

    public static int max(int n1, int n2) {
        int max = n1;
        if (max < n2) {
            max = n2;
        }
        return max;
    }

    public static int average(int n1, int n2) {
        return ((n1 + n2) / 2);
    }

    public static void Terminate_9(ArrayList<Integer> last) {

        System.out.println("The last result = " + last.get(last.size() - 1));

    }

    public static void Terminate_10(ArrayList<String> history) {

        System.out.println("The History of your calculator = ");
        System.out.println(history);
    }

}
