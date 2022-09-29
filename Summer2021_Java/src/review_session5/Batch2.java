package review_session5;

import static review_session5.Test_Automation.*;

public class Batch2 {
	
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);//right-click->run configurations->args
		
		switch(month) {
			case 0: 
			case 1: buildTeam(26); break;
			case 2: 
			case 3: buildTeam(26, "Agile"); break;
			case 4:
			case 5:
			case 6: buildTeam(26, "SDETs", "Agile"); break;
			default: buildTeam(); break;
		}
	}
}