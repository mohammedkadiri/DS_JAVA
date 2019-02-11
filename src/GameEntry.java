
import java.util.*;
/**
 * 
 * @author Mo
 * Create an array A of GameEntry objects which has an integer scores field and we clone
 * A and store the result in array B. And we immediately set A[1].score equal to 550. 
 * What is the value of the GameEntry object referenced by B[4]
 *
 */
public class GameEntry {
	
	protected int scores; 
	
	GameEntry(int scores){
		this.scores = scores;
	}
	
	// setter method
	
	public void updateScores(int scores) {
		this.scores = scores;
	}
	
	// getter method
	
	public int getScores() {
		return this.scores;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameEntry[] A =  new GameEntry[2];
		GameEntry[] B =  new GameEntry[2];
		
		A[0] = new GameEntry(100);
		
		A[1] = new GameEntry(200);
		
		B[1] = new GameEntry(300);
		
		System.out.println("GameEntry B[1] before we clone A: " +B[1].getScores());
		
		B = A.clone();
		
		A[1].updateScores(550);
		
		System.out.println("GameEntry B[1] after we clone A: " + B[1].getScores());
		
	}

}
