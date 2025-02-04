import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Sum {
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int a, b, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Type your first number:");
        a = input.nextInt();

        System.out.println("Type your second number:");
        b = input.nextInt();

        result = add(a, b);
        System.out.println("I added them together: " + result);
    }
}