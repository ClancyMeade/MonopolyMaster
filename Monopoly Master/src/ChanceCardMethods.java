
public class ChanceCardMethods
	{
		static String currentCardChance;

		public static void findCard()
			{
				int randomNumber = (int) (Math.random() * 4);
				currentCardChance = ChanceCardReader.chanceStatements[randomNumber];
				System.out.println("Your card is: " + "\"" + currentCardChance + "\"");
				int playerCurrentMoney = MonopolyRunner.players.get(Playing.currentPlayer).getTotalMoney();

				if (currentCardChance.equals("Speeding fine $15"))
					{
						System.out.println("You just lost $15.");
						MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(playerCurrentMoney - 15);

					}

				else if (currentCardChance.equals("Go to jail. Go Directly to Jail, Do not pass Go do not collect 200"))
					{
						System.out.println("Now moving you to Jail...");
						MonopolyRunner.players.get(Playing.currentPlayer).setPlaceOnBoard(40);
						MonopolyRunner.players.get(Playing.currentPlayer).setInJail(true);
					}

				else if (currentCardChance.equals("Go back 3 spaces"))
					{
						System.out.println("Moving you back 3 spaces...");
						int currentPlaceOnBoard = MonopolyRunner.players.get(Playing.currentPlayer).getPlaceOnBoard();
						MonopolyRunner.players.get(Playing.currentPlayer).setPlaceOnBoard(currentPlaceOnBoard - 3);
					}

				else if (currentCardChance.equals("Bank pays you dividend of $50"))
					{
						System.out.println("You just gained $50!");
						MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(playerCurrentMoney + 50);
					}

			}
	}