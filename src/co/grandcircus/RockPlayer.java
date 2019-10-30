package co.grandcircus;

public class RockPlayer extends Player {

	public RockPlayer() {

	}
	
	public RockPlayer(String name) {
		super(name);
	}

	@Override
	public RoShamBo generateRoShamBo() {
		// TODO Auto-generated method stub
		return RoShamBo.ROCK;
	}

	@Override
	public String toString() {
		return "Skater chose " + generateRoShamBo();
	}

}
