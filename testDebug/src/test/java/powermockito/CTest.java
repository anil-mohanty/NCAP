/** All copyright reserved 2019.
 * 
 */
package powermockito;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

/**
 * @author Anil Oct 6, 2019
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(C.class)
public class CTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		C a = Whitebox.newInstance(C.class);
		int i = a.m1(10);
		assertEquals(10, i);
	}

}
