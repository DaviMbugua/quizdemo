import java.util.Scanner; //importing scanner to allow user input

public class Assignment_2 {

	public static void main(String[] args) {
		System.out.println("Welcome to the quiz game!");

		start_quiz();
	}

	public static void start_quiz() { // creating a new method
		Scanner quiz = new Scanner(System.in);
		int numCorrect = 0;
		int answered = 0;

		while (true) { // do a while loop

			System.out.println("Who is the founder of ALU?");
			System.out.println("a. Fred ");
			System.out.println("b. David");
			String response1 = quiz.nextLine();
			answered++;

			if (response1.equals("a")) {
				System.out.println("Correct!");
				numCorrect += 1;
			} else {
				System.out.println("Wrong!");
			}

			System.out.println("When was ALU founded?");
			System.out.println("a. 2005 ");
			System.out.println("b. 2017");
			String response2 = quiz.nextLine();
			answered++;

			if (response2.equals("b")) {
				System.out.println("Correct!");
				numCorrect += 1;
			} else {
				System.out.println("Wrong!");
			}

			System.out.println("Who teaches programming classes?");
			System.out.println("a. Ella ");
			System.out.println("b. Javan");
			String response3 = quiz.nextLine();
			answered++;

			if (response3.equals("a")) {
				System.out.println("Correct!");
				numCorrect += 1;
			} else {
				System.out.println("Wrong!");
			}

			System.out.println("Which among the 2 languages is hardest?");
			System.out.println("a. Java ");
			System.out.println("b. Python");
			String response4 = quiz.nextLine();
			answered++;

			if (response4.equals("a")) {
				System.out.println("Correct!");
				numCorrect += 1;
			} else {
				System.out.println("Wrong!");
			}

			System.out.println("How many branches does ALU have?");
			System.out.println("a. 4 ");
			System.out.println("b. 2");
			String response5 = quiz.nextLine();
			answered++;

			if (response5.equals("b")) {
				System.out.println("Correct!");
				numCorrect += 1;
			} else {
				System.out.println("Wrong!");
			}

			System.out.println("How many courses does ALU offer?");
			System.out.println("a. 8 ");
			System.out.println("b. 10");
			String response6 = quiz.nextLine();
			answered++;

			if (response6.equals("a")) {
				System.out.println("Correct!");
				numCorrect += 1;
			} else {
				System.out.println("Wrong!");
			}

			System.out.println("How many countries are in Africa?");
			System.out.println("a. 54 ");
			System.out.println("b. 49");
			String response7 = quiz.nextLine();
			answered++;

			if (response7.equals("a")) {
				System.out.println("Correct!");
				numCorrect += 1;
			} else {
				System.out.println("Wrong!");
			}
			System.out.println("What is the capital city of Rwanda?");
			System.out.println("a. Nairobi ");
			System.out.println("b. Kigali");
			String response8 = quiz.nextLine();
			answered++;


			if (response8.equals("b")) {
				System.out.println("Correct!");
				numCorrect += 1;
			} else {
				System.out.println("Wrong!");
			}

			System.out.println("Who is ALU Rwanda's dean?");
			System.out.println("a. Gaidi ");
			System.out.println("b. Aseda");
			String response9 = quiz.nextLine();
			answered++;


			if (response9.equals("a")) {
				System.out.println("Correct!");
				numCorrect += 1;
			} else {
				System.out.println("Wrong!");
			}

			System.out.println("Who is in charge of student life at ALU Rwanda ?");
			System.out.println("a. Bobson ");
			System.out.println("b. Sila");
			String response10 = quiz.nextLine();
			answered++;

			if (response10.equals("b")) {
				System.out.println("Correct!");
				numCorrect += 1;
			} else {
				System.out.println("Wrong!");
			}

			System.out.println("You answered : " + numCorrect + " correctly and " + (10 - numCorrect) + " wrong");

			System.out.println("Do you want to play the game again?");
			System.out.println("yes");
			System.out.println("no");
			String playAgain = quiz.nextLine();

			if (playAgain.equals("yes")) {
				answered = 0;
				numCorrect = 0;
				continue;
			}
			else {
				System.out.println("You answered : " + numCorrect + " correctly and " + (10 - numCorrect) + " wrong");
				break;
			}

		}

	}

}
