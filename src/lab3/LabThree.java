package lab3;

import java.util.Scanner;

public class LabThree {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		boolean keepGoing = true;
		String name = "";
		int userNum = 0;

		System.out.println("Hello! What's your name?");
		name = scnr.next();

		System.out.println();

		do {
			System.out.println("Please enter a number between 1 and 100: ");
			userNum = scnr.nextInt();

			if (userNum < 60 && userNum % 2 != 0) {
				System.out.println(userNum + " and Odd");
			} else if ((userNum >= 2 && userNum <= 25) && (userNum % 2 == 0)) {
				System.out.println("Even and less than 25");
			} else if ((userNum >= 26 && userNum <= 60) && (userNum % 2 == 0)) {
				System.out.println("Even");
			} else if (userNum > 60 && userNum % 2 == 0) {
				System.out.println(userNum + " and Even");
			} else if (userNum > 60 && userNum % 2 != 0) {
				System.out.println("Odd and over 60");

			}
			System.out.println();
			System.out.print("Would you like to continue? ");
			keepGoing = scnr.next().startsWith("y");
			System.out.println();

		} while (keepGoing);

		System.out.println("Goodbye " + name);
	}
}
