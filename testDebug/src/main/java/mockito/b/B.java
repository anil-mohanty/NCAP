/** All copyright reserved 2019.
 * 
 */
package mockito.b;

/**
 * @author Anil Oct 5, 2019
 */
public class B {

	/**
	 * @param breq 
	 * @return
	 */
	public BResp m2(BReq breq) {
		BResp bresp = new BResp();
		bresp.setStatus("ok");
		System.out.println("B :"+ bresp);
		return bresp;
	}

	/**
	 * @param getoId
	 * @return
	 */
	public float m3(String getoId) {
		float f= 30.0f;
		return f;
	}

}
