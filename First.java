import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
	
System.out.println("Welcome to Grand Circus' Room Detail Generator!");				
System.out.println();

Scanner scanner = new Scanner(System.in);

System.out.println("Please Enter Your Name");
String Name = scanner.nextLine();	

System.out.println("Enter Width");
double width = scanner.nextDouble();

System.out.println("Enter length");
double length = scanner.nextDouble();

System.out.println("Enter height");
double height = scanner.nextDouble();

double Perimeter = 2 * length + 2 * width;		
		
double Area = width * length;

double Volume = Area * height; 

System.out.println("Perimeter: "+  Perimeter + "\n"+ "Area: " +  Area + "\n"+ "Volume:  " + Volume);

System.out.println("Continue? (y/n):");
choice = scanner.next();
System.out.println();
}
System.out.println("Bye!");
}
}
