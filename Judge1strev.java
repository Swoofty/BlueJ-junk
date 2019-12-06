import java.util.Scanner;

public class Judge1strev
{
  private int playerNumber;
	private int computerNumber;
	private int playerScore = 0;
	private int computerScore = 0;
	Scanner userInput = new Scanner(System.in);
	public void gameCode(){
		System.out.println("Welcome to the random game! Press the Enter Key to start");
		userInput.nextLine();
		while(playerScore < 99 && computerScore < 99){
			playerNumber = (int)(Math.random() * (9 - 1) + 1);
			computerNumber = (int)(Math.random() * (9 - 1) + 1);
			if(playerNumber > computerNumber){
				playerScore += 3;
				System.out.println("You won this round! You had the number " + playerNumber + " while your opponent had " + computerNumber);
			}
			if(computerNumber > playerNumber){
				computerScore += 3;
				System.out.println("You lost this round! You had the number " + playerNumber + " while your opponent had " + computerNumber);
			}
			if (playerNumber == computerNumber){
				System.out.println("It's a tie! You both got the number " + playerNumber);
			}
			System.out.println("The score is currently (You:) " + playerScore + " to " + computerScore + "\n Press the Enter Key to continue");
			userInput.nextLine();
		}
		if(playerScore > computerScore){
			System.out.println("Congrats you won the completely random game! Thanks for playing!");
		}
		if(computerScore > playerScore){
			System.out.println("Game Over :( Better luck next time! Thanks for playing!");
		} 
		if(computerScore == playerScore){
			System.out.println("It's either a tie that happened or a bug! Anyways Thanks for playing!");
		}
		System.out.println("Final Score: Player: " + playerScore + " Opponent: " + computerScore);	
	}
  public static void main(String[] args) {
    Judge1strev gamers = new Judge1strev();
    gamers.gameCode();
  }
}