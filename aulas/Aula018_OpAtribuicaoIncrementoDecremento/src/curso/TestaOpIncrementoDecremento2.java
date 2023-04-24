package curso;

public class TestaOpIncrementoDecremento2 {
	
	public static void main(String[] args) {
		int x = 10, y, z;
		y = x++;
		System.out.println(y);
		System.out.println(x);
		
		x = 10;
		z = ++x;
		System.out.println(x);
		System.out.println(z);
	}

}
