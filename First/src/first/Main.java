package first;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter name, age, salary:");
		
		String name = myObj.nextLine();
		
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();
		
		System.out.println("Name" +name);
		System.out.println("Age" +age);
		System.out.println("Salary" +salary);

	}

}
