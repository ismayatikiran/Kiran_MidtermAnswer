package math;

class Pattern {

public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * public 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int count = 0;
		for (int K = 100; K >= 0; K--) {
		count++;
		if (count <= 10) {
		System.out.println(K + " ");
		} else {
		for (K = 90; K >= 0; K -= 2) {
		if (count > 10 && count <= 20) {
		System.out.println(K + " ");
		count++;
		} else {
		for (K = 40; K >= 0; K -= 4) {
		if (count > 30 && count <= 40) {
		System.out.println(K + " ");
		count++;
		}
		}
		}
		}
		}
		}
		}
		}
