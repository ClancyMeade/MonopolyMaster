import java.util.Collections;

public class Playing
	{
		// which player is it
		static int currentPlayer = 1;
		static int notCurrentPlayer = 0;

		static boolean playingGame = true;

		static int diceRoll;

		public static void play()
			{
				while (playingGame)
					{
						SwitchPlayers.switchCurrentPlayer();

						checkMoney();

						boolean submenu = true;
						while (submenu)
							{
								System.out.println();
								System.out.println(MonopolyRunner.players.get(currentPlayer).getName()
										+ ", what would you like to do? " + "\n(1) Roll Dice" + "\n(2) See Balance"
										+ "\n(3) See Properties Owned");
								int chooseSubmenu = MonopolyRunner.userIntInput.nextInt();

								if (chooseSubmenu == 1)
									{
										submenu = false;
										break;
									} else if (chooseSubmenu == 2)
									{
										System.out.println("Your total balance is $"
												+ MonopolyRunner.players.get(currentPlayer).getTotalMoney());
									} else if (chooseSubmenu == 3)
									{
										System.out.println("These are your properties owned:");
										int counter = 1;
										Collections.sort(
												MonopolyRunner.players.get(currentPlayer).getPlayerProperties(),
												new BoardSorter());
										for (BuyableProperties p : MonopolyRunner.players.get(Playing.currentPlayer)
												.getPlayerProperties())
											{
												System.out.println(counter + ": " + p.getName());
												counter++;
											}
									}
							}

						if (checkJail())
							{
								String playerName = MonopolyRunner.players.get(currentPlayer).getName();

								System.out.println(playerName + ", you don't get to roll this turn. You're in Jail!");

								MonopolyRunner.players.get(currentPlayer).setInJail(false);

							}

						else
							{
								introduceTurn();

								diceRoll = Dice.rollDice();

								if (checkReverse())
									{
										moveBackwards();
									} else
									{
										moveForward();
									}

								System.out.println();
								System.out.println(MonopolyRunner.players.get(currentPlayer).getName()
										+ ", you rolled a total of " + diceRoll + ".\n\nYou landed on "
										+ MonopolyRunner.board
												.get(MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard())
												.getName()
										+ ".");

								OptionsWhenYouLand.landOnPlace();
								System.out.println();
								System.out.println(
										"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

							}

					}
			}

		private static void introduceTurn()
			{
				System.out.println();
				System.out
						.println(MonopolyRunner.players.get(currentPlayer).getName()
								+ ", you are at " + MonopolyRunner.board
										.get(MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard()).getName()
								+ ".");
				System.out.println("Press enter to roll the dice.");
				String enterToContinue = MonopolyRunner.userStringInput.nextLine();

			}

		private static boolean checkJail()
			{
				if (MonopolyRunner.players.get(currentPlayer).isInJail())
					return true;

				return false;

			}

		private static boolean checkReverse()
			{
				if (MonopolyRunner.players.get(currentPlayer).isInReverse())
					return true;

				return false;
			}

		private static void moveForward()
			{
				int previousMoney = MonopolyRunner.players.get(currentPlayer).getTotalMoney();

				if ((MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard() + diceRoll > 39)
						&& !(MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard() == 40))
					{
						MonopolyRunner.players.get(currentPlayer).setPlaceOnBoard(passGoForward());
						passGoOverTurn();
					} else if (MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard() == 40)
					{
						System.out.println("You pay $50 to get out of jail.");
						MonopolyRunner.players.get(currentPlayer).setTotalMoney(previousMoney - 50);
						MonopolyRunner.players.get(currentPlayer).setPlaceOnBoard(10 + diceRoll);
					} else
					{
						MonopolyRunner.players.get(currentPlayer).setPlaceOnBoard(
								MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard() + diceRoll);
					}
			}

		private static void moveBackwards()
			{
				int previousMoney = MonopolyRunner.players.get(currentPlayer).getTotalMoney();

				if (MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard() - diceRoll < 0
						&& !(MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard() == 40))
					{
						MonopolyRunner.players.get(currentPlayer).setPlaceOnBoard(passGoBackward());
						passGoOverTurn();
					} else if (MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard() == 40)
					{
						System.out.println("You pay $50 to get out of jail.");
						MonopolyRunner.players.get(currentPlayer).setTotalMoney(previousMoney - 50);
						MonopolyRunner.players.get(currentPlayer).setPlaceOnBoard(10 - diceRoll);
					} else
					{
						MonopolyRunner.players.get(currentPlayer).setPlaceOnBoard(
								MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard() - diceRoll);
					}
			}

		private static int passGoForward()
			{
				int toGo = 39 - MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard();
				return diceRoll - toGo - 1;
			}

		private static int passGoBackward()
			{
				int toGo = MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard();
				return 40 - (diceRoll - toGo);
			}

		private static void passGoOverTurn()
			{
				System.out.println("You passed go! You get $200!");
				int previousMoney = MonopolyRunner.players.get(currentPlayer).getTotalMoney();

				MonopolyRunner.players.get(currentPlayer).setTotalMoney(previousMoney + 200);
				System.out
						.println("You now have $" + MonopolyRunner.players.get(currentPlayer).getTotalMoney() + ".\n");
			}

		private static void checkMoney()
			{
				if (MonopolyRunner.players.get(currentPlayer).getTotalMoney() <= 0)
					{
						System.out.println();
						System.out.println(MonopolyRunner.players.get(currentPlayer).getName()
								+ ", you lose. You ran out of money. "
								+ MonopolyRunner.players.get(notCurrentPlayer).getName() + ", you won!!");
						System.exit(0);
					}

			}

	}
