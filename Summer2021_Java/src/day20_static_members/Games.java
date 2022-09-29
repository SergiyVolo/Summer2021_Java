package day20_static_members;

public class Games {

	public static void main(String[] args) {
		
		Game game1 = new Game();
		game1.addPlayer(4);
		game1.addPlayer(5);
		game1.gameName = "Basketball";
		
		System.out.println(Game.numOfPlayers);
		System.out.println(Game.gameName);
		
		Game game2 = new Game();
		game2.addPlayer(2);
		game2.addPlayer(1);
		game2.gameName = "Tennis";
		
		System.out.println(game2.numOfPlayers);
		System.out.println(game2.gameName);
		
//		System.out.println(game1.numOfPlayers);
//		System.out.println(game1.gameName);
		
		Game game3 = new Game();
		game3.addPlayer(2);
		game3.gameName = "Chess";
		
		System.out.println(game3.numOfPlayers);
		System.out.println(game3.gameName);
		
		System.out.println(Game.gameName);
		System.out.println(Game.gameName);
		System.out.println(Game.gameName);
		
		System.out.println(game3);  // hashcode?
	}
}
