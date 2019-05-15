package setup;

import java.util.Scanner;

public class Team {
//	private static Scanner ask = new Scanner(System.in);
	private String name;
	private int points;
	private int seed;

	public Team(String name, int points, int seed){
		this.name = name;
		this.points = points;
		this.seed = seed;
	}
	
	public Team(){
		askAway();
	}
	
	//Prompting
	public void giveName() {
		Scanner ask = new Scanner(System.in);
		System.out.println("What will the team name be?");
		String namePrompt = ask.nextLine();
		this.name = namePrompt;
	}
	public void giveSeed() {
		Scanner ask = new Scanner(System.in);
		System.out.println("What will the team be seeded?");
		int seedPrompt = ask.nextInt();
		this.seed = seedPrompt;
	}
	public void askAway(){
		giveName();
		giveSeed();
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
