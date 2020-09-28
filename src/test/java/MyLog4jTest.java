import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;

/**
 * Created by admin on 2018/6/29.
 */
public class MyLog4jTest {
    private static final Logger logger = LoggerFactory.getLogger(MyLog4jTest.class);
	
	@Test
    public void testLogger(){
        logger.info(" test log4j with no fixed work file ....");
    }
}
