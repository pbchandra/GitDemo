package MavenAutomation;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class RestAPITest {

	
	
	
	@Test
	public void post() {
		System.out.println("post");
	}
	
	
	public static Logger log = LogManager.getLogger(RestAPITest.class.getName());
	@Test
	public void delete() {
		//BasicConfigurator.configure();
		System.out.println("delete");
		log.debug("this is debug message");
		log.error("the is log of error");
		log.fatal("this is log fatal");
		log.info("this is info message");
	
	}
	
}
