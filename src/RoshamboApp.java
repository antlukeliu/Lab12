import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors");
		System.out.print("Enter your name");
		
		String name = scan.nextLine();
		
		System.out.println("Would you like to play against Animal or Robot(a/r)?: ");
		String opponent = scan.nextLine();
		
		
		//do
		System.out.println("Rock, paper, or scissors?(R/P/S)");
		String value = scan.nextLine();
		//get rps value
		//set opponent value
		//get roshambo value
		//print what each player choose
		//keep count
		
		if((choice1.equals("paper") && choice2.equals("rock")) 
				||(choice1.equals("rock") && choice1.equals("scissors"))
				||(choice1.equals("scissors") && choice2.equals("paper"))){
				System.out.println(Player1 + " wins");}
		else if(choice1.equals(choice2)){
			System.out.println("Draw");
		}else{
			System.out.println(Player2 + " wins");
		}

		//print count
		//loop again
		//while what?
		//exit message
	}
	public static Roshambo getPlayerValue(char rps){
		if (rps == 'r'){
			return Roshambo.ROCK;
		}else if (rps == 's'){
			return Roshambo.SCISSORS;
		}else{
			return Roshambo.PAPER;
		}
	}
	
	public static Player getOpponent(char choosingOpp){
		Player opponent;
		if (choosingOpp == 'r'){
			opponent = new Robot(null, null);
		} else{
			opponent = new Animal(null, null);
		}
		return opponent;
	}
	}

