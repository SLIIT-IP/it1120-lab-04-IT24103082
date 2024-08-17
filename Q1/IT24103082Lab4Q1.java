import java.util.Scanner;
	public class IT24103082Lab4Q1{
		public static void main(String[]args){
		int number;//Declaring the variable
		
		Scanner input=new Scanner(System.in);//create a scanner object
		
		System.out.print("Enter a number: ");//Display the output
		number=input.nextInt();//Capturing user input

		if(number<0)
			{
				System.out.print("The number is: Negative");
			}
		else if(number>0)
			{
				System.out.print("The number is: positive");
			}
		else if(number==0)
			{
				System.out.print("The number is zero");
			}
		}
}
		










