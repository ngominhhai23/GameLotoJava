import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Table {
	static int[] arrNumber = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
			25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51,
			52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78,
			79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89 };

	/* table 1 */
	private static int[][] createTable1() {
		int[][] table = new int[9][5];
		int[] arr = { 19, 35, 49, 71, 85, 8, 14, 47, 54, 74, 6, 25, 36, 62, 84, 15, 22, 58, 7, 89, 12, 31, 43, 68, 9, 1,
				42, 65, 72, 87, 5, 21, 38, 52, 76, 13, 33, 57, 67, 82, 11, 26, 44, 69, 79 };
		int index = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = arr[index];
				index++;
			}
		}
		return table;
	}

	/* table 2 */
	private static int[][] createTable2() {
		int[][] table = new int[9][5];
		int[] arr = { 7, 16, 32, 66, 73, 18, 29, 46, 55, 88, 2, 23, 34, 5, 75, 4, 3, 4, 61, 78, 1, 27, 41, 56, 86, 2,
				39, 59, 6, 83, 9, 24, 51, 64, 81, 3, 28, 48, 53, 8, 17, 37, 45, 63, 77 };
		int index = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = arr[index];
				index++;
			}
		}
		return table;
	}

	/* table 3 */
	private static int[][] createTable3() {
		int[][] table = new int[9][5];
		int[] arr = { 13, 2, 41, 61, 86, 3, 24, 34, 52, 71, 1, 35, 56, 64, 83, 7, 23, 36, 53, 75, 5, 48, 59, 72, 84, 14,
				28, 42, 60, 87, 26, 47, 50, 79, 89, 4, 10, 30, 49, 66, 15, 25, 51, 76, 81 };
		int index = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = arr[index];
				index++;
			}
		}
		return table;
	}

	/* table 4 */
	private static int[][] createTable4() {
		int[][] table = new int[9][5];
		int[] arr = { 9, 16, 46, 65, 80, 11, 32, 45, 68, 78, 8, 21, 33, 57, 73, 6, 20, 43, 63, 77, 12, 31, 54, 62, 85,
				19, 39, 40, 70, 82, 18, 29, 58, 74, 90, 17, 38, 44, 69, 88, 2, 27, 37, 55, 67 };
		int index = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = arr[index];
				index++;
			}
		}
		return table;
	}

	/* table 5 */
	private static int[][] createTable5() {
		int[][] table = new int[9][5];
		int[] arr = { 19, 32, 58, 64, 84, 13, 20, 48, 55, 77, 2, 21, 46, 75, 82, 6, 18, 39, 62, 70, 25, 41, 59, 74, 83,
				17, 38, 44, 60, 86, 8, 22, 47, 66, 72, 9, 12, 37, 42, 88, 15, 36, 51, 68, 90 };
		int index = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = arr[index];
				index++;
			}
		}
		return table;
	}

	/* table 6 */
	private static int[][] createTable6() {
		int[][] table = new int[9][5];
		int[] arr = { 5, 29, 30, 56, 80, 10, 35, 54, 63, 81, 4, 26, 45, 61, 79, 3, 14, 43, 50, 71, 7, 23, 31, 52, 73,
				11, 28, 49, 69, 89, 24, 34, 53, 67, 85, 27, 40, 57, 76, 87, 1, 16, 33, 65, 78 };
		int index = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = arr[index];
				index++;
			}
		}
		return table;
	}

	/* table 7 */
	private static int[][] createTable7() {
		int[][] table = new int[9][5];
		int[] arr = { 6, 18, 47, 69, 86, 13, 31, 44, 61, 70, 7, 24, 34, 56, 71, 5, 23, 41, 65, 74, 10, 37, 53, 60, 89,
				17, 38, 42, 75, 84, 15, 25, 51, 77, 85, 12, 36, 43, 64, 82, 3, 26, 39, 58, 66 };
		int index = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = arr[index];
				index++;
			}
		}
		return table;
	}

	/* table 8 */
	private static int[][] createTable8() {
		int[][] table = new int[9][5];
		int[] arr = { 16, 28, 45, 68, 87, 4, 29, 35, 55, 73, 9, 30, 54, 62, 88, 1, 21, 33, 52, 76, 8, 40, 50, 79, 81,
				11, 20, 46, 63, 83, 27, 49, 59, 72, 80, 2, 19, 32, 48, 67, 14, 22, 57, 78, 90 };
		int index = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = arr[index];
				index++;
			}
		}
		return table;
	}

	/* table 9 */
	private static int[][] createTable9() {
		int[][] table = new int[9][5];
		int[] arr = { 19, 28, 46, 68, 75, 5, 26, 39, 58, 78, 14, 37, 50, 69, 84, 3, 25, 57, 60, 86, 16, 31, 49, 77, 89,
				8, 17, 48, 59, 79, 15, 20, 44, 52, 70, 4, 33, 41, 61, 83, 9, 29, 30, 62, 88 };
		int index = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = arr[index];
				index++;
			}
		}
		return table;
	}

	/* table 10 */
	private static int[][] createTable10() {
		int[][] table = new int[9][5];
		int[] arr = { 18, 22, 55, 76, 87, 12, 38, 40, 66, 82, 1, 27, 42, 73, 85, 10, 34, 56, 63, 80, 6, 35, 43, 64, 71,
				13, 21, 54, 74, 90, 7, 24, 32, 53, 67, 2, 36, 47, 65, 72, 11, 23, 45, 51, 81 };
		int index = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = arr[index];
				index++;
			}
		}
		return table;
	}

	/* table 11 */
	private static int[][] createTable11() {
		int[][] table = new int[9][5];
		int[] arr = { 12, 34, 40, 75, 89, 8, 16, 42, 55, 77, 5, 24, 33, 67, 83, 14, 27, 51, 78, 84, 18, 38, 46, 63, 81,
				9, 47, 66, 79, 86, 4, 28, 31, 57, 72, 17, 36, 52, 64, 80, 19, 23, 45, 62, 74 };
		int index = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = arr[index];
				index++;
			}
		}
		return table;
	}

	/* table 12 */
	private static int[][] createTable12() {
		int[][] table = new int[9][5];
		int[] arr = { 3, 15, 32, 60, 71, 10, 20, 43, 54, 85, 2, 26, 35, 59, 76, 6, 39, 49, 68, 73, 13, 29, 48, 50, 88,
				22, 30, 53, 65, 82, 1, 25, 58, 69, 90, 7, 21, 41, 56, 87, 11, 37, 44, 61, 70 };
		int index = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = arr[index];
				index++;
			}
		}
		return table;
	}

	/* table 13 */
	private static int[][] createTable13() {
		int[][] table = new int[9][5];
		int[] arr = { 11, 35, 59, 68, 80, 17, 24, 42, 57, 76, 1, 27, 48, 79, 81, 7, 16, 31, 65, 77, 23, 44, 50, 71, 85,
				14, 37, 49, 63, 88, 3, 20, 46, 67, 73, 8, 12, 34, 45, 87, 19, 39, 55, 60, 89 };
		int index = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = arr[index];
				index++;
			}
		}
		return table;
	}

	/* table 14 */
	private static int[][] createTable14() {
		int[][] table = new int[9][5];
		int[] arr = { 9, 25, 38, 53, 86, 15, 36, 51, 64, 90, 2, 28, 47, 66, 78, 5, 10, 41, 56, 72, 4, 22, 33, 54, 74,
				13, 26, 40, 61, 82, 29, 30, 58, 62, 83, 21, 43, 52, 75, 84, 6, 18, 32, 69, 70 };
		int index = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = arr[index];
				index++;
			}
		}
		return table;
	}

	/* table 15 */
	private static int[][] createTable15() {
		int[][] table = new int[9][5];
		int[] arr = { 15, 24, 44, 64, 79, 4, 29, 30, 51, 76, 17, 32, 53, 63, 80, 7, 23, 56, 61, 85, 11, 34, 42, 72, 87,
				3, 13, 45, 54, 74, 16, 21, 43, 58, 78, 6, 37, 40, 65, 82, 2, 22, 39, 67, 83 };
		int index = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = arr[index];
				index++;
			}
		}
		return table;
	}

	/* table 16 */
	private static int[][] createTable16() {
		int[][] table = new int[9][5];
		int[] arr = { 14, 28, 50, 75, 90, 19, 31, 49, 68, 81, 5, 20, 47, 77, 84, 12, 38, 55, 69, 89, 1, 36, 41, 66, 71,
				18, 26, 57, 70, 88, 88, 25, 33, 52, 62, 9, 35, 46, 60, 73, 10, 27, 48, 59, 86 };
		int index = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = arr[index];
				index++;
			}
		}
		return table;
	}

	private static void printTable(int[][] table) {
		int len = table.length;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
	}

