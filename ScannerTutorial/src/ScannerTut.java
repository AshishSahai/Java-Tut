import java.util.Scanner;

public class ScannerTut {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name = scan.next();
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		System.out.print("Favorite Quote: ");
		String quote = scan.next();
		quote=quote+scan.nextLine();
		
		System.out.print("Your name is: "+name+ " and age is: "+age+" and quote is: "+quote);
		
		

	}

}
