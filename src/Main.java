import java.util.List;

public class Main {

	public static void main(String[] args) {
		int[][] tb = Table.getTable();
		Table.printTable(tb);
		Table.startGame(tb);
		
//		List<int[][]> tb = Table.getTwoTable();
//		Table.printTwoTable(tb);
//		Table.start(tb);
	}

}
