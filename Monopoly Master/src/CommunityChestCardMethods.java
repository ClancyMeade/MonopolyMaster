
public class CommunityChestCardMethods
	{

		static String currentCard;

		public static void findCard()
			{

				int randomNumber = (int) (Math.random() * 5);
				currentCard = CommunityChestReader.statements[randomNumber];
				System.out.println("Your card is: " + "\"" + currentCard + "\"");
				int playerCurrentMoney = MonopolyRunner.players.get(Playing.currentPlayer).getTotalMoney();

				if (currentCard.equals("Receive $25 consultancy fee"))
					{
						System.out.println("You just gained $25!");
						MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(playerCurrentMoney + 25);
					}

				else if (currentCard.equals("From sale stock you get $50"))
					{
						System.out.println("You just gained $50!");
						MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(playerCurrentMoney + 50);
					}

				else if (currentCard.equals("Bank error in your favor. Collect $200"))
					{
						System.out.println("You just gained $200!");
						MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(playerCurrentMoney + 200);
					}

				else if (currentCard.equals("Pay School fees of $50"))
					{
						System.out.println("You just lost $50.");
						MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(playerCurrentMoney - 50);
					}

				else if (currentCard.equals("Pay hospital fees of $100"))
					{
						System.out.println("You just lost $100");
						MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(playerCurrentMoney - 100);
					}

			}

	}
