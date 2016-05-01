package dynamic;

public class Fibonacii {

	public static int fibo(int[] m, int n) {
		if(m[n]!= -1){
			return m[n];
		}
		else{
			return  fibo(m, n-1)+ fibo(m, n-2);
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] m = { -1, -1, -1, -1, -1, -1, -1, -1 };
		m[0] = 0;
		m[1] = 1;
		for (int i = 0; i < m.length; i++) {
			System.out.print(fibo(m, i)+" ");
		}
		

	}

}
