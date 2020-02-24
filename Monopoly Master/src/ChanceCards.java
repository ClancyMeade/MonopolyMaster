import java.util.ArrayList;

public class ChanceCards extends NotBuyable
	{
		protected ArrayList<String> cards;
		protected boolean alreadyPicked;

		public ChanceCards(String n, String t, int pOB, boolean oS, boolean aP)
			{
				super(n, t, pOB, oS);
				// cards = c;
				alreadyPicked = aP;
			}

//		public ArrayList<String> getCards()
//			{
//				return cards;
//			}
//
//		public void setCards(ArrayList<String> cards)
//			{
//				this.cards = cards;
//			}

		public boolean isAlreadyPicked()
			{
				return alreadyPicked;
			}

		public void setAlreadyPicked(boolean alreadyPicked)
			{
				this.alreadyPicked = alreadyPicked;
			}

	}
