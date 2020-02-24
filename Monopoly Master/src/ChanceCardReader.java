import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChanceCardReader
	{
		static String[] chanceStatements;

		public static void readChanceCards() throws FileNotFoundException
			{
				Scanner file = new Scanner(new File("chanceCards"));

				while (file.hasNext())
					{
						String information = file.nextLine();
						chanceStatements = information.split("[+]");
					}
			}
	}
