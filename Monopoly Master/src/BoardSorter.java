import java.util.Comparator;

public class BoardSorter implements Comparator<Board>
	{

		public int compare(Board p1, Board p2)
			{
				return p1.getPlaceOnBoard() - p2.getPlaceOnBoard();
			}

	}
