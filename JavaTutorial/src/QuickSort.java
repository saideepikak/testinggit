
public class QuickSort {
	public static void main(String args[]) {
		int arr[] = { 27, 10, 36, 18, 25, 45 };
		QuickSort qui = new QuickSort();
		int n = arr.length;
		qui.quick(arr, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	void quick(int arr[], int s, int e) {
		int loc;
		if (s < e) {
			loc = partition(arr, s, e);
			quick(arr, s, loc - 1);
			quick(arr, loc + 1, e);

		}

	}
	int partition(int arr[], int s, int e) {
		int loc = s;
		int left = s;
		int right = e;
		int f = 0;
		int t;
		while (f != 1) {
			while ((arr[loc] <= arr[right]) && (loc != right))
				right = right - 1;
			if (loc == right)
				f = 1;
			else if (arr[loc] > arr[right]) {
				t = arr[loc];
				arr[loc] = arr[right];
				arr[right] = t;
				loc = right;
			}
			if (f != 1) {
				while ((arr[loc] >= arr[left]) && (loc != left))
					left++;
				if (left == loc) {
					f = 1;
				} else if (arr[loc] < arr[left]) {
					t = arr[loc];
					arr[loc] = arr[left];
					arr[left] = t;
					loc = left;
				}

			}
		}
		return loc;
	}

}
