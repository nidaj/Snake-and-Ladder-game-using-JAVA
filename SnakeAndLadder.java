import java.util.Random;

public class SnakeAndLadder {
	final int ENDPOS=100;
	final int STARTPOS=0;
	int userPos;
	int dice;
	int option;
	int dieCounter=0;
	//int newPos;
	public SnakeAndLadder(){
		userPos = STARTPOS;
		System.out.println("User ready to Go....");
	}
	static {
		System.out.println("************Welcome to Snakes and Ladders Game*****************");
	}
	
	public void rollDice(){
		Random randomRoll = new Random();
		int move;
		while(userPos<ENDPOS) {
			dice = randomRoll.nextInt(6)+1;
			System.out.println("Dice Rolled value: " + dice);
			move = playGame();
			switch(move){
			  case 1: 
				  if((userPos+dice)<= ENDPOS) {
					  userPos = userPos + dice;
					  System.out.println("User At Position: " + userPos);
				  }
				  else {
					  System.out.println("We are getting More than : " +ENDPOS);
				  }
				  break;
			  case 2:
				  if((userPos-dice)<0) {
					  System.out.println("User back to start");
					  userPos=0;
					  System.out.println("User Position at: " + userPos);
				  }
				  else {
					  userPos = userPos - dice;
					  System.out.println("User Position at: " + userPos);
				  }
				  break;
			  default:
				  System.out.println("Stay in place");
				  System.out.println("User Position at: " + userPos);
			}
			dieCounter++;
		}
		System.out.println("You Finally Reached "+ ENDPOS +" with Rolling Count: "+dieCounter);
	}

	public int playGame() {
		Random randomOption = new Random();
		option = randomOption.nextInt(3);
		if(option==0) {
			System.out.println("Option : No play");
			return 0;
		}
		else if(option==1) {
			System.out.println("Option: Ladder");
			return 1;	
		}
		else {
			System.out.println("Option: Snake");
			return 2;
		}
		
	}

	public static void main(String[] args) {
		SnakeAndLadder user = new SnakeAndLadder();
		user.rollDice();
	}
}
