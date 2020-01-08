/** All copyright reserved 2019.
 * 
 */
package powermockito;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.powermock.api.support.membermodification.MemberModifier.suppress;
import static org.powermock.api.support.membermodification.MemberMatcher.constructor;

/**
 * @author Anil Oct 6, 2019
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({A.class})
public class ATest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		 suppress(constructor(B.class));
		 A a= new A();
		 String dec=a.m1("1234");
		 assertNotNull(dec);
		 assertEquals("good",dec);
	}

}
