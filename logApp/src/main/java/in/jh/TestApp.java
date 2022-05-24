package in.jh;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class TestApp {
	
	//3. create logger object
	private static Logger log = Logger.getLogger(TestApp.class);
	
	
	public static void main(String[] args) throws Exception {
		//1. create layout
//		Layout layout = new SimpleLayout();
//		Layout layout = new HTMLLayout();
//		Layout layout = new XMLLayout();	
		Layout layout = new PatternLayout("%p %d %C %M %m %n");
		
		//2. create appender + link layout
//		Appender app = new ConsoleAppender(layout);
		Appender app = new FileAppender(layout,"E:/MyLogs/data.log");
		
		//4.link appender with logger
		log.addAppender(app);
		
		//---print messages---
		log.debug("FROM DEBUG");
		log.info("FROM INFO");
		log.fatal("FROM FATAL");
		log.error("FROM ERROR");
		log.warn("FROM WARN");
		
		
	}

}
