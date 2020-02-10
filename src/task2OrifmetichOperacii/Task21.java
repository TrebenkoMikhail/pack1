package task2OrifmetichOperacii;
import java.util.Scanner;
public class Task21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите первое число");
        int x=scanner.nextInt();
        System.out.println("Введите второе число");
        int y=scanner.nextInt();;
        System.out.println(x+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x+y);
    }
}
