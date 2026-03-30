public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void bubbleSortString(String[] strings) {
		int n = strings.length;
		String temp;
		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++)
				
			if (strings[j].compareToIgnoreCase(strings[j + 1]) > 0) {
				temp = strings[j];
				strings[j] = strings[j + 1];
				strings[j + 1] = temp;
			}
		}
	}

}