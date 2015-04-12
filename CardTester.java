/**
 * This is a class that tests the Card class.
 */
public class CardTester {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  Card card1 = new Card("Spade", "7", 7);
  Card card2 = new Card("Spade", "7", 7);
  Card card3 = new Card("Spade", "Queen", 11);

  System.out.println(card3.toString());
  
  System.out.println("Card 1 and Card 2 matches: " + card2.matches(card1));
  System.out.println("Card 2 and Card 3 matches: " + card2.matches(card3));
  System.out.println("Card 1 Suit: " + card1.getSuit());
  System.out.println("Card 2 Suit: " + card2.getSuit());
  System.out.println("Card 3 Suit: " + card3.getSuit());
  System.out.println("Card 1 Rank: " + card1.getRank());
  System.out.println("Card 2 Rank: " + card2.getRank());
  System.out.println("Card 3 Rank: " + card3.getRank());
  System.out.println("Card 1 Point Value: " + card1.getPointValue());
  System.out.println("Card 2 Point Value: " + card2.getPointValue());
  System.out.println("Card 3 Point Value: " + card3.getPointValue());
 }
}
