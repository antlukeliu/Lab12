
public class HumanPlayer extends Player {

	public HumanPlayer(String name, Roshambo value) {
		super(name, value);
		
	}

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
