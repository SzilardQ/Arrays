public class Arrays {

	public static void printArray(int[] array) {
		// TODO: Implementieren Sie hier die Ausgabe des Arrays array
		System.out.print("[");
		for(int i= 0; i < array.length; i++){
			System.out.print(array[i]);
			if(i < array.length - 1){
				System.out.print(",");
			}
	}
		System.out.println("]");

	public static int sum(int[] array) {
		// TODO: Berechnen Sie die Summe der Elemente des Arrays und geben Sie diese zurueck
			int summe = 0;
			for(int i = 0 ; i < array.length; i++){
				summe +=array[i];

			}
		return 0;
	}

	public static double mean(int[] array) {
		// TODO: Berechnen Sie den Mittelwert von array und geben Sie ihn zurueck
		return 0.0;
	}

	public static int[] sumArrays(int[] array1, int[] array2) {
		// TODO: Berechnen Sie die Summe der beiden Arrays und geben Sie das Ergebnis zurueck
		return {};
	}

	public static int maximum(int[] array) {
		// TODO: Bestimmen Sie das Maximum des Arrays und geben Sie es zurueck
		return 0;
	}

	public static int[] tail(int[] array) {
		// TODO: Bestimmen Sie das kuerzere Array und geben Sie es zurueck
		return {};
	}

	public static boolean checkSorting(int[] array) {
		// TODO: Ermitteln Sie, ob array sortiert ist. Falls ja, soll true zurueckgegeben werden, falls nein, false. Geben Sie das Ergebnis zurueck.
		
		
		return false;
	}

	public static boolean[] evenNumbers(int[] array) {
		// TODO: Ermitteln Sie hier die geraden Elemente in array. Geben Sie das neu erzeugte Array zurueck
		
		return {};
	}
	
	public static void printBooleanArray(boolean[] array) {
		// TODO: Implementieren Sie diese Methode fuer die letzte Teilaufgabe (analog zu printArray)
	}


	public static void main(String[] args) {
		// TODO: Testen Sie hier Ihre Methoden ausgiebig!
		int[] array1 = new int[]{0, 5, 12, 17, 21, 42};
		int[] array2 = new int[]{23, 18, 3, 16, 41, 7, 9};

		printArray(array1);
		printArray(array2);
		sum(array1);

		}
	}
}
