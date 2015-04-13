/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

 /**
  * The main method in this class checks the Deck operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) 
 {
   
    /*
    String[] rank1 = {"7", "Ace", "King"};
    String[] suit1 = {"Spade", "Heart", "Diamond"};
    int[] value1 = {7, 11, 10};
    Deck deck1 = new Deck (rank1, suit1, value1);
    
    for( int i = 1; i < rank1.length+2; i++ )
    {
      System.out.println("Deck 1 deal number " + i);
      System.out.println("Deck size: " + deck1.size());
      System.out.println("Card dealt: " + deck1.deal());
      System.out.println("Is empty: " + deck1.isEmpty());
      System.out.println();
    }
    
    String[] rank2 = {"9", "King", "Queen", "4"};
    String[] suit2 = {"Spade", "Club", "Diamond", "Club"};
    int[] value2 = {9, 10, 10, 4};
    Deck deck2 = new Deck (rank2, suit2, value2);
 
       for( int i = 1; i < rank2.length+2; i++ )
    {
      System.out.println("Deck 2 deal number " + i);
      System.out.println("Deck size: " + deck2.size());
      System.out.println("Card dealt: " + deck2.deal());
      System.out.println("Is empty: " + deck2.isEmpty());
      System.out.println();
    }
 
   
    String[] rank3 = {"5", "6", "Jack", "King", "Ace"};
    String[] suit3 = {"Diamond", "Diamond", "Club", "Heart", "Club"};
    int[] value3 = {5, 6, 10, 10, 11};
    Deck deck3 = new Deck (rank3, suit3, value3);
    
       for( int i = 1; i < rank3.length+2; i++ )
    {
      System.out.println("Deck 3 deal number " + i);
      System.out.println("Deck size: " + deck3.size());
      System.out.println("Card dealt: " + deck3.deal());
      System.out.println("Is empty: " + deck3.isEmpty());
      System.out.println();
    }
    
      */
   
    String[] rank4 = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] suit4 = {"Diamond", "Diamond", "Diamond", "Diamond", "Diamond", "Diamond", "Diamond", "Diamond", "Diamond", "Diamond", "Diamond", "Diamond", "Diamond", "Heart", "Heart", "Heart", "Heart", "Heart", "Heart", "Heart", "Heart", "Heart", "Heart", "Heart", "Heart", "Heart", "Club", "Club", "Club", "Club", "Club", "Club", "Club", "Club", "Club", "Club", "Club", "Club", "Club", "Spade", "Spade", "Spade", "Spade", "Spade", "Spade", "Spade", "Spade", "Spade", "Spade", "Spade", "Spade", "Spade"};
    int[] value4 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
    Deck deck4 = new Deck (rank4, suit4, value4);
    System.out.println(deck4.toString()); // no card dealt
    int iCardDealt = 4;
    for( int i = 0; i < iCardDealt; i++ )
     deck4.deal();
    System.out.println(deck4.toString());  // the deck dealt iCardDealt times
    
 }
}
