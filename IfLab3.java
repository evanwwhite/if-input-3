//Evan White
import java.util.Scanner;
public class IfLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Your Grade: ");
		int grade1 = input.nextInt();
		
		if(grade1 >= 90 && grade1 <= 100 )
		{
			System.out.println("You have a A!");
		}
		
		if(grade1 >= 80 && grade1 <= 89)
		{
			System.out.println("You have a B!");
		}
		
		if(grade1 >= 70 && grade1 <= 79)
		{
			System.out.println("You have a C!");
		}
		
		if(grade1 >= 0 && grade1 <= 69)
			
		{
			System.out.println("You have a F :(");
		}
	}

}
/*
Enter Your Grade: 
45
You have a F :(
*/