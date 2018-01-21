package utilities;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



public class Log4j {
	
	private static Logger log= LogManager.getLogger(Log4j.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("debugging");
	if(5>1) {	
		log.info("information");
	}
	
		
		

	}
	
	

}
