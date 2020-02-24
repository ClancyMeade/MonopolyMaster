import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CommunityChestReader
	{
		static String[] statements;

		public static void readCommunityChest() throws FileNotFoundException
			{
				Scanner file = new Scanner(new File("communityChestCards"));

				while (file.hasNext())
					{
						String information = file.nextLine();
						statements = information.split("[+]");
					}
			}
	}
