package recuperationControler.siemence;


public class DataPointDAO {
	private RegulationDataProvider webServer;
	private DataPoint datapoint;
	
	public DataPointDAO(RegulationDataProvider webServer, DataPoint datapoint) {
		this.webServer = webServer;
		this.datapoint = datapoint;		
	}

	public float getFloatValue() {
		return this.webServer.getDataPointValueFloat(this.datapoint.getAddress());
	}
	
	

}
