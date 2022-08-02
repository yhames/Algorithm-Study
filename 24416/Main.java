import java.util.Scanner;

public class Main {

	static Long[] f = new Long[41];
	static Long recursion = 0L;
	static Long dynamic = 0L;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		sc.close();
		fib(n);
		fibonacci(n);
		System.out.println(recursion + " " + dynamic);
	}

	static Long fib(int n) {
		if(n==1 || n==2) {
			recursion++;
			return 1L;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}

	static Long fibonacci(int n) {
		f[1] = f[2] = 1L;
		for(int i=3; i<=n; i++) {
			dynamic++;
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}
}
