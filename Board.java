import java.util.ArrayList;
import java.util.List;

public abstract class Board
{
  private Card[] cards;
  private Deck deck;

	public Board(int size, String[] ranks, String[] suits, int[] pointValues) {
		this.cards = new Card[size];
		this.deck = new Deck(ranks, suits, pointValues);
		dealMyCards();
	}

  public void newGame()
  {
    this.deck.shuffle();
    dealMyCards();
  }
  
  public int size()
  {
    return this.cards.length;
  }
  
  public boolean isEmpty()
  {
    for (int i = 0; i < this.cards.length; i++) {
      if (this.cards[i] != null) {
        return false;
      }
    }
    return true;
  }
  
  public void deal(int paramInt)
  {
    this.cards[paramInt] = this.deck.deal();
  }
  
  public int deckSize()
  {
    return this.deck.size();
  }
  
  public Card cardAt(int paramInt)
  {
    return this.cards[paramInt];
  }
  
  public void replaceSelectedCards(List<Integer> paramList)
  {
    for (Integer localInteger : paramList) {
      deal(localInteger.intValue());
    }
  }
 
	/**
	 * Gets the indexes of the actual (non-null) cards on the board.
	 *
	 * @return a List that contains the locations (indexes)
	 *         of the non-null entries on the board.
	 */
	public List<Integer> cardIndexes() {
		List<Integer> selected = new ArrayList<Integer>();
		for (int k = 0; k < this.cards.length; k++) {
			if (this.cards[k] != null) {
				selected.add(new Integer(k));
			}
		}
		return selected;
	}
	
	
  public String toString()
  {
    String str = "";
    if (this.cards.length > 0)
    {
      str = str + this.cards[0];
      for (int i = 1; i < this.cards.length; i++) {
        str = str + ", " + this.cards[i];
      }
    }
    return str;
  }
  
  public boolean gameIsWon()
  {
    if (this.deck.isEmpty())
    {
      for (Card localCard : this.cards) {
        if (localCard != null) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public abstract boolean isLegal(List<Integer> paramList);
  
  public abstract boolean anotherPlayIsPossible();
  
  private void dealMyCards()
  {
    for (int i = 0; i < this.cards.length; i++) {
      this.cards[i] = this.deck.deal();
    }
  }
}
