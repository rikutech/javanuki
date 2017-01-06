package javanuki;

public class Card
{
	//JOKERはnumberで判断する(suitではない)
	public static final int JOKER        = 0;
	
	public static final int SUIT_SPADE   = 1;
	public static final int SUIT_DIAMOND = 2;
	public static final int SUIT_CLUB    = 3;
	public static final int SUIT_HEART   = 4;

	private int suit;
	private int number;

	public Card(int suit, int number)
	{
		this.suit   = suit;
		this.number = number;
	}

	public int getNumber()
	{
		return number;
	}
	
	public String getSuitChar()
	{
		String suitChar;
		switch (this.suit) {
		case SUIT_SPADE:
			suitChar = "S";
			break;
		case SUIT_DIAMOND:
			suitChar = "D";
			break;
		case SUIT_CLUB:
			suitChar = "C";
			break;
		case SUIT_HEART:
			suitChar = "H";
			break;					
		default:
			suitChar = "";
			break;
		}
		return suitChar;
	}

	public String getNumChar()
	{
		String numChar;
		switch (this.number) {
		case 1:
			numChar = "A";
			break;
		case 10:
			numChar = "T";
			break;
		case 11:
			numChar = "J";
			break;
		case 12:
			numChar = "Q";
			break;
		case 13:
			numChar = "K";
			break;
		default:
			numChar = String.valueOf(this.number);
		}
		return numChar;
	}	

	public String toString()
	{
		StringBuffer string = new StringBuffer();

		if (this.number > 0) {
			String suitChar = this.getSuitChar();
			string.append(suitChar);
			String numChar  = this.getNumChar();
			string.append(numChar);
			
		} else {
			string.append("JK");
		}
		
		return string.toString();
	}
}
