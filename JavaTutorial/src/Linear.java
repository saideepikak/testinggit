import java.util.Scanner;

public class Linear {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int i;
		int z = 0;
		System.out.println("enter no.of elements in the array");
		int n = scan.nextInt();
		for (i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("enter the no to be searched");
		int x = scan.nextInt();
		for (i = 0; i < n; i++) {
			if (x == arr[i]) {
				System.out.println("found");
				break;
			} else
				System.out.println("not found");
		}
	}
}
