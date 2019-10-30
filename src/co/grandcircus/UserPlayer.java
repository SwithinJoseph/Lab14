package co.grandcircus;

public class UserPlayer extends Player {

	private String userChoice;

	public UserPlayer(String name) {
		super(name);
	}

	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}

	public String getUserChoice() {
		return userChoice;
	}

	@Override
	public RoShamBo generateRoShamBo() {
		// TODO Auto-generated method stub
		if (userChoice.equalsIgnoreCase("rock")) {
			return RoShamBo.ROCK;
		} else if (userChoice.equalsIgnoreCase("paper")) {
			return RoShamBo.PAPER;
		} else {
			return RoShamBo.SCISSORS;
		}

	}

	public String toString() {
		return "You chose " + userChoice;
	}

}
