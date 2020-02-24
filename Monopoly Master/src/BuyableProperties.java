
public abstract class BuyableProperties extends Board
	{
		protected int price;
		protected boolean bought;
		protected int costWhenLandedOn;

		public BuyableProperties(String n, String t, int pOB, int p, boolean b, int cWLO)
			{
				super(n, t, pOB);
				price = p;
				bought = b;
				costWhenLandedOn = cWLO;
			}

		public int getPrice()
			{
				return price;
			}

		public void setPrice(int price)
			{
				this.price = price;
			}

		public boolean isBought()
			{
				return bought;
			}

		public void setBought(boolean bought)
			{
				this.bought = bought;
			}

		public int getCostWhenLandedOn()
			{
				return costWhenLandedOn;
			}

		public void setCostWhenLandedOn(int costWhenLandedOn)
			{
				this.costWhenLandedOn = costWhenLandedOn;
			}

	}
