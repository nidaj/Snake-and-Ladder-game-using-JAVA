import java.util.Random;

public class SnakeAndLadder {
	int userPos;
	int dice;
	int option;
	//int newPos;
	public SnakeAndLadder(){
		userPos = 0;
		System.out.println("User ready to Go....");
	}
	static {
		System.out.println("Welcome to Snakes and Ladders Game");
	}
	
	public void rollDice(){
		Random rand = new Random();
		int move;
		dice = rand.nextInt(5)+1;
		System.out.println(dice);
		move = playGame();
		if(move==1) {
			userPos = userPos + dice;
			System.out.println("User At Position: " + userPos);
		}
		else if(move==2) {
//			newPos=userPos-dice;
			if((userPos-dice)<0) {
				System.out.println("User back to start");
				userPos=0;
			}
		}
		else {
			System.out.println("Stay in place");	
			}
		}

  
	public int playGame() {
		Random rand = new Random();
		option = rand.nextInt(3);
		if(option==0) {
			System.out.println("No play");
			return 0;
		}
		else if(option==1) {
			System.out.println("Ladder");
			return 1;	
		}
		else {
			System.out.println("Snake");
			return 2;
		}
		
	}

	public static void main(String[] args) {
		SnakeAndLadder user = new SnakeAndLadder();
		user.rollDice();

	}

}
