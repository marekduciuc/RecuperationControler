package recuperationControler.configuration;


public class SimpleConfigurationProvider implements ConfigurationProvider {

	
	public SimpleConfigurationProvider() {
		ConfiguarationPOJO configuarationPOJO = ConfiguarationPOJO.getInstance();
		configuarationPOJO.setFirstRun(null);
		//lets check temp each 5 minutes
		configuarationPOJO.setJobFrequency(300);
		
		configuarationPOJO.setLevel2cycleDuration(300);
		
		configuarationPOJO.setLevel3cycleDuration(600);

		//PrecoolingMode will not start / will be stopped under 13c
		configuarationPOJO.setMinOutdoorTemp(13);
		
		//precoolig mode will be switched once comfortable temp is reach
		configuarationPOJO.setPrecolingModeSwitchTempDifference(0);
		
		//Precooling mode is set o OneLevel it means it will use only not swich between power levels 
		// setPrecolingModeSwitchTempDifference will be ignored
		configuarationPOJO.setPreCoolingMode(PrecoolingMode.OneLevel);
		
		// Setting up precooling level
		configuarationPOJO.setPreCoolingLevel(PowerLevel.Level2);
		
		// Setting that precooling will be active till inner temp is not 2c bellow confort temp.
		configuarationPOJO.setPreCoolingTempDiference(2);
	
	}

	@Override
	public ConfiguarationPOJO getConfiguration() {
		return ConfiguarationPOJO.getInstance();
	}

}
