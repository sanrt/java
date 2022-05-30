import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = 0;

        System.out.print("Введіть x: ");
        float x = in.nextFloat();

        System.out.print("Введіть y: ");
        float y = in.nextFloat();

        System.out.print("Введіть b: ");
        float b = in.nextFloat();

        if (b < 0)
        {
            a = (float)(b + Math.sqrt(x-4*y));
            System.out.printf("Результат: %.2f\n", a);
        }
        if (b > 7)
        {
            a = (float)((b*y)/(2*y-3*x) - 4);
            System.out.printf("Результат: %.2f\n", a);
        }
        if (b == 0)
        {
            a = (float)(b*b - 2*x*y + 4/(b*b-x*y));
            System.out.printf("Результат: %.2f\n", a);
        }
        if (b < 0)
        {
            a = (float)(b + Math.sqrt(x-4*y));
            System.out.printf("Результат: %.2f\n", a);
        }
        else if (b > 7)
        {
            a = (float)((b*y)/(2*y-3*x) - 4);
            System.out.printf("Результат: %.2f\n", a);
        }
        else if (b == 0)
        {
            a = (float)(b*b - 2*x*y + 4/(b*b-x*y));
            System.out.printf("Результат: %.2f\n", a);
        }
        else
        {
            System.out.printf("Неможливо обчислити при введеному значені.");
        }
    }
}
