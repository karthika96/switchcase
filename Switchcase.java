package switchcase;
import java.util.Scanner;
public class Switchcase {

	public static void main(String[] args) {
		int choice;
		System.out.println("Pick one : 1. Hi\t2. Hey\t3. Hello\t");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		choice = s.nextInt();
		switch(choice)
		{
			case 1 : System.out.println("You said Hi");
			case 2 : System.out.println("You said Hey");
			case 3 : System.out.println("You said Hello");
			default : System.out.println("Invalid choice");
			
		}
	}
}