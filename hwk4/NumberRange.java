import java.util.Scanner;

public class NumberRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);
        printNumbersInRange(start, end);
        scanner.close();
    }
    
    public static void printNumbersInRange(int start, int end) {
        for (int i = start + 1; i < end; i++) {
            System.out.println(i);
        }
    }
}
