/** All copyright reserved 2019.
 * 
 */
package testDebug;

/**
 * @author Anil Jul 22, 2019
 */
public class Test1 {

	void m1() {
		System.out.println("M1 method");
	}

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		System.out.println(t1);
		t1.m1();
		Test2 t2 = new Test2();
		System.out.println(t2);
		t2.m2();
	}

}
