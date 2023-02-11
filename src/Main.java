import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<int[][]> tb = Table.getTable();
		Table.printTable(tb);
		Table.startGame(tb);
		
	}

}