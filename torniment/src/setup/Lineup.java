package setup;

import java.util.ArrayList;

public class Lineup {

	private ArrayList<Team> teams;

	  public Lineup() {
	    this.teams= new ArrayList<Team>();
	  }

	  public void add(Team team) {
	    this.teams.add(team);
	  }
	  
	  public Team get(int num) {
		  Team x = this.teams.get(num);
	    return x;
	  }

	  public void clear() {
	    this.teams.clear();
	  }

	  public void report() {
	    for (Team team : this.teams) {
	      team.getInfo();
	    }
	  }
	 

}
