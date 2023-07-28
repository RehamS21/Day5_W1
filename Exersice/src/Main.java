// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Calculator System");
        System.out.println("From 1-10 choose one of the options : \n" + "1. Addition the numbers\n" +
                "2. subtraction the numbers \n" + "3. multiplication the numbers\n" + "4. division the numbers\n" +
                "5. modulus the numbers \n" + "6. minimum number \n" + "7. maximum number \n" + "8. average of numbers\n" +
                "9. Last result in calculator \n" + "10. List of all results in calculator \n");
        int user_option = input.nextInt();
        System.out.println("Enter the number1 : ");
        int num1 = input.nextInt();
        System.out.println("Enter the number2 : ");
        int num2 = input.nextInt();

        ArrayList<String> history = new ArrayList<>();
        ArrayList<Integer> last_result = new ArrayList<>();
        boolean flag = true;

        do {

            switch (user_option) {
                case 1:
                    int add = Calc.Addition(num1, num2);
                    System.out.println("The addition = " + add);
                    history.add("You sum the " + num1 + " + " + num2 + " = " + add);
                    last_result.add(add);
                    break;

                case 2:
                    int sub = Calc.subtraction(num1, num2);
                    System.out.println("The subtraction = " + sub);
                    history.add("You subtraction of " + num1 + " - " + num2 + " = " + sub);
                    last_result.add(sub);
                    break;

                case 3:
                    int mult = Calc.multiplication(num1, num2);
                    System.out.println("The multiplication = " + mult);
                    history.add("You multiplication of " + num1 + " * " + num2 + " = " + mult);
                    last_result.add(mult);
                    break;

                case 4:
                    int dev = Calc.division(num1, num2);
                    System.out.println("The division = " + dev);
                    history.add("You division of " + num1 + " / " + num2 + "  = " + dev);
                    last_result.add(dev);
                    break;

                case 5:
                    int mod = Calc.modulus(num1, num2);
                    System.out.println("The modulus = " + mod);
                    history.add("You modulus of " + num1 + " % " + num2 + "  = " + mod);
                    last_result.add(mod);
                    break;

                case 6:
                    int min_num = Calc.min(num1, num2);
                    System.out.println("The minimum = " + min_num);
                    history.add("Minimum of " + num1 + " < " + num2 + "  = " + min_num);
                    last_result.add(min_num);
                    break;

                case 7:
                    int max_num = Calc.max(num1, num2);
                    System.out.println("The Minimum = " + max_num);
                    history.add("Minimum of " + num1 + " > " + num2 + " = " + max_num);
                    last_result.add(max_num);
                    break;

                case 8:
                    int ave = Calc.average(num1, num2);
                    System.out.println("The average = " + ave);
                    history.add("average of " + num1 + " and " + num2 + "s = " + ave);
                    last_result.add(ave);
                    break;

            }
            System.out.println("From 1-10 choose one of the options : \n" + "1. Addition the numbers\n" +
                    "2. subtraction the numbers \n" + "3. multiplication the numbers\n" + "4. division the numbers\n" +
                    "5. modulus the numbers \n" + "6. minimum number \n" + "7. maximum number \n" + "8. average of numbers\n" +
                    "9. Last result in calculator \n" + "10. List of all results in calculator \n");
             user_option = input.nextInt();

            if (user_option == 9 || user_option == 10) {
                if (user_option == 9) {
                    Calc.Terminate_9(last_result);
                    break;
                } else {
                    Calc.Terminate_10(history);
                    break;
                }
            }
            System.out.println("Enter the number1 : ");
            num1 = input.nextInt();
            System.out.println("Enter the number2 : ");
            num2 = input.nextInt();
        } while (true);

    }

}


