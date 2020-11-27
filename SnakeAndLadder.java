import java.util.Random;

public class SnakeAndLadder {
  	int userPos;
	int diceRoll;
  	public SnakeAndLadder(){
	    	userPos = 0;
	}
  	public void rollDie(){
    		Random rand = new Random();
		diceRoll = rand.nextInt(5)+1;
		System.out.println(diceRoll);
//		userPos = userPos + diceRoll;
		System.out.println("Die Value: " + diceRoll);
	}
	public static void main(String[] args) {
		SnakeAndLadder user = new SnakeAndLadder();
	    	user.rollDie();
	}
}
