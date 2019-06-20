package automation;

import java.util.Scanner;

public class FindASCIIValue {

	static void println(String string) {
		System.out.println(string);
	}

	static void print(String string) {
		System.out.print(string);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		println("********** Java program to convert ASCII to Character **********");
		println("");
		int ascii;
		println("Enter a ASCII value within 0 to 127 :");
		// read the integer value
		ascii = sc.nextInt();
		if (ascii > 127) {
			println("Please enter a valid input !!");
		} else {
			// convert the integer value to character
			char asciiChar = (char) ascii;
			println("ASCII value of " + ascii + " is " + asciiChar);
		}

		/*
		 * Scanner sc=new Scanner(System.in); String s=sc.next();
		 * 
		 * 
		 * Character c = 'b'; int value = c; //1 : Assigning
		 * System.out.println("Ascii : "+value); //2 : Typecasting
		 * System.out.println("Ascii : "+(int)c);
		 */ }

}
