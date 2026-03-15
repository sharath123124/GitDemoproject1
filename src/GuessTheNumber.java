import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Gussessing number program");
		Random random=new Random();
		int numbertoguess=random.nextInt(100)+1;
		int attemptcount=0;
		int Maxattempt=4;
		
		boolean guesscorrectly=false;
		
		while(attemptcount<Maxattempt)
		{
			System.out.println("guess the number");
			int guessednumber=s1.nextInt();
			attemptcount++;
			
			if(guessednumber==numbertoguess) {
				System.out.println("congrats guessed numbe is correct"+guessednumber);
				guesscorrectly=true;
				break;
			}else if(guessednumber<numbertoguess){
				System.out.println("guessed number is too low");
			}
			else if(guessednumber>numbertoguess){
				System.out.println("guessed number is too high");
			}
		}
		
		if(!guesscorrectly) {
			System.out.println("sorry you have used all the attempt"+attemptcount);
			System.out.println("the number was"+numbertoguess);
		}
		s1.close();
		System.out.println("game ends!");
	}

}
