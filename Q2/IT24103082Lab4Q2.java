import java.util.Scanner;
	public class IT24103082Lab4Q2{
		public static void main(String[]args){
		double examMarks;//Declaring the variable
		double labMarks;//Declaring the variable
		double examPercentage;//Declaring the variable
		double labPercentage;//Declaring the variable
		double totalMarks;//Declaring the variable
		
		Scanner input=new Scanner(System.in);//create a scanner object
		
		System.out.print("Please enter the exam marks(out of 100): ");//Display the output
		examMarks=input.nextDouble();
		if(examMarks>100||examMarks<0)
		{
			System.out.print("Invalid input for exam marks.Terminating program");
			return;
		}
		

		System.out.print("Please enter lab submission marks(out of 100): ");
		labMarks=input.nextDouble();
		if(labMarks>100||labMarks<0)
		{
			System.out.print("Invalid input for lab marks.Terminating program");
			return;
		}
		

		System.out.print("Please enter the percentage given for the exam:  ");
		examPercentage=input.nextDouble();
		System.out.print("Please enter the percentage given for the lab submission:  ");
		labPercentage=input.nextDouble();
		if(examPercentage+labPercentage!=100)
		{
			System.out.print("The percentages must add up to 100.Terminating program.");
			return;
		}

		System.out.println();
		System.out.println();
				
		
		totalMarks=(examMarks*examPercentage/100)+(labMarks*labPercentage/100);//calculation
		
		System.out.print("Final Exam Mark is: "+totalMarks);//Display the output

		
		
		
	}
}

		
	
		
		

				
			

		
		









