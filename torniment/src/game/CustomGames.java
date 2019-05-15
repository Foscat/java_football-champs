package game;
import java.util.Random;
import java.util.Scanner;

import setup.Lineup;
import setup.Team;

public class CustomGames {
	// Initialize the Scanner we'll need.
	private static Scanner ask = new Scanner(System.in);
	private static Lineup final4 = new Lineup();
	
	static int generate(){
		System.out.println("How many teams will be in torniment?");
		int getTeams = ask.nextInt();
		return getTeams;
	}

	static Lineup teamMaker(int numTeams){
		Lineup final4 = new Lineup();

		for(int i=0; i<numTeams; i++){
			Team newTeam = new Team();
			final4.add(newTeam);
		}
		final4.report();
		return final4;
	}

	static Team playGame(Team team1, Team team2){
		Random rand = new Random();
		
		int randomScore1 = rand.nextInt(60);
		int randomScore2 = rand.nextInt(60);
		
		team1.setPoints(randomScore1);
		team2.setPoints(randomScore2);
		
		if(team1.getPoints() > team2.getPoints()){
			System.out.println("---------------------------------------------");
			System.out.println(team1.getName()+ " won the game. ");
			System.out.println(team1.getName()+ " score was " + team1.getPoints());
			System.out.println(team2.getName()+ " score was " + team2.getPoints());
			return team1;
		}
		else{
			System.out.println("---------------------------------------------");
			System.out.println(team2.getName()+ " won the game. ");
			System.out.println(team2.getName()+ " score was " + team2.getPoints());
			System.out.println(team1.getName()+ " score was " + team1.getPoints());
			return team2;
		}
	}


//	 static Team torniment(){
//	 	Team round1 = playGame(Michigan_State, Indiana);
//	 	System.out.println(round1.getName() + " is the winner");
//		
//	 	Team round2 = playGame(Michigan, Winsconsin);
//	 	System.out.println(round2.getName() + " is the winner");
//		
//	 	Team finalRound = playGame(round1, round2);
//		
//	 	return finalRound;
//	 }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbaOfTeams = generate();
		teamMaker(numbaOfTeams);

		System.out.println(final4.get(1));
	}

}
