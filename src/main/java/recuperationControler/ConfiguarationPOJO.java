package recuperationControler;

import java.util.Date;

public class ConfiguarationPOJO {

	/**  
	 * jobFrequency how often should be checked temperature 
	 * */
	private long  jobFrequency;
	
	/**  
	 * date of first run 
	 * */
	private Date  firstRun;
	
	/**
	 * duration for manual level2 run
	 * */
	private long  level2cycleDuration;
	
	/**
	 * duration for manual level3 run
	 * */
	private long  level3cycleDuration;	
	
	/**  
	 * How long shoudl be 1 precooling cycle
	 * */
	private long  preCoolingcycleDuration;
	
	/**  
	 * What is minimal temperature to beprecooling active
	 * */
	private float minOutdoorTemp;
	
	/**  
	 * What what is precooling power level 1 or 2
	 * */
	private byte  preCoolingLevel;
	
	/**  
	 * What what should be temperature difference for precooling to stop. 
	 * If outdoor is 17C Requested temperature is 22 and preCoolingTempDiference is 3 
	 * then precooling will stop when actual indoor is 19 or outdoor rise above actual indoor
	 * */
	private float preCoolingTempDiference;
	
	
	public Configuaration() {
		// TODO Auto-generated constructor stub
	}


}
