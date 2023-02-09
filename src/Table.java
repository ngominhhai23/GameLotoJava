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

//	getTable method get table depends on entered number
// value = Mệnh đề điều kiện ? giá trị true : giá trị false
	static int[][] getTable() {
		int index = 0;
		int number;
		int[][] tb = new int[9][5];
		boolean checkInput = false;
		int[] arr = null;
		while (checkInput == false) {
			System.out.println("Enter the first 2 digits of the table (same as '1935'):");
			number = scanner.nextInt();
			arr = switch (number) {
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
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				tb[i][j] = arr[index];
				index++;
			}
		}
		return tb;
	}

//	printTable method prints table to console
	public static void printTable(int[][] table) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
	}

// startGame method to start the game
	static void startGame(int[][] arr) {
		boolean endGame = false;
		int[] checkNumberInArr = null;
		int number;
		String enterNumber = "Enter a number:";
		// create a new array to get the winning numbers
		int[][] winArr = new int[9][5];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				winArr[i][j] = arr[i][j];
			}
		}
		while (endGame == false) {
			boolean check = false;
			while (check == false) {
				// Enter a number
				System.out.println(enterNumber);
				number = scanner.nextInt();
				// Check the input value, if it is not valid, return to enter the number
				checkNumberInArr = checkNumberInArr(arr, number);
				if ((number <= 0 || number > 89) || checkNumberInArr == null) {
					check = false;
				} else {
					break;
				}
			}
			// check array and assign value = 0
			int win = checkWin(arr, checkNumberInArr);
			if (win != 10) {
				endGame = true;
				System.out.println("WIN");
				printNumberSequence(winArr, win);
			}

		}
	}

	// checkNumberInArr method to check if the entered number is in the table or not
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

	// checkWin method to check whether or not, based on the total value on a row
	public static int checkWin(int[][] arr, int[] checkNumberInArr) {
		int result = 10;
		int total = 0;
		int row = checkNumberInArr[0];
		int column = checkNumberInArr[1];
		// assign value = 0
		arr[row][column] = 0;
		// print table to review
		printTable(arr);
		for (int j = 0; j < 5; j++) {
			total += arr[row][j];
		}
		// check whether or not, consider the sum of 5 elements of 1 line, if equal to 0
		// then win, print to the screen, if not equal to 0, continue
		if (total == 0) {
			result = row;
		}
		return result;
	}

// printNumberSequence method displays the series of winning numbers, checks the sequence of numbers at the moment and saves it in an array of int . numbers
	private static void printNumberSequence(int[][] winArr, int row) {
		int count = 0;
		System.out.print("The winning numbers are:" + "\t");
		for (int i = 0; i < 5; i++) {
			if (count == 5) {
				System.out.print(winArr[row][i]);
			} else {
				count++;
				System.out.print(winArr[row][i] + "\t");
			}
		}
	}

//	static List<int[][]> returnList() {
//
//		return null;
//
//	}

