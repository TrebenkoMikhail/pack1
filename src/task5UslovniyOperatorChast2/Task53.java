package task5UslovniyOperatorChast2;

import java.util.Scanner;
public class Task53 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите номер дня недели");
        int m = scanner.nextInt();
        if (m == 1)
        System.out.println("Понедельник");
        if (m == 2)
        System.out.println("Вторник");
        if (m == 3)
        System.out.println("Среда");
        if  (m == 4)
        System.out.println("Четверг");
        if (m == 5)
        System.out.println("Пятница");
        if (m == 6)
        System.out.println("Суббота");
        if (m == 7)
        System.out.println("Воскресенье");
    }
}
