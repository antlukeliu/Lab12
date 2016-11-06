import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		RPSValidator rpsv = new RPSValidator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors");
		System.out.print("Enter your name: ");
		
		String name = scan.nextLine();
		
		int playCount = 0;
		int oppCount = 0;
		int drawCount = 0;
		
		char opp1 = rpsv.PlayerVal();
		boolean condition = true;
		//Instantiated a new HumanPlayer taking in a String called name and 
		//Roshambo value of null
		Player ply1 = new HumanPlayer(name, null);
		Player ply2 = getOpponent(opp1);
		do {
		
		
		Roshambo choice1 = ply1.generateRoshambo(); 
		//set opponent value
		ply2.setName();
		ply2.setValue();
		Roshambo choice2=ply2.getValue();
		
		//Replaced name in our print lines to having our HumanPlayer call a method to
		//get the name instead
		System.out.println("\n" + ply1.getName() + ":" + choice1.toString());
		System.out.println(ply2.getName() + ":" + choice2.toString());
		
		if((choice1==Roshambo.PAPER && choice2==Roshambo.ROCK) 
                ||(choice1==Roshambo.ROCK && choice2==Roshambo.SCISSORS)
                ||(choice1==Roshambo.SCISSORS && choice2==Roshambo.PAPER)){
                System.out.println(ply1.getName() + " wins!");
                playCount++;
            }
        else if(choice1==choice2){
            System.out.println("Draw");
            drawCount++;
        }else{
            System.out.println(ply2.getName() + " wins");
            oppCount++;
        }
        System.out.printf("\n%s has %d wins - %d ties - %d loses", 
                ply1.getName(), playCount, drawCount, oppCount);
			
		char ch2 = rpsv.YesOrNo();
		condition = rpsv.loopingAgain(ch2);
		}while(condition);
		System.out.println("Thanks for playing!");
		//print count
		//loop again
		//while what?
		//exit message
	}
	
	//deleted getPlayerValue method
	
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