/** All copyright reserved 2019.
 * 
 */
package powermockito;

/**
 * @author Anil Oct 6, 2019
 */
public class A extends B {

	A() {
		super();
	}

	public String m1(String id) {
		System.out.println("Enter m1 method");
		String decs= null;
		if(id!=null) {
			decs = "good";
		}
		return decs;
	}


}
