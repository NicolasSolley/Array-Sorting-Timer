import java.util.*;
import java.util.Scanner;
import java.util.Random;

class Project {
	public static void bubbleSort(Integer[] arr) {

		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	public static void selectionSort(Integer[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	public static void bubble(Integer[] arr) {

		System.out.println();
		System.out.println("Bubble Sort:");
		Date past = new Date();
		bubbleSort(arr);
		Date future = new Date();
		System.out.println("Time (milliseconds) = " + (future.getTime() - past.getTime()));
		
	}

	public static void selection(Integer[] arr) {
		System.out.println();
		Date p = new Date();
		System.out.println("Selection Sort");
		selectionSort(arr);
		Date f = new Date();

		System.out.println("Time (milliseconds) = " + (f.getTime() - p.getTime()));
	}

	public static void main(String args[]) {
		Integer[] arr = null;
		System.out.println("Iterations: 1,000");
		System.out.println("Do you want to run bubble or selective sort: ");
		Scanner choice = new Scanner(System.in);
		String choicee = null;

		choicee = choice.nextLine();
		System.out.println("Set array size: ");
		Scanner sizeScan = new Scanner(System.in);
		int arraySize = sizeScan.nextInt();
		switch (choicee) {
		case "Bubble":
			System.out.println("Length set to 1,000");
			System.out.println("Set array size: ");
			Scanner arraySizeScanner = new Scanner(System.in);

			for (int i = 0; i < 1000; i++) {

				Random rd = new Random();
				arr = new Integer[arraySize];
				for (int k = 0; k < arr.length; k++) {
					arr[k] = rd.nextInt(50000);

				}

				bubble(arr);

			}
			break;
		case "bubble":
			System.out.println("Array length set to 1,000");
			for (int i = 0; i < 1000; i++) {

				Random rd = new Random();
				arr = new Integer[arraySize];
				for (int k = 0; k < arr.length; k++) {
					arr[k] = rd.nextInt(50000);

				}
				bubble(arr);

			}
			break;
		case "selective":
			System.out.println("Array length set to 1,000");
			for (int i = 0; i < 1000; i++) {

				Random rd = new Random();
				arr = new Integer[arraySize];
				for (int k = 0; k < arr.length; k++) {
					arr[k] = rd.nextInt(50000);

				}
				selection(arr);

			}
			break;
		case "Selective":
			System.out.println("Array length set to 1,000");
			for (int i = 0; i < 1000; i++) {

				Random rd = new Random();
				arr = new Integer[arraySize];
				for (int k = 0; k < arr.length; k++) {
					arr[k] = rd.nextInt(50000);

				}
				selection(arr);

			}
			break;
		}

	}

}
