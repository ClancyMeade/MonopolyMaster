import java.util.Scanner;
import java.util.ArrayList; 

public class Introduction
	{
		static Scanner userStringInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userInput = new Scanner(System.in); 
		
		public static void greetPlayers()
    {
			
			
				System.out.println("Hello, welcome to Monopoly, would you like the instructions? \n(1) Yes \n(2) No");
				

				boolean wrongNumber = true;
       
				while (wrongNumber)
					{
					
					int wantInstructions = userIntInput.nextInt();
					
						if (wantInstructions == 1)
							{
								wrongNumber = false;
								giveInstructions();
							}

						else if (wantInstructions == 2)
							{
								wrongNumber = false;
								System.out.println("Great! Lets play some Monopoly!");
							}

						else
							{
								System.out.println("You only have tow options, please choose again.");
							}
					}
			
				System.out.println("What theme would you like to use? \n(1) Standard \n(2) National Parks");
				
				int choosingTheme = userIntInput.nextInt();
				
				System.out.println();
				
				if (choosingTheme == 1)
					{
					MonopolyRunner.changeThemes = 0;
					System.out.println("Great, you chose \"Standard Monopoly\"");
					}
				
				else if (choosingTheme == 2)
					{
					MonopolyRunner.changeThemes = 1;
					System.out.println("Great, you chose \"National Parks Monopoly\"");
					}
				
				
				
				System.out.println();

				System.out.println("Player 1, what is your name?");
				String playerOneName = userStringInput.nextLine();
				System.out.println("Great! Hello " + playerOneName + ", you are player 1.");

				
				ArrayList<BuyableProperties> playerOneProperties = new ArrayList<BuyableProperties>(); 
				MonopolyRunner.players.add(new Player(playerOneName, 1500, 0, playerOneProperties, false, false, false));
				System.out.println();
				
				
				

				System.out.println("Player 2, what is your name?");
				String playerTwoName = userStringInput.nextLine();
				System.out.println("Great! Hello " + playerTwoName + ", you are player 2.");

				
				ArrayList<BuyableProperties> playerTwoProperties = new ArrayList<BuyableProperties>(); 
				MonopolyRunner.players.add(new Player(playerTwoName, 1500, 0, playerTwoProperties, false, false, false));
				System.out.println();
				
				
			
			}


		public static void giveInstructions()

		{ 
			System.out.println("This is a work in progress...");
		}
		
		

	}
