/** All copyright reserved 2019.
 * 
 */
package testDebug;

import org.apache.log4j.Logger;

/**
 * @author Anil Oct 8, 2019
 */
public class LogTest {

	static Logger logger = Logger.getLogger(LogTest.class);
	public static void main(String[] args) {
		logger.info("this is info");
		String name ="Anil Kumar";
		StringBuffer sb = new StringBuffer(name);
		sb.reverse();
		try {
			int i =1/0;
		} catch (Exception e) {
			logger.error(e);
		}
		;
	}

}
