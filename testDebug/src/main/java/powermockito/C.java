/** All copyright reserved 2019.
 * 
 */
package powermockito;

/**
 * @author Anil Oct 6, 2019
 */
public class C {

	int x=100;
	C(int val) {
		System.out.println("Constructor........");
		int y= val/0;
	}

	public int m1(int a) {
		System.out.println("m1 method...........");
		return a;
	}


}
