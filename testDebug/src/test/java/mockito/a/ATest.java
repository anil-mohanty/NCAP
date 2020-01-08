/** All copyright reserved 2019.
 * 
 */
package mockito.a;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import mockito.b.B;
import mockito.b.BReq;
import mockito.b.BResp;

/**
 * @author Anil Oct 5, 2019
 */
@RunWith(MockitoJUnitRunner.class)
public class ATest {

	@Mock
	B mockB;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		A a = new A(mockB);
		Mockito.when(mockB.m2(Matchers.any(BReq.class))).thenReturn(mockBResp());
		
		AReq areq = new AReq();
		areq.setName("anil");
		areq.setoId("22");
		AResp aresp = a.m1(areq);
		assertNotNull(aresp);
		//assertEquals(30.0f, aresp.getPrice());
	}

	
	private BResp mockBResp() {
		System.out.println("mock response");
		BResp bresp = new BResp();
		bresp.setStatus("okkk");
		bresp.setDescription("thanks");
		return bresp;
	}

}
