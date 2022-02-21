package Exercise2;

public class Deck {
	//Properties
	private String[] Suit = {"heart","backheart","diamond"};
	String Value = "";
	String deck= "";
	String Game = "";
	static int numDeck = 1;
	
	//Empty Constructor
		public Deck() {
		}
	//Constructor with one Arguments
		public Deck(String[] Suit, String Value ,String deck, String Game, int numDeck ) {
			this.Suit = Suit;
			this.Value = Value;
			this.deck = deck;
			this.Game = Game;
		}
	

}
