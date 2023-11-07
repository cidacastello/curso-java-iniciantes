package curso;

public class Tabuada {

	public static void main(String[] args) {

		int i, j;
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println("\n");
		}

	}

}
