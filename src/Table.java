import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Table {
	
	static Scanner scanner = new Scanner(System.in);
	static int[] arr1935 = { 19, 35, 49, 71, 85, 8, 14, 47, 54, 74, 6, 25, 36, 62, 84, 15, 22, 58, 7, 89, 12, 31, 43,
			68, 9, 1, 42, 65, 72, 87, 5, 21, 38, 52, 76, 13, 33, 57, 67, 82, 11, 26, 44, 69, 79 };
	static int[] arr716 = { 7, 16, 32, 66, 73, 18, 29, 46, 55, 88, 2, 23, 34, 5, 75, 4, 3, 4, 61, 78, 1, 27, 41, 56, 86,
			2, 39, 59, 6, 83, 9, 24, 51, 64, 81, 3, 28, 48, 53, 8, 17, 37, 45, 63, 77 };
	static int[] arr132 = { 13, 2, 41, 61, 86, 3, 24, 34, 52, 71, 1, 35, 56, 64, 83, 7, 23, 36, 53, 75, 5, 48, 59, 72,
			84, 14, 28, 42, 60, 87, 26, 47, 50, 79, 89, 4, 10, 30, 49, 66, 15, 25, 51, 76, 81 };
	static int[] arr916 = { 9, 16, 46, 65, 80, 11, 32, 45, 68, 78, 8, 21, 33, 57, 73, 6, 20, 43, 63, 77, 12, 31, 54, 62,
			85, 19, 39, 40, 70, 82, 18, 29, 58, 74, 90, 17, 38, 44, 69, 88, 2, 27, 37, 55, 67 };
	static int[] arr1932 = { 19, 32, 58, 64, 84, 13, 20, 48, 55, 77, 2, 21, 46, 75, 82, 6, 18, 39, 62, 70, 25, 41, 59,
			74, 83, 17, 38, 44, 60, 86, 8, 22, 47, 66, 72, 9, 12, 37, 42, 88, 15, 36, 51, 68, 90 };
	static int[] arr529 = { 5, 29, 30, 56, 80, 10, 35, 54, 63, 81, 4, 26, 45, 61, 79, 3, 14, 43, 50, 71, 7, 23, 31, 52,
			73, 11, 28, 49, 69, 89, 24, 34, 53, 67, 85, 27, 40, 57, 76, 87, 1, 16, 33, 65, 78 };
	static int[] arr618 = { 6, 18, 47, 69, 86, 13, 31, 44, 61, 70, 7, 24, 34, 56, 71, 5, 23, 41, 65, 74, 10, 37, 53, 60,
			89, 17, 38, 42, 75, 84, 15, 25, 51, 77, 85, 12, 36, 43, 64, 82, 3, 26, 39, 58, 66 };
	static int[] arr1628 = { 16, 28, 45, 68, 87, 4, 29, 35, 55, 73, 9, 30, 54, 62, 88, 1, 21, 33, 52, 76, 8, 40, 50, 79,
			81, 11, 20, 46, 63, 83, 27, 49, 59, 72, 80, 2, 19, 32, 48, 67, 14, 22, 57, 78, 90 };
	static int[] arr1928 = { 19, 28, 46, 68, 75, 5, 26, 39, 58, 78, 14, 37, 50, 69, 84, 3, 25, 57, 60, 86, 16, 31, 49,
			77, 89, 8, 17, 48, 59, 79, 15, 20, 44, 52, 70, 4, 33, 41, 61, 83, 9, 29, 30, 62, 88 };
	static int[] arr1822 = { 18, 22, 55, 76, 87, 12, 38, 40, 66, 82, 1, 27, 42, 73, 85, 10, 34, 56, 63, 80, 6, 35, 43,
			64, 71, 13, 21, 54, 74, 90, 7, 24, 32, 53, 67, 2, 36, 47, 65, 72, 11, 23, 45, 51, 81 };
	static int[] arr1234 = { 12, 34, 40, 75, 89, 8, 16, 42, 55, 77, 5, 24, 33, 67, 83, 14, 27, 51, 78, 84, 18, 38, 46,
			63, 81, 9, 47, 66, 79, 86, 4, 28, 31, 57, 72, 17, 36, 52, 64, 80, 19, 23, 45, 62, 74 };
	static int[] arr315 = { 3, 15, 32, 60, 71, 10, 20, 43, 54, 85, 2, 26, 35, 59, 76, 6, 39, 49, 68, 73, 13, 29, 48, 50,
			88, 22, 30, 53, 65, 82, 1, 25, 58, 69, 90, 7, 21, 41, 56, 87, 11, 37, 44, 61, 70 };
	static int[] arr1135 = { 11, 35, 59, 68, 80, 17, 24, 42, 57, 76, 1, 27, 48, 79, 81, 7, 16, 31, 65, 77, 23, 44, 50,
			71, 85, 14, 37, 49, 63, 88, 3, 20, 46, 67, 73, 8, 12, 34, 45, 87, 19, 39, 55, 60, 89 };
	static int[] arr925 = { 9, 25, 38, 53, 86, 15, 36, 51, 64, 90, 2, 28, 47, 66, 78, 5, 10, 41, 56, 72, 4, 22, 33, 54,
			74, 13, 26, 40, 61, 82, 29, 30, 58, 62, 83, 21, 43, 52, 75, 84, 6, 18, 32, 69, 70 };
	static int[] arr1524 = { 15, 24, 44, 64, 79, 4, 29, 30, 51, 76, 17, 32, 53, 63, 80, 7, 23, 56, 61, 85, 11, 34, 42,
			72, 87, 3, 13, 45, 54, 74, 16, 21, 43, 58, 78, 6, 37, 40, 65, 82, 2, 22, 39, 67, 83 };
	static int[] arr1428 = { 14, 28, 50, 75, 90, 19, 31, 49, 68, 81, 5, 20, 47, 77, 84, 12, 38, 55, 69, 89, 1, 36, 41,
			66, 71, 18, 26, 57, 70, 88, 88, 25, 33, 52, 62, 9, 35, 46, 60, 73, 10, 27, 48, 59, 86 };

//	getTable trả về mảng int 2 chiều để bắt đầu trò chơi
	static List<int[][]> getTable() {
		List<int[][]> list = new ArrayList<int[][]>();
		int[][] tb1 = new int[9][5];
		int[][] tb2 = new int[9][5];
		int number;
		int index = 0;
		int input;
		boolean checkInput = false;
		String inputNumberGetTable;
		String inputNumberOfTable = "Chơi 1 tờ hay 2 tờ(nhập 1 hoặc 2):";

		do {
			System.out.print(inputNumberOfTable);
			number = scanner.nextInt();
			// TH1: 1 tờ
			// list add 1 mảng int[]
			if (number == 1) {
				list.add(tb1);
				break;
			}
			// TH2: 2 tờ
			// list add 2 mảng int[]
			else if (number == 2) {
				list.add(tb1);
				list.add(tb2);
				break;
			}
		} while (true);

		// TH1
		if (list.size() == 1) {
			int[] arr = null;
			inputNumberGetTable = "Nhập vào 2 số đầu tiên của bảng (ví dụ như 1935):";
			do {
				System.out.print(inputNumberGetTable);
				input = scanner.nextInt();
				arr = switch (input) {
				case 1935 -> arr1935;
				case 716 -> arr716;
				case 132 -> arr132;
				case 916 -> arr916;
				case 1932 -> arr1932;
				case 529 -> arr529;
				case 618 -> arr618;
				case 1628 -> arr1628;
				case 1928 -> arr1928;
				case 1822 -> arr1822;
				case 1234 -> arr1234;
				case 314 -> arr315;
				case 1135 -> arr1135;
				case 925 -> arr925;
				case 1524 -> arr1524;
				case 1428 -> arr1428;
				default -> arr;
				};
				checkInput = arr == null ? false : true;
			} while (checkInput == false);
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 5; j++) {
					tb1[i][j] = arr[index];
					index++;
				}
			}
		} // TH2
		else {
			int[] arr1 = null;
			int[] arr2 = null;
			int count = 1;
			inputNumberGetTable = "Nhập vào 2 số đầu tiên của 2 bảng (ví dụ như 1935716 hoặc 7161935):";
			do {
				System.out.print(inputNumberGetTable);
				input = scanner.nextInt();
				switch (input) {
				case 1935716:
					arr1 = arr1935;
					arr2 = arr716;
					break;
				case 7161935:
					arr1 = arr716;
					arr2 = arr1935;
					break;
				case 132916:
					arr1 = arr132;
					arr2 = arr916;
					break;
				case 916132:
					arr1 = arr916;
					arr2 = arr132;
					break;
				case 1932529:
					arr1 = arr1932;
					arr2 = arr529;
					break;
				case 5291932:
					arr1 = arr529;
					arr2 = arr1932;
					break;
				case 6181628:
					arr1 = arr618;
					arr2 = arr1628;
					break;
				case 1628618:
					arr1 = arr1628;
					arr2 = arr618;
					break;
				case 19281822:
					arr1 = arr1928;
					arr2 = arr1822;
					break;
				case 18221928:
					arr1 = arr1822;
					arr2 = arr1928;
					break;
				case 1234315:
					arr1 = arr1234;
					arr2 = arr315;
					break;
				case 3151234:
					arr1 = arr315;
					arr2 = arr1234;
					break;
				case 1135925:
					arr1 = arr1135;
					arr2 = arr925;
					break;
				case 9251135:
					arr1 = arr925;
					arr2 = arr1135;
					break;
				case 15241428:
					arr1 = arr1524;
					arr2 = arr1428;
					break;
				case 14281524:
					arr1 = arr1428;
					arr2 = arr1524;
					break;
				default:
					continue;
				}
			} while (arr1 == null && arr2 == null);
			for (int[][] x : list) {
				for (int i = 0; i < 9; i++) {
					for (int j = 0; j < 5; j++) {
						x[i][j] = count == 1 ? arr1[index] : arr2[index];
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
		int count = 1;
		for (int[][] x : list) {
			System.out.println("Table " + count + ":");
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(x[i][j] + "\t");
				}
				System.out.println();
			}
			count++;
		}
	}

// startGame bắt đầu trò chơi
	static void startGame(List<int[][]> list) {
		int[] checkNumberInTable = null;
		int number;
		String enterNumber = "Nhập số:";

		// tạo một danh sách mới winList để lấy dãy số đã win in ra màn hình
		List<int[][]> winList = new ArrayList<int[][]>();

		// TH1: list chỉ chứa 1 mảng int[][]
		if (list.size() == 1) {
			int[][] tb1 = list.get(0);
			int[][] winTb1 = new int[9][5];
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 5; j++) {
					winTb1[i][j] = tb1[i][j];
				}
			}
			winList.add(winTb1);
		} // TH2: list chứa 2 mảng int[][]
		else {
			int count = 0;
			int[][] tb1 = list.get(0);
			int[][] tb2 = list.get(1);
			int[][] winTb1 = new int[9][5];
			int[][] winTb2 = new int[9][5];
			do {
				for (int i = 0; i < 9; i++) {
					for (int j = 0; j < 5; j++) {
						if (count == 0) {
							winTb1[i][j] = tb1[i][j];
						} else {
							winTb2[i][j] = tb2[i][j];
						}
					}
				}
				count++;
			} while (count < 2);
			winList.add(winTb1);
			winList.add(winTb2);
		}
		do {
			do {
				// Nhập số
				System.out.print(enterNumber);
				number = scanner.nextInt();
				if (number <= 0 || number > 89)
					continue;
				// Kiểm tra số vừa nhập vào, không hợp lệ thì quay lại bước nhập số
				checkNumberInTable = checkNumberInTable(list, number);
				if (checkNumberInTable == null)
					continue;
				else {
					break;
				}
			} while (true);
//			// kiểm tra win và gán giá trị cho biến win
			int[] win = winCheck(list, checkNumberInTable);
			// kiểm tra điều kiện win, in kết quả ra màn hình nếu win
			if (win[0] != 2) {
				System.out.println("KINH!");
				printWinNumbers(winList.get(win[0]), win[1]);
				break;
			}
		} while (true);
	}

	// Phương thức checkNumber kiểm tra xem có tồn tại giá trị number trong list
	// đang xét hay không
	// Return một mảng int độ dài 3, chứa lần lượt vị trí của mảng trong list,số
	// dòng và số cột trong mảng đó.
	private static int[] checkNumberInTable(List<int[][]> list, int number) {
		int[] result = new int[3];
		int count = 0;
		for (int[][] x : list) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 5; j++) {
					if (number == x[i][j]) {
						result[0] = count;
						result[1] = i;
						result[2] = j;
						return result;
					}
				}
			}
			count++;
		}
		result = null;
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

		// in table để xem lại
		printTable(list);

		// tính tổng trên 1 dòng vừa nhập
		for (int i = 0; i < 5; i++) {
			total += checkArr[row][i];
		}
		// nếu tổng bằng 0 thì win, gán lại các giá trị position và row vào trong mảng
		// int trả về
		if (total == 0) {
			result[0] = position;
			result[1] = row;
		}
		return result;
	}

	// printWinNumbers in dãy số win ra màn hình
	private static void printWinNumbers(int[][] winArr, int row) {
		System.out.print("Dãy số vừa KINH là:" + "\t");
		for (int i = 0; i < 5; i++) {
			System.out.print(winArr[row][i] + "\t");
		}
	}
}
