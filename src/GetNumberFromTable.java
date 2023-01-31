//// Lấy những số còn lại sau khi đã lấy 1 bảng.
//public class GetNumberFromTable {
//	static int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
//			27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53,
//			54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
//			81, 82, 83, 84, 85, 86, 87, 88, 89, 90 };
//
//	public static void returnRemainNumber(int[] array) {
//		int[] result = new int[45];
//		for (int i = 0; i < 90; i++) {
//			for (int j = 0; j < 45; j++) {
//				if (arr[i] == array[j]) {
//					arr[i] = 0;
//				}
//			}
//		}
//		for (int i = 0; i < 90; i++) {
//			if (arr[i] != 0) {
//				System.out.print(arr[i] + ",");
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		int[] test = { 19, 35, 49, 71, 85, 8, 14, 47, 54, 74, 6, 25, 36, 62, 84, 15, 22, 58, 7, 89, 12, 31, 43, 68, 9, 1,
//				42, 65, 72, 87, 5, 21, 38, 52, 76, 13, 33, 57, 67, 82, 11, 26, 44, 69, 79 };
//		returnRemainNumber(test);
//	}
//
//}