//	Viết phương thức chỉ định dùng bảng nào theo mảng 2 số đầu cho trước.
	private static int[][] getTable() {
		int[][] tb = null;
		boolean check = false;
		while (check == false) {
			System.out.println("Nhập 2 số đầu của bảng(có dạng 1935):");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			switch (number) {
			case 1935:
				tb = createTable1();
				check = true;
				break;
			case 716:
				tb = createTable2();
				check = true;
				break;
			case 132:
				tb = createTable3();
				check = true;
				break;
			case 916:
				tb = createTable4();
				check = true;
				break;
			case 1932:
				tb = createTable5();
				check = true;
				break;
			case 529:
				tb = createTable6();
				check = true;
				break;
			case 618:
				tb = createTable7();
				check = true;
				break;
			case 1628:
				tb = createTable8();
				check = true;
				break;
			case 1928:
				tb = createTable9();
				check = true;
				break;
			case 1822:
				tb = createTable10();
				check = true;
				break;
			case 1234:
				tb = createTable11();
				check = true;
				break;
			case 315:
				tb = createTable12();
				check = true;
				break;
			case 1135:
				tb = createTable13();
				check = true;
				break;
			case 925:
				tb = createTable14();
				check = true;
				break;
			case 1524:
				tb = createTable15();
				check = true;
				break;
			case 1428:
				tb = createTable16();
				check = true;
				break;
			default:
				System.out.println("Vui lòng nhập lại chính xác!");
				break;
			}
		}
		return tb;
	}

