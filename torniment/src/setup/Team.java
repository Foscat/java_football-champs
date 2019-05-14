package setup;

public class Team {

	private String name;
	private int points;
	private int seed;

	public Team(String name, int points, int seed){
		this.name = name;
		this.points = points;
		this.seed = seed;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Name getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// Points getter & setter
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	// Seed getter & setter
	public int getSeed() {
		return seed;
	}
	public void setSeed(int seed) {
		this.seed = seed;
	}

	public void getInfo(){
		System.out.println(
			"Team name: " + this.name + "\n" +
			"Team points: " + this.points + "\n" +
			"Team seed: " + this.seed + "\n");
	}

	

}
