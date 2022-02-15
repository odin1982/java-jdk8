package jdk8.junit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Test {
	static final Logger log = LogManager.getLogger(Log4j2Test.class.getName());

	public static void main(String[] args) {
		log.info("Test log4j2");
	}

}