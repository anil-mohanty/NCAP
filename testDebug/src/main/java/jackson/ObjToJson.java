/** All copyright reserved 2019.
 * 
 */
package jackson;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author Anil Oct 1, 2019
 */
public class ObjToJson {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 */
	static Logger logger = Logger.getLogger(ObjToJson.class);
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
				
		SimpleLayout simple = new SimpleLayout();
//		HTMLLayout simple = new HTMLLayout();
//		ConsoleAppender appender = new ConsoleAppender(simple);
		FileAppender appender = new FileAppender(simple,"log.txt");
		logger.addAppender(appender);
//		BasicConfigurator.configure();
		logger.info("The is info");
		BeansTest test = new BeansTest();
		test.setfName("Anil");
		test.setlName("kumar");
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonView = mapper.defaultPrettyPrintingWriter().writeValueAsString(test);
		System.out.println(jsonView);
		logger.debug("this is debug");
		try {
		int i=1/0;
		}catch(Exception e) {
		logger.fatal("this is serious :"+e);
		}
	}

}
