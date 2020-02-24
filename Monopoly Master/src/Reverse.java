
public class Reverse
	{
		static boolean reverser = false;
		static int i = 0;

		public static void reverseYo()
			{
				if (i == 0)
					{
						if (MonopolyRunner.board
								.get(MonopolyRunner.players.get(Playing.currentPlayer).getPlaceOnBoard()).getName()
								.equals("Free Parking"))
							{
								reverser = true;
								i++;
							}
					} else if (i == 1)
					{
						if (MonopolyRunner.board
								.get(MonopolyRunner.players.get(Playing.currentPlayer).getPlaceOnBoard()).getName()
								.equals("Free Parking"))
							{
								reverser = false;
								i--;
							}
					}
				if (reverser)
					{
						MonopolyRunner.players.get(Playing.currentPlayer).setPlaceOnBoard(
								MonopolyRunner.players.get(Playing.currentPlayer).getPlaceOnBoard() - Dice.diceTotal);
					} else
					{
						MonopolyRunner.players.get(Playing.currentPlayer).setPlaceOnBoard(
								MonopolyRunner.players.get(Playing.currentPlayer).getPlaceOnBoard() + Dice.diceTotal);
					}

			}
	}
