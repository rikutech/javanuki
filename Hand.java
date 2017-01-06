package javanuki;
import java.util.ArrayList;


/**
 * In this case, Hand means cards in someone's hand.
 */
public class Hand
{	
	private ArrayList<Card> hand = new ArrayList<Card>();

	public int getCardCount()
	{
		return this.hand.size();
	}

	public void addCard(Card card)
	{
		this.hand.add(card);
	}

	public Card pickCard()
	{
		Card pickedCard = (Card) this.hand.remove(0);
		return pickedCard;
	}

	public void shuffle()
	{
		int cardCount = this.hand.size();

		int position;

		for (int i = 0; i < cardCount * 2; i++) {
			//Casting double to int rounds down the double to the nearest int.
			//Therefore the position should be int from 0 to cardCount.
			position = (int) (Math.random() * cardCount);
			Card pickedCard = (Card) this.hand.remove(position);
			this.hand.add(pickedCard);
		}
	}

	public Card[] findSameNumberCard()
	{
		int cardCount = this.hand.size();
		Card[] sameCards = new Card[0];

		if (cardCount < 1) {
			return sameCards;
		}

		int lastIndex = cardCount - 1;
		Card lastAddedCard = (Card) this.hand.get(lastIndex);

		for (int i = 0; i < lastIndex; i++) {
			Card card = (Card) this.hand.get(i);
			if (card.getNumber() == lastAddedCard.getNumber()) {
				sameCards = new Card[2];
				sameCards[0] = (Card) this.hand.remove(lastIndex);
				sameCards[1] = (Card) this.hand.remove(i);
				break;
			}
		}
		return sameCards;	
	}

	public String toString()
	{
		StringBuffer string = new StringBuffer();

		int cardCount = this.hand.size();
		if (cardCount < 0) {
			return string.toString();
		}

		for (int i = 0; i < cardCount; i++) {
			Card card = (Card) this.hand.get(i);
			string.append(card);
			string.append(" ");
		}
		return string.toString();
	}
}
