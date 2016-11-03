import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors");
		System.out.print("Enter your name");
		
		String name = scan.nextLine();
		
		System.out.println("Would you like to play against Animal or Robot(a/r)?: ");
		String opponent = scan.nextLine();
		
		
		String opp = "Robot";
		if (opponent.equals("r")){
			opp = "Robot";
		} 
		
		
		
		System.out.println("Rock, paper, or scissors?(R/P/S)");
		String value = scan.nextLine();
		
		compare(name, opp, value, "rock");

	}
	//Player2 "Robot" choice2 = "Rock"
	//Replace String value with enum value later                 paper          rock
	public static void compare(String Player1, String Player2, String choice1, String choice2){
		
		//combination of paper and rock
		//paper wins so we would say player 1 wins
		//if choices are paper and rock will be true
		
		if((choice1.equals("paper") && choice2.equals("rock")) 
				||(choice1.equals("rock") && choice1.equals("scissors"))
				||(choice1.equals("scissors") && choice2.equals("paper"))){
				System.out.println(Player1 + " wins");}
		else if(choice1.equals(choice2)){
			System.out.println("Draw");
		}else{
			System.out.println(Player2 + " wins");
		}
			
		}
	}

