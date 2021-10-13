package calculator;

import java.util.Scanner; //For the Scanner to take input from user.

public class JavaCalculator{
	public static void main(String[] args) { //the main function.
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter Num1: "); //display this to ask the user for input.
			int N1= input.nextInt(); //get input
			System.out.println("Enter Num2: "); //display this to ask the user for input
			int N2= input.nextInt(); // get input
			System.out.println("Enter Opretor(0 To Quit): "); //display this to ask the user for input
			char OP = input.next().charAt(0); //get input which is an Opreator here for the math calculating
			switch(OP) {
			case'+':
				System.out.println(N1+N2); //case one if user chossen +
				break;
			case'-':
				System.out.println(N1-N2); //case one if user chossen -
				break;
			case'/':
				System.out.println(N1/N2); //case one if user chossen /
				break;
			case'*':
				System.out.println(N1*N2); //case one if user chossen *
				break;
			case'0':
				System.out.println("Bye, Take care :D"); //print this when the user want to Quit.
				break;
				default:
					System.out.println("Invalid input, Try agin please ");
			}
			if(OP=='0') {
				break;
			}
			
		}while(true);
		
	}
}
