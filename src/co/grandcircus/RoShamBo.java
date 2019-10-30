package co.grandcircus;

public enum RoShamBo {

	ROCK, PAPER, SCISSORS;
	
	public String toString() {
		switch (this) {
		case ROCK:
			return "Rock";
		case PAPER:
			return "PAPER";
		case SCISSORS:
			return "Scissors";
		}
		return null;
		
	}

}
