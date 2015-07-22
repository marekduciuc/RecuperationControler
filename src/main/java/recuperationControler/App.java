/**
 * 
 */
package recuperationControler;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import recuperationControler.siemence.DataPointDAO;
import recuperationControler.timeProvider.NTPTimeProvider;

/**
 * @author admin
 *
 */
public class App {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	private  NTPTimeProvider timeProvider;
	private  Recuperation recuperation;
	@Autowired
	private  DataPointDAO ActualInnerDAO;
	@Autowired
	private  DataPointDAO ComfortInnerDAO;
	@Autowired
	private  DataPointDAO ActualOutDAO;
	
	
	public App( NTPTimeProvider timeProvider,  Recuperation recuperation) {
		super();
		this.timeProvider = timeProvider;
		this.recuperation = recuperation;
	}

	static final Logger logger = Logger.getLogger(App.class);

	public void run()  {

		float tin = ActualInnerDAO.getFloatValue();
		float tcon = ComfortInnerDAO.getFloatValue();
		float tout = ActualOutDAO.getFloatValue();
		
		// create gpio controller
		
		// provision gpio pin #01 as an output pin and turn on
		
		 
		// lets run recuperation for 1 hpr on level2
		 if ((tin > tout  && tin > tcon)) {
			 logger.info("Tin > Tout and Tin > Tcon Starting cooling for 1 hour");	
			 try {
				recuperation.runOnLevel2();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				logger.error(e.getStackTrace());
				e.printStackTrace();
			}
		 }
		
		 // stop all GPIO activity/threads by shutting down the GPIO controller
		// (this method will forcefully shutdown all GPIO monitoring threads and
		// scheduled tasks)
		
	}

	

}
