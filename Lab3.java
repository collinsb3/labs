import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);
	String yesOrno = "y";
	while (yesOrno.equalsIgnoreCase("y")) {
	
	System.out.println("Enter an Interger");	
	int numbers = scanner.nextInt();
	
	System.out.println( "numbers\t square\t  cubed\t");
	
	System.out.println("=======\t ======\t  ======\t");
	
	for  (int i = 1; i <= numbers; i++) {	
	//if ( i == 1 || i == numbers) {
		int square = i * i;
		int cubed = i * i * i;
		System.out.println (i + "\t" + square + "\t" + cubed);
	}
	System.out.println("Continue? (y/n):");	
	yesOrno = scanner.next();	
		
		
		
		
	}
	System.out.println("Holla!");
	}	
	}

