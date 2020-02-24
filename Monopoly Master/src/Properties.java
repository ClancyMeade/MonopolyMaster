import java.util.ArrayList;

public class Properties extends BuyableProperties
	{
		protected int housesBought;
		protected boolean hotel;
		protected String color;
		protected boolean canPlaceHouses;
		protected int houseCost;
		protected ArrayList<Integer> housesAndHotels;

		// <name>, <price>, bought, <costWhenLandedOn>, housesBought, isHotel, <Color>,
		// CanPlaceHouses, <houseCost> <Houses and Hotels>
		public Properties(String n, String t, int pOB, int p, boolean b, int cWLO, int hB, boolean h, String c,
				boolean cPH, int hC, ArrayList<Integer> hAH)
			{
				super(n, t, pOB, p, b, cWLO);
				housesBought = hB;
				hotel = h;
				color = c;
				canPlaceHouses = cPH;
				houseCost = hC;
				housesAndHotels = hAH;
			}

		public ArrayList<Integer> getHousesAndHotels()
			{
				return housesAndHotels;
			}

		public void setHousesAndHotels(ArrayList<Integer> housesAndHotels)
			{
				this.housesAndHotels = housesAndHotels;
			}

		public int getHouseCost()
			{
				return houseCost;
			}

		public void setHouseCost(int houseCost)
			{
				this.houseCost = houseCost;
			}

		public int getHousesBought()
			{
				return housesBought;
			}

		public void setHousesBought(int housesBought)
			{
				this.housesBought = housesBought;
			}

		public boolean isHotel()
			{
				return hotel;
			}

		public void setHotel(boolean hotel)
			{
				this.hotel = hotel;
			}

		public String getColor()
			{
				return color;
			}

		public void setColor(String color)
			{
				this.color = color;
			}

		public boolean isCanPlaceHouses()
			{
				return canPlaceHouses;
			}

		public void setCanPlaceHouses(boolean canPlaceHouses)
			{
				this.canPlaceHouses = canPlaceHouses;
			}

	}
