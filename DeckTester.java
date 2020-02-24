public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	    String[] thingy0 = {"Ace", "King", "Queen", "Jack", "10"};
	    String[] thingy1 = {"Clubs", "Hearts"};
	    int[] thingy2 = {14, 13, 12, 11, 10};
	    Deck thingy = new Deck(thingy0, thingy1,thingy2);
	    System.out.println(thingy.size());
	    thingy.deal();
	    System.out.println(thingy.size());
	    System.out.println(thingy.toString());
	    thingy.deal();
	    thingy.deal();
	    System.out.println(thingy.toString());
	}
}
