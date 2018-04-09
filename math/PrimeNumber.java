package math;



public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int K = 0;
		int number = 0;
		String PrimeNumbers = "";
		for (K = 2; K <= 1000000; K++) {
			int counter = 0;
			for (number = K; number >=2; number--) {
				if (K % number == 0) {
					counter = counter + 2;
				}
				if (counter ==2) {
					PrimeNumbers = PrimeNumbers + K + " ";
				}
			}
			System.out.println("Prime numbers 2 to 1000000 are: ");
			System.out.println(PrimeNumbers);
		}
	}
}