// Phương thức bắt đầu trò chơi tartGame(int[][] arr)
	private static void startGame(int[][] arr) {
		boolean endGame = false;
		int[] checkNumberInArr = null;
		while (endGame == false) {
			// biến total là tổng của 1 dòng 5 số
			int tong = 0;
			int number = 0;
			boolean check = false;
			while (check == false) {
				// nhập số
				System.out.println("Nhập số:");
				Scanner input = new Scanner(System.in);
				number = input.nextInt();
				// kiểm tra giá trị nhập vào, không hợp lệ thì quay lại nhập số
				checkNumberInArr = checkNumberInArr(arr, number);
				if ((number <= 0 || number > 89) || checkNumberInArr == null) {
					check = false;
				} else {
					break;
				}
			}
			// check arr và gán giá trị = 0
			boolean kinh = kiemTraKinh(arr, number, checkNumberInArr);
			if (kinh == true) {
				endGame = true;
				System.out.println("Kinh! Lụm tiền.");
			}

		}
	}

	private static int[] checkNumberInArr(int[][] arr, int number) {
		int[] result = new int[2];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (number == arr[i][j]) {
					result[0] = i;
					result[1] = j;
					break;
				}
			}
		}
		return result;
	}

	// Phương thức kiểm tra đã kinh hay chưa, dựa vào tổng giá trị trên 1 row vừa
	// được nhập số
	public static boolean kiemTraKinh(int[][] arr, int number, int[] checkNumberInArr) {
		boolean result = false;
		int tong = 0;
		int row = checkNumberInArr[0];
		int column = checkNumberInArr[1];
//		gán giá trị bằng 0
		arr[row][column] = 0;
		// in bảng ra xem lại
		printTable(arr);
		for (int j = 0; j < 5; j++) {
			tong += arr[row][j];
		}
		// kiểm tra đã kinh hay chưa, xét tổng 5 phần tử của 1 dòng, nếu bằng 0 thì
		// kinh, in ra màn hình, chưa bằng 0 thì tiếp tục
		if (tong == 0) {
			result = true;
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] tb = getTable();
		printTable(tb);
		startGame(tb);

	}
}
