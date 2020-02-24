import java.util.Scanner;

public class BuyThings
	{
		static Scanner userStringInput = new Scanner(System.in);

		public static void buyPlaces()
			{
				// buy property
				if (MonopolyRunner.board.get(OptionsWhenYouLand.place).getType().equals("Property"))
					{
						int currentPrice = ((Properties) MonopolyRunner.board.get(OptionsWhenYouLand.place)).getPrice();
						int currentMoney = MonopolyRunner.players.get(Playing.currentPlayer).getTotalMoney();
						String currentPropertyName = ((Properties) MonopolyRunner.board.get(OptionsWhenYouLand.place))
								.getName();

						System.out.println("The price of this Property is $" + currentPrice + ". You have a total of $"
								+ currentMoney + ", would you like to buy this property?\n(1) Yes\n(2) No");

						String answer = userStringInput.nextLine();

						int currentPlace = MonopolyRunner.players.get(Playing.currentPlayer).getPlaceOnBoard();

						BuyableProperties myPropertyToAdd = ((BuyableProperties) MonopolyRunner.board
								.get(currentPlace));

						if (answer.equals("1") || answer.toUpperCase().equals("YES"))
							{
								MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties()
										.add(myPropertyToAdd);
								int updatedMoney = currentMoney - currentPrice;
								MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(updatedMoney);
								int currentMoneyUpdated = MonopolyRunner.players.get(Playing.currentPlayer)
										.getTotalMoney();
								System.out.println("You now own " + currentPropertyName + ". Your total money is now $"
										+ currentMoneyUpdated + ".");
								((BuyableProperties) MonopolyRunner.board.get(OptionsWhenYouLand.place))
										.setBought(true);

							}

					}

				// buy railroad
				else if (MonopolyRunner.board.get(OptionsWhenYouLand.place).getType().equals("Railroad"))
					{
						int currentPriceTwo = ((Railroads) MonopolyRunner.board.get(OptionsWhenYouLand.place))
								.getPrice();
						int currentMoneyTwo = MonopolyRunner.players.get(Playing.currentPlayer).getTotalMoney();
						String currentPropertyNameTwo = ((Railroads) MonopolyRunner.board.get(OptionsWhenYouLand.place))
								.getName();

						System.out
								.println("The price of this Railroad is $" + currentPriceTwo + ". You have a total of $"
										+ currentMoneyTwo + ", would you like to buy this Railroad?\n(1) Yes\n(2) No");

						String answer = userStringInput.nextLine();

						int currentPlaceTwo = MonopolyRunner.players.get(Playing.currentPlayer).getPlaceOnBoard();

						BuyableProperties myRailroadToAdd = ((BuyableProperties) MonopolyRunner.board
								.get(currentPlaceTwo));

						if (answer.equals("1") || answer.toUpperCase().contentEquals("YES"))
							{
								MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties()
										.add(myRailroadToAdd);
								int updatedMoney = currentMoneyTwo - currentPriceTwo;
								MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(updatedMoney);
								int currentMoneyUpdated = MonopolyRunner.players.get(Playing.currentPlayer)
										.getTotalMoney();
								System.out.println("You now own " + currentPropertyNameTwo
										+ ". Your total money is now $" + currentMoneyUpdated + ".");
								((BuyableProperties) MonopolyRunner.board.get(OptionsWhenYouLand.place))
										.setBought(true);
								int currentNumOfRailOwned = MonopolyRunner.players.get(Playing.currentPlayer)
										.getNumberOfRailroadsOwned();
								MonopolyRunner.players.get(Playing.currentPlayer)
										.setNumberOfRailroadsOwned(currentNumOfRailOwned + 1);
							}
					}

				// buy utility
				else if (MonopolyRunner.board.get(OptionsWhenYouLand.place).getType().equals("Utility"))
					{

						int currentPriceThree = ((Utilities) MonopolyRunner.board.get(OptionsWhenYouLand.place))
								.getPrice();
						int currentMoneyThree = MonopolyRunner.players.get(Playing.currentPlayer).getTotalMoney();
						String currentPropertyNameThree = ((Utilities) MonopolyRunner.board
								.get(OptionsWhenYouLand.place)).getName();

						System.out.println(
								"The price of this Utility is $" + currentPriceThree + ". You have a total of $"
										+ currentMoneyThree + ", would you like to buy this Utility\n(1) Yes\n(2) No");

						String answer = userStringInput.nextLine();

						int currentPlaceThree = MonopolyRunner.players.get(Playing.currentPlayer).getPlaceOnBoard();

						BuyableProperties myUtilityToAdd = ((BuyableProperties) MonopolyRunner.board
								.get(currentPlaceThree));

						if (answer.equals("1") || answer.toUpperCase().equals("YES"))
							{
								MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties()
										.add(myUtilityToAdd);
								int updatedMoney = currentMoneyThree - currentPriceThree;
								MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(updatedMoney);
								int currentMoneyUpdated = MonopolyRunner.players.get(Playing.currentPlayer)
										.getTotalMoney();
								System.out.println("You now own " + currentPropertyNameThree
										+ ". Your total money is now $" + currentMoneyUpdated + ".");
								((BuyableProperties) MonopolyRunner.board.get(OptionsWhenYouLand.place))
										.setBought(true);
								int currentNumOfUtilOwned = MonopolyRunner.players.get(Playing.currentPlayer)
										.getNumberOfUtilitiesOwned();
								MonopolyRunner.players.get(Playing.currentPlayer)
										.setNumberOfUtilitiesOwned(currentNumOfUtilOwned + 1);

							}

					}

			}
	}
