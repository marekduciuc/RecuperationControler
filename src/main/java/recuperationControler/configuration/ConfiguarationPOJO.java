package recuperationControler.configuration;

import java.math.BigDecimal;
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
	 * Precooling will not start / will be stoped if outdoor temp goes under this temperature;
	 * */
	private float minOutdoorTemp;
	
	/**  
	 * What what is precooling power level 1 or 2
	 * */
	private PowerLevel preCoolingLevel;
	
	/**
	 * How precoolig will be done 1 phase on in 2 phases
	 */
	private PrecoolingMode preCoolingMode;
	
	/**
	 * If ther is 
	 */
	private int precolingModeSwitchTempDifference; 
	
	/**  
	 * What what should be temperature difference for precooling to stop. 
	 * If outdoor is 17C Requested temperature is 22 and preCoolingTempDiference is 3 
	 * then precooling will stop when actual indoor is 19 or outdoor rise above actual indoor
	 * */
	private float preCoolingTempDiference;
	
	
	private void ConfiguarationPOJO() {
	}
	
	 private static class SingletonHolder { 
		    private static final ConfiguarationPOJO INSTANCE = new ConfiguarationPOJO();
	 }
	
	public static ConfiguarationPOJO getInstance(){
		return SingletonHolder.INSTANCE;
	}


	public long getJobFrequency() {
		return jobFrequency;
	}


	public void setJobFrequency(long jobFrequency) {
		this.jobFrequency = jobFrequency;
	}


	public Date getFirstRun() {
		return firstRun;
	}


	public void setFirstRun(Date firstRun) {
		this.firstRun = firstRun;
	}


	public long getLevel2cycleDuration() {
		return level2cycleDuration;
	}


	public void setLevel2cycleDuration(long level2cycleDuration) {
		this.level2cycleDuration = level2cycleDuration;
	}


	public long getLevel3cycleDuration() {
		return level3cycleDuration;
	}


	public void setLevel3cycleDuration(long level3cycleDuration) {
		this.level3cycleDuration = level3cycleDuration;
	}


	public float getMinOutdoorTemp() {
		return minOutdoorTemp;
	}


	public void setMinOutdoorTemp(float minOutdoorTemp) {
		this.minOutdoorTemp = minOutdoorTemp;
	}


	public PowerLevel getPreCoolingLevel() {
		return preCoolingLevel;
	}


	public void setPreCoolingLevel(PowerLevel preCoolingLevel) {
		this.preCoolingLevel = preCoolingLevel;
	}


	public PrecoolingMode getPreCoolingMode() {
		return preCoolingMode;
	}


	public void setPreCoolingMode(PrecoolingMode preCoolingMode) {
		this.preCoolingMode = preCoolingMode;
	}


	public int getPrecolingModeSwitchTempDifference() {
		return precolingModeSwitchTempDifference;
	}


	public void setPrecolingModeSwitchTempDifference(
			int precolingModeSwitchTempDifference) {
		this.precolingModeSwitchTempDifference = precolingModeSwitchTempDifference;
	}


	public float getPreCoolingTempDiference() {
		return preCoolingTempDiference;
	}


	public void setPreCoolingTempDiference(float preCoolingTempDiference) {
		this.preCoolingTempDiference = preCoolingTempDiference;
	}


}
