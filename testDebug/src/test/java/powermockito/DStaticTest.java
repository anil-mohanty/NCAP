/** All copyright reserved 2019.
 * 
 */
package powermockito;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(util.class)
public class DStaticTest {
	
	private DStatic ut;
	@Before
	public void setUp() throws Exception {
		PowerMockito.mockStatic(util.class);
		ut = new DStatic();
	}	

	@Test
	public void test() {
		int distance =10;
		PowerMockito.when(util.randomDistance(1)).thenReturn(distance);
		
		assertEquals(ut.m1(),"executed");
	}

}
