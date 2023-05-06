import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Table {

	public static final int ROW_LENGTH = 5;
	public static final int MATRIX_LENGTH = 9;
	static Scanner scanner = new Scanner(System.in);
	static int[][] tables = {
			{ 19, 35, 49, 71, 85, 8, 14, 47, 54, 74, 6, 25, 36, 62, 84, 15, 22, 58, 7, 89, 12, 31, 43, 68, 9, 1, 42, 65,
					72, 87, 5, 21, 38, 52, 76, 13, 33, 57, 67, 82, 11, 26, 44, 69, 79 },
			{ 7, 16, 32, 66, 73, 18, 29, 46, 55, 88, 2, 23, 34, 5, 75, 4, 3, 4, 61, 78, 1, 27, 41, 56, 86, 2, 39, 59, 6,
					83, 9, 24, 51, 64, 81, 3, 28, 48, 53, 8, 17, 37, 45, 63, 77 },
			{ 13, 2, 41, 61, 86, 3, 24, 34, 52, 71, 1, 35, 56, 64, 83, 7, 23, 36, 53, 75, 5, 48, 59, 72, 84, 14, 28, 42,
					60, 87, 26, 47, 50, 79, 89, 4, 10, 30, 49, 66, 15, 25, 51, 76, 81 },
			{ 9, 16, 46, 65, 80, 11, 32, 45, 68, 78, 8, 21, 33, 57, 73, 6, 20, 43, 63, 77, 12, 31, 54, 62, 85, 19, 39,
					40, 70, 82, 18, 29, 58, 74, 90, 17, 38, 44, 69, 88, 2, 27, 37, 55, 67 },
			{ 19, 32, 58, 64, 84, 13, 20, 48, 55, 77, 2, 21, 46, 75, 82, 6, 18, 39, 62, 70, 25, 41, 59, 74, 83, 17, 38,
					44, 60, 86, 8, 22, 47, 66, 72, 9, 12, 37, 42, 88, 15, 36, 51, 68, 90 },
			{ 5, 29, 30, 56, 80, 10, 35, 54, 63, 81, 4, 26, 45, 61, 79, 3, 14, 43, 50, 71, 7, 23, 31, 52, 73, 11, 28,
					49, 69, 89, 24, 34, 53, 67, 85, 27, 40, 57, 76, 87, 1, 16, 33, 65, 78 },
			{ 6, 18, 47, 69, 86, 13, 31, 44, 61, 70, 7, 24, 34, 56, 71, 5, 23, 41, 65, 74, 10, 37, 53, 60, 89, 17, 38,
					42, 75, 84, 15, 25, 51, 77, 85, 12, 36, 43, 64, 82, 3, 26, 39, 58, 66 },
			{ 16, 28, 45, 68, 87, 4, 29, 35, 55, 73, 9, 30, 54, 62, 88, 1, 21, 33, 52, 76, 8, 40, 50, 79, 81, 11, 20,
					46, 63, 83, 27, 49, 59, 72, 80, 2, 19, 32, 48, 67, 14, 22, 57, 78, 90 },
			{ 19, 28, 46, 68, 75, 5, 26, 39, 58, 78, 14, 37, 50, 69, 84, 3, 25, 57, 60, 86, 16, 31, 49, 77, 89, 8, 17,
					48, 59, 79, 15, 20, 44, 52, 70, 4, 33, 41, 61, 83, 9, 29, 30, 62, 88 },
			{ 18, 22, 55, 76, 87, 12, 38, 40, 66, 82, 1, 27, 42, 73, 85, 10, 34, 56, 63, 80, 6, 35, 43, 64, 71, 13, 21,
					54, 74, 90, 7, 24, 32, 53, 67, 2, 36, 47, 65, 72, 11, 23, 45, 51, 81 },
			{ 12, 34, 40, 75, 89, 8, 16, 42, 55, 77, 5, 24, 33, 67, 83, 14, 27, 51, 78, 84, 18, 38, 46, 63, 81, 9, 47,
					66, 79, 86, 4, 28, 31, 57, 72, 17, 36, 52, 64, 80, 19, 23, 45, 62, 74 },
			{ 3, 15, 32, 60, 71, 10, 20, 43, 54, 85, 2, 26, 35, 59, 76, 6, 39, 49, 68, 73, 13, 29, 48, 50, 88, 22, 30,
					53, 65, 82, 1, 25, 58, 69, 90, 7, 21, 41, 56, 87, 11, 37, 44, 61, 70 },
			{ 11, 35, 59, 68, 80, 17, 24, 42, 57, 76, 1, 27, 48, 79, 81, 7, 16, 31, 65, 77, 23, 44, 50, 71, 85, 14, 37,
					49, 63, 88, 3, 20, 46, 67, 73, 8, 12, 34, 45, 87, 19, 39, 55, 60, 89 },
			{ 9, 25, 38, 53, 86, 15, 36, 51, 64, 90, 2, 28, 47, 66, 78, 5, 10, 41, 56, 72, 4, 22, 33, 54, 74, 13, 26,
					40, 61, 82, 29, 30, 58, 62, 83, 21, 43, 52, 75, 84, 6, 18, 32, 69, 70 },
			{ 15, 24, 44, 64, 79, 4, 29, 30, 51, 76, 17, 32, 53, 63, 80, 7, 23, 56, 61, 85, 11, 34, 42, 72, 87, 3, 13,
					45, 54, 74, 16, 21, 43, 58, 78, 6, 37, 40, 65, 82, 2, 22, 39, 67, 83 },
			{ 14, 28, 50, 75, 90, 19, 31, 49, 68, 81, 5, 20, 47, 77, 84, 12, 38, 55, 69, 89, 1, 36, 41, 66, 71, 18, 26,
					57, 70, 88, 88, 25, 33, 52, 62, 9, 35, 46, 60, 73, 10, 27, 48, 59, 86 } };

//	getTable trả về mảng int 2 chiều để bắt đầu trò chơi
	static List<int[][]> getTable() {
		List<int[][]> list = new ArrayList<int[][]>();
		int[][] tb1 = new int[MATRIX_LENGTH][ROW_LENGTH];
		int[][] tb2 = new int[MATRIX_LENGTH][ROW_LENGTH];
		int number;
		int input;
		String inputNumberGetTable;
		String inputNumberOfTable = "Chơi 1 tờ hay 2 tờ(nhập 1 hoặc 2):";

		// Chọn chơi 1 tờ hoặc 2 tờ
		boolean isValidInput = false;
		while (!isValidInput) {
			System.out.print(inputNumberOfTable);
			number = scanner.nextInt();
			switch (number) {
			case 1:
				list.add(tb1);
				isValidInput = true;
				break;
			case 2:
				list.add(tb1);
				list.add(tb2);
				isValidInput = true;
				break;
			default:
				System.out.println("Input không hợp lệ, vui lòng nhập lại!");
				break;
			}
		}

		// TH1
		if (list.size() == 1) {
			int[] arr = null;
			inputNumberGetTable = "Nhập vào 2 số đầu tiên của bảng (ví dụ như 1935):";

//			Sử dụng một Map để lưu trữ giá trị của bảng
			Map<Integer, int[]> tableMap = new HashMap<>() {
				private static final long serialVersionUID = 1L;
				{
					put(1935, tables[0]);
					put(716, tables[1]);
					put(132, tables[2]);
					put(916, tables[3]);
					put(1932, tables[4]);
					put(529, tables[5]);
					put(618, tables[6]);
					put(1628, tables[7]);
					put(1928, tables[8]);
					put(1822, tables[9]);
					put(1234, tables[10]);
					put(314, tables[11]);
					put(1135, tables[12]);
					put(925, tables[13]);
					put(1524, tables[14]);
					put(1428, tables[15]);
				}
			};
			do {
				System.out.print(inputNumberGetTable);
				input = scanner.nextInt();
				arr = tableMap.get(input);
			} while (arr == null);

			for (int i = 0; i < MATRIX_LENGTH; i++) {
				for (int j = 0; j < ROW_LENGTH; j++) {
					tb1[i][j] = arr[i * 5 + j];
				}
			}

		} // TH2
		else {
			int[] arr1 = null;
			int[] arr2 = null;
			int count = 1;
			inputNumberGetTable = "Nhập vào 2 số đầu tiên của 2 bảng (ví dụ như 1935716 hoặc 7161935):";

			// Khởi tạo Map để lưu trữ các giá trị input và cặp arr1, arr2 tương ứng
			Map<Integer, int[][]> inputMap = new HashMap<>();
			int[][] pairs = { { 1935, 716 }, { 132, 916 }, { 1932, 529 }, { 618, 1628 }, { 1928, 1822 }, { 1234, 314 },
					{ 1135, 925 }, { 1524, 1428 } };
			int indexInTables = 0;
			int value1, value2;
			for (int[] pair : pairs) {
				value1 = Integer.parseInt(pair[0] + "" + pair[1]);
				value2 = Integer.parseInt(pair[1] + "" + pair[0]);
				int[][] arrPair1 = { tables[indexInTables], tables[indexInTables + 1] };
				int[][] arrPair2 = { tables[indexInTables + 1], tables[indexInTables] };
				inputMap.put(value1, arrPair1);
				inputMap.put(value2, arrPair2);
				indexInTables += 2;
			}

			do {
				System.out.print(inputNumberGetTable);
				input = scanner.nextInt();
				int[][] selectedTables = inputMap.get(input);
				if (selectedTables != null) {
					arr1 = selectedTables[0];
					arr2 = selectedTables[1];
				}
			} while (arr1 == null && arr2 == null);

			// Gán các số vào table để bắt đầu trò chơi
			int[] tempArr;
			int index = 0;
			for (int[][] x : list) {
				tempArr = count == 1 ? arr1 : arr2; // Sử dụng biến mảng tạm thời để lưu trữ giá trị của arr1 hoặc arr2
				for (int i = 0; i < MATRIX_LENGTH; i++) {
					for (int j = 0; j < ROW_LENGTH; j++) {
						x[i][j] = tempArr[index]; // Sử dụng biến mảng tạm thời để gán giá trị vào mảng x
						index++;
					}
				}
				count++;
				index = 0;
			}
		}
		return list;
	}

//	printTable in 1 (hoặc 2) table ra màn hình
	public static void printTable(List<int[][]> list) {
		int tableIndex = 1;
		for (int[][] x : list) {
			System.out.println("Table " + tableIndex + ":");
			for (int i = 0; i < MATRIX_LENGTH; i++) {
				for (int j = 0; j < ROW_LENGTH; j++) {
					System.out.print(x[i][j] + "\t");
				}
				System.out.println();
			}
			tableIndex++;
		}
	}

	// Start Game
	static void startGame(List<int[][]> list) {
		List<int[][]> winList = new ArrayList<>(list); // Sao chép danh sách bảng chơi vào danh sách winList

		do {
			System.out.print("Nhập số: ");
			int number = scanner.nextInt();

			if (number <= 0 || number > 89) {
				continue;
			}

			int[] checkNumberInTable = checkNumberInTable(list, number);

			if (checkNumberInTable == null) {
				continue;
			} else {
				int[] win = winCheck(list, checkNumberInTable);

				if (win[0] != 2) {
					System.out.println("KINH!");
					printWinNumbers(winList.get(win[0]), win[1]);
					break;
				}
			}
		} while (true);
	}

	// Kiểm tra giá trị number có tồn tại trong list hay không?
	// Trả về một mảng int gồm vị trí của mảng trong list, số dòng và số cột của giá
	// trị đó.
	private static int[] checkNumberInTable(List<int[][]> list, int number) {
		int[] result = null;
		for (int count = 0; count < list.size(); count++) {
			int[][] matrix = list.get(count);
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					if (number == matrix[i][j]) {
						result = new int[] { count, i, j };
						break;
					}
				}
				if (result != null) {
					break;
				}
			}
			if (result != null) {
				break;
			}
		}
		return result;
	}

