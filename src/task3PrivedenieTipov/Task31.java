package task3PrivedenieTipov;
import java.util.Scanner;
public class Task31 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите сколько км пробежал марафонец");
        int s = scanner.nextInt();

        System.out.println("Введите с какой скорость в м/с пробежал марафонец");
        int v = scanner.nextInt();
        int t = s*1000/v;
        System.out.println("Время в пути, в секундах "+t);
        t=t/60;
        System.out.println("Время в пути, в минутах "+t);
        t=t/60;
        System.out.println("Время в пути, в секундах "+t);
    }
}
