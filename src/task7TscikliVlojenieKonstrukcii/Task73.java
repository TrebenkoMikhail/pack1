package task7TscikliVlojenieKonstrukcii;
import java.util.Scanner;
public class Task73 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите ежемесячную стипендию");
        int n=scanner.nextInt();
        System.out.println("Введите ежемесячные расходы");
        int m=scanner.nextInt();
        double f=n-(m+10*m*0.3);
        System.out.println("У родителей нужно просить "+f);
    }
}
