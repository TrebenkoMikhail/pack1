package task4UslovOperator;
import java.util.Scanner;
public class Task41 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a%2;
        if (b==0)
                System.out.println("Чётное");
        else
                System.out.println("Нечётное");
    }
}
