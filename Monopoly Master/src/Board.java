public abstract class Board
	{
		protected String name;
		protected String type;
		protected int placeOnBoard;

		public Board(String n, String t, int pOB)
			{
				name = n;
				type = t;
				placeOnBoard = pOB;
			}

		public String getType()
			{
				return type;
			}

		public void setType(String type)
			{
				this.type = type;
			}

		public int getPlaceOnBoard()
			{
				return placeOnBoard;
			}

		public void setPlaceOnBoard(int placeOnBoard)
			{
				this.placeOnBoard = placeOnBoard;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}
	}
