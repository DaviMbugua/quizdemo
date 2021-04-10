import java.util.Scanner; //importing scanner to allow user input
public class Assignment_2 {

	//public static void  main(String[] args)  {
		//System.out.println("Welcome to the quiz game; press a");
	//	start_quiz();
	
}
	public static void start_quiz() {       //creating a new method 
		Scanner quiz = new Scanner(System.in);
		String response = quiz.nextLine();
		int numCorrect = 0;
		int a = 0;
		while(a<10) {               //do a while loop 
			
			System.out.println("Who is the founder of ALU?");
			System.out.println("a. Fred ");
			System.out.println("b. David");
			a++;
			
			
			if (response.equals("a"))
			{
				System.out.println("Correct!");
				numCorrect  += 1;
			}
			else
			{
				System.out.println("Wrong!");
			}
			
			System.out.println("When was ALU founded?");
			System.out.println("a. 2005 ");
			System.out.println("b. 2017");
			a++;
			
			response = quiz.nextLine();
			if (response.equals("b"))
			{
				System.out.println("Correct!");
				numCorrect += 1;
			}
			else
			{
				System.out.println("Wrong!");
			}
			
			System.out.println("Who teaches programming classes?");
			System.out.println("a. Ella ");
			System.out.println("b. Javan");
			a++;
			
			response = quiz.nextLine();
			if (response.equals("a"))
			{
				System.out.println("Correct!");
				numCorrect += 1;
			}
			else
			{
				System.out.println("Wrong!");
			}	
		    
			System.out.println("Which among the 2 languages is hardest?");
			System.out.println("a. Java ");
			System.out.println("b. Python");
			a++;
			
			response = quiz.nextLine();
			if (response.equals("a"))
			{
				System.out.println("Correct!");
				numCorrect += 1;
			}
			else
			{
				System.out.println("Wrong!");
			}	
		    
			System.out.println("How many branches does ALU have?");
			System.out.println("a. 4 ");
			System.out.println("b. 2");
			a++;
			
			response = quiz.nextLine();
			if (response.equals("b"))
			{
				System.out.println("Correct!");
				numCorrect += 1;
			}
			else
			{
				System.out.println("Wrong!");
			}
			
			System.out.println("How many courses does ALU offer?");
			System.out.println("a. 8 ");
			System.out.println("b. 10");
			a++;
			
			response = quiz.nextLine();
			if (response.equals("a"))
			{
				System.out.println("Correct!");
				numCorrect += 1;
			}
			else
			{
				System.out.println("Wrong!");
			}
			
			System.out.println("How many countries are in Africa?");
			System.out.println("a. 54 ");
			System.out.println("b. 49");
			a++;
			response = quiz.nextLine();
			if (response.equals("a"))
			{
				System.out.println("Correct!");
				numCorrect += 1;
			}
			else
			{
				System.out.println("Wrong!");
			}
			System.out.println("What is the capital city of Rwanda?");
			System.out.println("a. Nairobi ");
			System.out.println("b. Kigali");
			a++;
			
			response = quiz.nextLine();
			if (response.equals("b"))
			{
				System.out.println("Correct!");
				numCorrect += 1;
			}
			else
			{
				System.out.println("Wrong!");
			}
			System.out.println("Who is ALU Rwanda's dean?");
			System.out.println("a. Gaidi ");
			System.out.println("b. Aseda");
			a++;
			
			response = quiz.nextLine();
			if (response.equals("a"))
			{
				System.out.println("Correct!");
				numCorrect += 1;
			}
			else
			{
				System.out.println("Wrong!");
			}
			
			System.out.println("Who is in charge of student life at ALU Rwanda ?");
			System.out.println("a. Bobson ");
			System.out.println("b. Sila");
			a++;
			
			response = quiz.nextLine();
			if (response.equals("b"))
			{
				System.out.println("Correct!");
				numCorrect += 1;
			}
			else
			{
				System.out.println("Wrong!");
			}
			
			System.out.println("Do you want to play the game again?");
			System.out.println("1. YES");
			System.out.println("0. NO");
			
			response = quiz.nextLine();
			if (response.equals("0"))
			{ 
				start_quiz();
			}
		
			else
			{
				a++;
				
			}
		
			
		}
		
	    
		

	}
  

}