package game;

import java.util.Random;

import setup.Team;

public class Arena {
	
		static Team Michigan = new Team("Michigan", 0, 2);
		static Team Michigan_State = new Team("Michigan State", 0, 3);
		static Team Winsconsin = new Team("Winsconsin", 0, 1);
		static Team Indiana = new Team("Indiana", 0, 4);
	
	public static Team playGame(Team team1, Team team2){
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
	
	public static Team torniment(){
		Team round1 = playGame(Michigan_State, Indiana);
		System.out.println(round1.getName() + " is the winner");
		
		Team round2 = playGame(Michigan, Winsconsin);
		System.out.println(round2.getName() + " is the winner");
		
		Team finalRound = playGame(round1, round2);
		
		return finalRound;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		torniment();
		
		
		
	}


}
