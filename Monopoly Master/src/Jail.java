
public class Jail extends NotBuyable
	{
		protected boolean inJail;
		protected int numberOfRollsWhileInJail;

		// name, jail, place on board, on space, in jail, number of rolls in jail
		public Jail(String n, String t, int pOB, boolean oS, boolean iJ, int nORWIJ)
			{
				super(n, t, pOB, oS);
				inJail = iJ;
				numberOfRollsWhileInJail = nORWIJ;
			}

		public boolean isInJail()
			{
				return inJail;
			}

		public void setInJail(boolean inJail)
			{
				this.inJail = inJail;
			}

		public int getNumberOfRollsWhileInJail()
			{
				return numberOfRollsWhileInJail;
			}

		public void setNumberOfRollsWhileInJail(int numberOfRollsWhileInJail)
			{
				this.numberOfRollsWhileInJail = numberOfRollsWhileInJail;
			}

	}
