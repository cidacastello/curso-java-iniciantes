package curso;

public class ImparContinue {

	public static void main(String[] args) {
		int x;
		for (x = 1; x < 11; x++) {
			if (x % 2 == 0) {
				continue;
			}
			System.out.println(x + " é ímpar");
		}
	}
}
