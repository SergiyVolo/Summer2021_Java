package day20_static_members;

public class Game {
	
	static int numOfPlayers;  // shared class wide
	static String gameName;
	
	public void addPlayer(int players) {
		numOfPlayers = numOfPlayers + players;
	}
	
	public int getNumOfPlayers() {
		return numOfPlayers;
	}
	
	public String toString() {
		return gameName + " " + numOfPlayers;
	}
}

