import java.util.Scanner;
	public class IT24103082Lab4Q3{
		public static void main(String[]args){
		int number;//Declaring the variable

		Scanner input=new Scanner(System.in);//create a scanner object

		System.out.print("Enter a number: ");//Display the output
		number=input.nextInt();//capturing user input

		System.out.print(number<0?"The number is: Negative":
		number>0?"The number is: Positive":
		"The number is: Zero");
	}
}