package co.grandcircus;

public class RandomPlayer extends Player {

	public RandomPlayer(String name) {
		super(name);
	}

	
	@Override
	public RoShamBo generateRoShamBo() {
		// TODO Auto-generated method stub
		int i = (int)(Math.random() * 3) + 1;
		switch(i) {
		case 1:
			return RoShamBo.PAPER;
		case 2:
			return RoShamBo.ROCK;
		case 3:
			return RoShamBo.SCISSORS;
		}
		return null;
	}


	@Override
	public String toString() {
		return "Indecisive Boyfriend chose " + generateRoShamBo();
	}
	
	

}