//	// Phương thức kiểm tra đã kinh hay chưa, dựa vào tổng giá trị trên 1 row vừa
//	// được nhập số
	public static int[] winCheck(List<int[][]> list, int[] checkNumber) {
		// mảng int trả về chứa lần lượt là số thứ tự trong list và số dòng trong mảng
		int[] result = { 2, 0 };
		int total = 0;

		// position là vị trí trong list
		int position = checkNumber[0];
		int row = checkNumber[1];
		int column = checkNumber[2];

		// gán giá trị trong table = 0
		int[][] checkArr = list.get(position);
		checkArr[row][column] = 0;
		list.set(position, checkArr);

		// tính tổng trên 1 dòng vừa nhập
		for (int value : checkArr[row]) {
			total += value;
		}
		// nếu tổng bằng 0 thì win, gán lại các giá trị position và row vào trong mảng
		// int trả về
		if (total == 0) {
			result[0] = position;
			result[1] = row;
			// Sử dụng early return: Nếu tổng giá trị trên dòng bằng 0, ta có thể trả kết
			// quả luôn thay vì tiếp tục thực hiện các lệnh còn lại.
			return result;
		}
		return result;
	}

	// printWinNumbers in dãy số win ra màn hình
	private static void printWinNumbers(int[][] winArr, int row) {
//		Sử dụng StringBuilder giúp giảm số lần gọi hàm System.out.print()
		StringBuilder sb = new StringBuilder();
		sb.append("Dãy số vừa KINH là:").append("\t");
		for (int num : winArr[row]) {
			sb.append(num).append("\t");
		}
		System.out.print(sb.toString());
	}

}
