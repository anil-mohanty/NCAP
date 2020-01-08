/** All copyright reserved 2019.
 * 
 */
package mockito.a;

import mockito.b.B;
import mockito.b.BReq;
import mockito.b.BResp;

/**
 * @author Anil Oct 5, 2019
 */
public class A {

	private B b;
	
	public A (B b) {
		this.b=b;
	}
	AResp m1(AReq areq) {
		System.out.println(areq);
		BReq breq = new BReq();
		breq.setName(areq.getName());
		breq.setoId(areq.getoId());
		BResp bresp= b.m2(breq);
		
		float price = b.m3(areq.getoId());
		AResp aresp = new AResp();
		aresp.setStatus(bresp.getStatus());
		aresp.setDescription(bresp.getDescription());
		aresp.setPrice(price);
		System.out.println(aresp);
		return aresp;
	}
}
