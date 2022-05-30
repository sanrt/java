import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

		System.out.print("Матеріал 1: ");
        System.out.print("\n\tОб'єм: ");
        float V1 = in.nextFloat();
		System.out.print("\tМаса: ");
        float m1 = in.nextFloat();
		float p1 = m1/V1;

		System.out.print("Матеріал 2: ");
        System.out.print("\n\tОб'єм: ");
        float V2 = in.nextFloat();
		System.out.print("\tМаса: ");
        float m2 = in.nextFloat();
		float p2 = m2/V2;
	
		
		if(p1 > p2)
		{
			System.out.println("Матеріал 1 має більшу щільність.");
		}
		else if(p1 < p2)
		{
			System.out.println("Матеріал 2 має більшу щільність.");
		}
		else
		{
			System.out.println("Матеріали рівні за щільністю.");
		}
    }
}
