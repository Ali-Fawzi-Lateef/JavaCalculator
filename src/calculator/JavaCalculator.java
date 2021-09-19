package calculator;

import java.util.Scanner;

public class JavaCalculator{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter Num1: ");
			int N1= input.nextInt();
			System.out.println("Enter Num2: ");
			int N2= input.nextInt();
			System.out.println("Enter Opretor(0 To Quit): ");
			char OP = input.next().charAt(0);
			switch(OP) {
			case'+':
				System.out.println(N1+N2);
				break;
			case'-':
				System.out.println(N1-N2);
				break;
			case'/':
				System.out.println(N1/N2);
				break;
			case'*':
				System.out.println(N1*N2);
				break;
			case'0':
				System.out.println("Bye, Take care :D");
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