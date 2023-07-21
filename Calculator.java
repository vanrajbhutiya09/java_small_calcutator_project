import java.util.*;

class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Value :");
        int first = sc.nextInt();
        System.out.println("Enter Second Value :");
        int second = sc.nextInt();

        System.out.println("Enter Opration (+ , - , * , / , %) :");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                int result = first + second;
                System.out.println("Answer Is =" + result);
                break;

            case '-':
                result = first - second;
                System.out.println("Answer Is = " + first + second);
                break;

            case '*':
                result = first * second;
                System.out.println("Answer Is = " + first + second);
                break;

            case '/':
                result = first / second;
                System.out.println("Answer Is = " + first + second);
                break;

            case '%':
                result = first % second;
                System.out.println("Answer Is = " + first + second);
                break;

            default:
                System.out.println("Invalid Input!");
        }

    }
}
