
public class Swork1 {
	private int[] carr;

	public Swork1(int[] arr) {
		this.carr = arr.clone();
	}

	public static void main(String args[]) {
		int[] list = new int[] { 10, 9, 8, 7, 20, 5, 4, 3, 12, 1, 0 };
		Swork1 s = new Swork1(list);
		s.merge_sort(0, list.length - 1);
	}

	public void merge_sort(int start, int end) {

		int mid = (start + end) / 2;
		if (start >= end)
			return;
		merge_sort(start, mid);
		merge_sort(mid + 1, end);

		merge(start, mid, end);

	}

	private void merge(int start, int mid, int end) {
		int[] carr = this.carr.clone();
		int indexA = start;
		int indexB = mid + 1;
		System.out.println("indexA : " + indexA + "  indexB : " + indexB);
		while (indexA <= mid && indexB <= end) {
			if (this.carr[indexA] <= this.carr[indexB]) {

				carr[start++] = this.carr[indexA++];

			} else {

				carr[start++] = this.carr[indexB++];

			}
		}
		if (indexA > mid) {
			while (indexB <= end) {
				carr[start++] = this.carr[indexB++];
			}
		} else if (indexB > end) {
			while (indexA <= mid) {
				carr[start++] = this.carr[indexA++];
			}
		}
		this.carr = carr.clone();

		for (int e : this.carr) {
			System.out.print(" " + e);
		}
		System.out.println(" ");
	}
}
