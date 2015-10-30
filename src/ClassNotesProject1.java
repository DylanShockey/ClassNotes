import java.util.Scanner;
public class ClassNotesProject1 {
	public static void main(String[] args) {
	
		// Outline for addition problem.
		
		int score = 0;
		int hardnessOfQuestion = 10;
		
		// Round 1
		//	Generate 2 random numbers
		int number1 = (int)(Math.random() * hardnessOfQuestion);
		int number2 = (int)(Math.random() * hardnessOfQuestion);
		
		// to keep track of the correct answer.
		int correctAnswer = number1 + number2;
		
		//  Ask the user to add these two numbers together
		System.out.println
		("What integer is " + number1 + " + " + number2 + "?");
		System.out.println("Please answer in integers only.");
		
		//  Read in their response
		Scanner input = new Scanner(System.in);
		int studentAnswer = input.nextInt();
		//  Check if the answer was correct
		//		IF correct
		if (studentAnswer == correctAnswer){
			//			Tell them it was correct
			System.out.println("Answer was correct");
			//			Give them points
			score += hardnessOfQuestion;
			System.out.println("Score is: " + score);
			//			Make the next question harder
			hardnessOfQuestion *= 10;	
			System.out.println("hardness is: " + hardnessOfQuestion);
		}
		//		IF not correct
		else{
			//			Tell them it was wrong
			System.out.println("Answer was not correct");
			// 			Tell them the correct answer
			System.out.println("The correct answer was: " + correctAnswer);
			//			Do not give them points
			score += 0;
			//			Make the next question easier
			if(hardnessOfQuestion>10){
				hardnessOfQuestion /= 10;	
			}
		}
		System.out.println("End of round 1");
		// end of round 1
		
		// Round 2
		//	Generate 2 random numbers
		number1 = (int)(Math.random() * hardnessOfQuestion);
		number2 = (int)(Math.random() * hardnessOfQuestion);

		// to keep track of the correct answer.
		correctAnswer = number1 + number2;
		
		//  Ask the user to add these two numbers together
		System.out.println
		("What integer is " + number1 + " + " + number2 + "?");
		System.out.println("Please answer in integers only.");
		
		//  Read in their response
		//Scanner input = new Scanner(System.in);
		studentAnswer = input.nextInt();
		//  Check if the answer was correct
		//		IF correct
		if (studentAnswer == correctAnswer){
			//			Tell them it was correct
			System.out.println("Answer was correct");
			//			Give them points
			score += hardnessOfQuestion;
			System.out.println("Score is: " + score);
			//			Make the next question harder
			hardnessOfQuestion *= 10;	
			System.out.println("hardness is: " + hardnessOfQuestion);
		}
		//		IF not correct
		else{
			//			Tell them it was wrong
			System.out.println("Answer was not correct");
			// 			Tell them the correct answer
			System.out.println("The correct answer was: " + correctAnswer);
			//			Do not give them points
			score += 0;
			//			Make the next question easier
			if(hardnessOfQuestion>10){
				hardnessOfQuestion /= 10;	
			}
		}
		// end of round 2
		System.out.println("End of round 2");
		
		// Round 3
		//	Generate 2 random numbers
		number1 = (int)(Math.random() * hardnessOfQuestion);
		number2 = (int)(Math.random() * hardnessOfQuestion);

		// to keep track of the correct answer.
		correctAnswer = number1 + number2;
		
		//  Ask the user to add these two numbers together
		System.out.println
		("What integer is " + number1 + " + " + number2 + "?");
		System.out.println("Please answer in integers only.");
		
		//  Read in their response
		//Scanner input = new Scanner(System.in);
		studentAnswer = input.nextInt();
		//  Check if the answer was correct
		//		IF correct
		if (studentAnswer == correctAnswer){
			//			Tell them it was correct
			System.out.println("Answer was correct");
			//			Give them points
			score += hardnessOfQuestion;
			System.out.println("Score is: " + score);
			//			Make the next question harder
			hardnessOfQuestion *= 10;	
			System.out.println("hardness is: " + hardnessOfQuestion);
		}
		//		IF not correct
		else{
			//			Tell them it was wrong
			System.out.println("Answer was not correct");
			// 			Tell them the correct answer
			System.out.println("The correct answer was: " + correctAnswer);
			//			Do not give them points
			score += 0;
			//			Make the next question easier
			if(hardnessOfQuestion>10){
				hardnessOfQuestion /= 10;	
			}
		}
		// end of round 3
		System.out.println("End of round 3");
		
		// Round 4
		//	Generate 2 random numbers
		number1 = (int)(Math.random() * hardnessOfQuestion);
		number2 = (int)(Math.random() * hardnessOfQuestion);

		// to keep track of the correct answer.
		correctAnswer = number1 + number2;
		
		//  Ask the user to add these two numbers together
		System.out.println
		("What integer is " + number1 + " + " + number2 + "?");
		System.out.println("Please answer in integers only.");
		
		//  Read in their response
		//Scanner input = new Scanner(System.in);
		studentAnswer = input.nextInt();
		//  Check if the answer was correct
		//		IF correct
		if (studentAnswer == correctAnswer){
			//			Tell them it was correct
			System.out.println("Answer was correct");
			//			Give them points
			score += hardnessOfQuestion;
			System.out.println("Score is: " + score);
			//			Make the next question harder
			hardnessOfQuestion *= 10;	
			System.out.println("hardness is: " + hardnessOfQuestion);
		}
		//		IF not correct
		else{
			//			Tell them it was wrong
			System.out.println("Answer was not correct");
			// 			Tell them the correct answer
			System.out.println("The correct answer was: " + correctAnswer);
			//			Do not give them points
			score += 0;
			//			Make the next question easier
			if(hardnessOfQuestion>10){
				hardnessOfQuestion /= 10;	
			}
		}
		// end of round 4
		System.out.println("End of round 4 and the end of the game");
	}
}
