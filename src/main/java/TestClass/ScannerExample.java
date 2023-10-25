package TestClass;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter Name : ");
		 String name = scanner.nextLine();
		 System.out.println("Name =" + name );
		 

		 System.out.println("Enter Age : ");
		 int age = scanner.nextInt();
		 

		 
		 System.out.println("Age =" + age );
		 
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Designation : ");
		 String desig = sc.nextLine();
		 System.out.println(" Designation : " + desig);
		
	}

}
