
public class HumanPlayer extends Player {

	public HumanPlayer(String name, Roshambo value) {
		super(name, value);
		
	}

	
//Used the class RPSValidator and called the method RPSVal
//set the output to equal a char called rps
//Created an if/else if/else statement based on the value of char
//which will return a Roshambo value 
	@Override
	public Roshambo generateRoshambo() {
		char rps = RPSValidator.RPSVal();
		
		if (rps == 'r'){
			return Roshambo.ROCK;
		}else if (rps == 's'){
			return Roshambo.SCISSORS;
		}else{
			return Roshambo.PAPER;
		}
	}
	

}
