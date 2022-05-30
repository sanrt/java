import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть номер трамваю: ");
        int n = in.nextInt();

        switch (n)
        {
            case 1:
                System.out.println("Початкова: \"Зупинка 1\"\nКінцева: \"Зупинка 5\"");
                break;
            case 2:
                System.out.println("Початкова: \"Зупинка 6\"\nКінцева: \"Зупинка 2\"");
                break;
            case 3:
                System.out.println("Початкова: \"Зупинка 2\"\nКінцева: \"Зупинка 7\"");
                break;
            case 4:
                System.out.println("Початкова: \"Зупинка 2\"\nКінцева: \"Зупинка 1\"");
                break;
            case 5:
                System.out.println("Початкова: \"Зупинка 6\"\nКінцева: \"Зупинка 5\"");
                break;
            case 6:
                System.out.println("Початкова: \"Зупинка 2\"\nКінцева: \"Зупинка 5\"");
                break;
            case 7:
                System.out.println("Початкова: \"Зупинка 5\"\nКінцева: \"Зупинка 7\"");
                break;
            case 8:
                System.out.println("Початкова: \"Зупинка 6\"\nКінцева: \"Зупинка 7\"");
                break;
            case 9:
                System.out.println("Початкова: \"Зупинка 2\"\nКінцева: \"Зупинка 6\"");
                break;
            default:
                System.out.println("Немає трамваю з вказаним номером");
                break;
        }
    }
}
