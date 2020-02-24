
public class PassGo extends NotBuyable
	{
		// PassGo cannot be cast as to class Buyable properties
		private int getMoney;

		// name, type, place on board, on space, get money
		public PassGo(String n, String t, int pOB, boolean oS, int gM)
			{
				super(n, t, pOB, oS);
				getMoney = gM;
			}

		public int getGetMoney()
			{
				return getMoney;
			}

		public void setGetMoney(int getMoney)
			{
				this.getMoney = getMoney;
			}
	}
