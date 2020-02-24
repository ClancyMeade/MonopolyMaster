
public class SwitchPlayers
	{

		public static void switchCurrentPlayer()
			{
				if (Playing.currentPlayer == 0)
					{
						Playing.currentPlayer = 1;
						Playing.notCurrentPlayer = 0;
					} else
					{

						Playing.currentPlayer = 0;
						Playing.notCurrentPlayer = 1;

					}
			}

	}