// Phương thức getTwoTable lấy 2 bảng
// Trả về 1 List chứa 2 mảng int[][]
//	static List<int[][]> getTwoTable() {
//		int[][] tb1 = null;
//		int[][] tb2 = null;
//		List<int[][]> list = new ArrayList<int[][]>();
//		String enterNumber = "Nhập 4 số đầu của bảng(có dạng 1935716 hoặc 7161925):";
//		System.out.println(enterNumber);
//		int number = scanner.nextInt();
//		switch (number) {
//		case 1935716:
//			tb1 = createTable1();
//			tb2 = createTable2();
//			break;
//		case 7161935:
//			tb1 = createTable2();
//			tb2 = createTable1();
//			break;
//		case 132916:
//			tb1 = createTable3();
//			tb2 = createTable4();
//			break;
//		case 916132:
//			tb1 = createTable4();
//			tb2 = createTable3();
//			break;
//		case 1932529:
//			tb1 = createTable5();
//			tb2 = createTable6();
//			break;
//		case 5291932:
//			tb1 = createTable6();
//			tb2 = createTable5();
//			break;
//		case 6181628:
//			tb1 = createTable7();
//			tb2 = createTable8();
//			break;
//		case 1628618:
//			tb1 = createTable8();
//			tb2 = createTable7();
//			break;
//		case 19281822:
//			tb1 = createTable9();
//			tb2 = createTable10();
//			break;
//		case 18221928:
//			tb1 = createTable10();
//			tb2 = createTable9();
//			break;
//		case 1234315:
//			tb1 = createTable11();
//			tb2 = createTable12();
//			break;
//		case 3151234:
//			tb1 = createTable12();
//			tb2 = createTable11();
//			break;
//		case 1135925:
//			tb1 = createTable13();
//			tb2 = createTable14();
//			break;
//		case 9251135:
//			tb1 = createTable14();
//			tb2 = createTable13();
//			break;
//		case 15241428:
//			tb1 = createTable15();
//			tb2 = createTable16();
//			break;
//		case 14281524:
//			tb1 = createTable16();
//			tb2 = createTable15();
//			break;
//		default:
//			getTwoTable();
//		}
//		// sau khi tạo bảng thành công thì mới thêm vào list
//		list.add(tb1);
//		list.add(tb2);
//		return list;
//	}

	// Phương thức in 2 Table ra màn hình
	static void printTwoTable(List<int[][]> tb) {
		int count = 1;
		for (int[][] x : tb) {
			System.out.println("Table " + count + ":");
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(x[i][j] + "\t");
				}
				System.out.println();
			}
			count++;
			System.out.println();
		}
	}

	// Game start method
	static void start(List<int[][]> list) {
		int[][] win1 = new int[9][5];
		int[][] win2 = new int[9][5];
		List<int[][]> winList = new ArrayList<int[][]>();
		winList.add(win1);
		winList.add(win2);
		// assign value to new array, new list
		int[][] ar1 = list.get(0);
		int[][] ar2 = list.get(1);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				win1[i][j] = ar1[i][j];
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				win2[i][j] = ar2[i][j];
			}
		}

		boolean endGame = false;
		int[] checkNumber = null;
		int[] win;
		while (endGame == false) {
			int number = 0;
			boolean check = false;
			while (check == false) {
				// Enter a number
				System.out.println("Nhập số:");
				number = scanner.nextInt();
				// Check the input value, if it is not valid, return to enter the number
				checkNumber = checkNumber(list, number);
				if ((number <= 0 || number > 89) || checkNumber == null) {
					check = false;
				} else {
					break;
				}
			}
			// check numbers and assign value equal to 0
			win = winCheck(list, checkNumber);
			if (win[0] != 2) {
				endGame = true;
				System.out.println("KINH! LỤM TIỀN.");
				int[][] result = winList.get(win[0]);
				printWinNumbers(result, win[1]);
			}

		}
	}

// Phương thức checkNumber kiểm tra xem có tồn tại giá trị number trong list đang xét hay không
// Return một mảng int độ dài 3, chứa lần lượt vị trí của mảng trong list,số dòng và số cột trong mảng đó.
	private static int[] checkNumber(List<int[][]> list, int number) {
		int[] result = new int[3];
		int count = 0;
		for (int[][] x : list) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 5; j++) {
					if (number == x[i][j]) {
						result[0] = count;
						result[1] = i;
						result[2] = j;
						break;
					}
				}
			}
			count++;
		}
		return result;
	}

	// Phương thức kiểm tra đã kinh hay chưa, dựa vào tổng giá trị trên 1 row vừa
	// được nhập số
	public static int[] winCheck(List<int[][]> list, int[] checkNumber) {
		// mảng int trả về chứa lần lượt là số thứ tự trong list và số dòng trong mảng
		int[] result = { 2, 0 };
		int total = 0;
		// position là vị trí trong list
		int position = checkNumber[0];
		int row = checkNumber[1];
		int column = checkNumber[2];
		// Set value 0
		int[][] checkArr = list.get(position);
		checkArr[row][column] = 0;
		list.set(position, checkArr);

		// Print table for review
		printTwoTable(list);
		// Calculate the sum of a row
		for (int i = 0; i < 5; i++) {
			total += checkArr[row][i];
		}
		// check win or not, calculate the sum of 5 elements of a row,
		// equal 0 to win, print out to console, is not equal 0 then continue
		if (total == 0) {
			result[0] = position;
			result[1] = row;
		}
		return result;
	}

	// Method to display a series of numbers in the period,
	// check the sequence of numbers during the period and save it in an Integer
	// array
	private static void printWinNumbers(int[][] winArr, int row) {
		int count = 0;
		System.out.print("Dãy số vừa KINH lần lượt là:" + "\t");
		for (int i = 0; i < 5; i++) {
			if (count == 5) {
				System.out.print(winArr[row][i]);
			} else {
				count++;
				System.out.print(winArr[row][i] + "\t");
			}
		}
	}
}
