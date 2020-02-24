
public class MakeOtherPieces
	{
		public static void makeChanceCards()
			{
				MonopolyRunner.board.add(new ChanceCards("Chance", "Chance", 7, false, false));
				MonopolyRunner.board.add(new ChanceCards("Chance", "Chance", 22, false, false));
				MonopolyRunner.board.add(new ChanceCards("Chance", "Chance", 36, false, false));
			}

		public static void makeCommunityChest()
			{
				MonopolyRunner.board.add(new ChanceCards("Community Chest", "Community Chest", 2, false, false));
				MonopolyRunner.board.add(new ChanceCards("Community Chest", "Community Chest", 17, false, false));
				MonopolyRunner.board.add(new ChanceCards("Community Chest", "Community Chest", 33, false, false));
			}

		public static void makeRailroads()
			{
				if (MonopolyRunner.changeThemes == 1)
					{
						MonopolyRunner.board
								.add(new Railroads("Narrow Gauge Railroad", "Railroad", 5, 200, false, 25, 0));
						MonopolyRunner.board.add(
								new Railroads("The Chesapeake and Ohio Railroad", "Railroad", 15, 200, false, 25, 0));
						MonopolyRunner.board.add(new Railroads("The Nashville and Chattanooga Railroad", "Railroad", 25,
								200, false, 25, 0));
						MonopolyRunner.board
								.add(new Railroads("The Scenic Railroad", "Railroad", 35, 200, false, 25, 0));
					} else if (MonopolyRunner.changeThemes == 0)
					{
						MonopolyRunner.board.add(new Railroads("Reading Railroad", "Railroad", 5, 200, false, 25, 0));
						MonopolyRunner.board
								.add(new Railroads("Pennsylvania Railroad", "Railroad", 15, 200, false, 25, 0));
						MonopolyRunner.board.add(new Railroads("B & O Railroad", "Railroad", 25, 200, false, 25, 0));
						MonopolyRunner.board
								.add(new Railroads("Short Line Railroad", "Railroad", 35, 200, false, 25, 0));
					}
			}

		public static void makeUtilities()
			{
				// name, type, place on board, price, is bought, cost when landed on, both
				MonopolyRunner.board.add(new Utilities("Electric Company", "Utility", 12, 150, false, 1, false));
				MonopolyRunner.board.add(new Utilities("Water Works", "Utility", 28, 150, false, 1, false));
			}

		public static void makeAllOthers()
			{
				// Free Parking --> name, type, place on board, on space, reverse
				MonopolyRunner.board.add(new FreeParking("Free Parking", "Free Parking", 20, false, false));

				// Taxes --> name, type, place on board, on space, amount to pay
				MonopolyRunner.board.add(new Tax("Income Tax", "Tax", 4, false, 200));
				MonopolyRunner.board.add(new Tax("Luxury Tax", "Tax", 38, false, 75));

				// Jail --> name, jail, place on board, on space, in jail, number of rolls in
				// jail
				MonopolyRunner.board.add(new Jail("Just Visiting", "Jail", 10, false, false, 0));
				MonopolyRunner.board.add(new Jail("Jail", "Jail", 40, false, true, 3));
				MonopolyRunner.board.add(new Jail("Go to Jail", "Jail", 30, false, false, 0));

				// Go --> name, type, place on board, on space, get money
				MonopolyRunner.board.add(new PassGo("Go", "PassGo", 0, false, 200));

			}
	}
