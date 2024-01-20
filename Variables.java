package Core_Java_Fusion;

public class Variables {

	public int a; // Global variable - non static variable - instance variable
	public static int b = 45; // Global variable - static variable -> non-instance vaiable

	public void m1() {
		int d = 5; // local variable
		int e = d + a; // 5
	}

	public void m2() {
		int d = 7;
		int f = d + a;

	}

	public void m3() {
		int j = 5;
		int h = a + j;
	}

	public static void m4() {
		        System.out.println(b);
	}
	private static void m5() {
		System.out.println("b--->" + b);
		b = 5;
	}

	private void m6() {
		System.out.println("a--" + a);
		a = 45;
	}

	private void m9() {
		a = 99;
	}

	public static void main(String[] args) {
		/*
		 * m4(); m5();
		 */

//		TestVariableScope tvs = new TestVariableScope();
//		tvs.m6(); // 0
//
//		TestVariableScope tvs2 = new TestVariableScope();
//		tvs2.m6(); // 0

//		tvs.m9(); // 45
//		b = 999;

	}

}
