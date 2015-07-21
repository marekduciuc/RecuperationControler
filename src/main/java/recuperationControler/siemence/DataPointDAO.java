package recuperationControler.siemence;


public class DataPointDAO {
	private WebServer webServer;
	private DataPoint datapoint;
	
	public DataPointDAO(WebServer webServer, DataPoint datapoint) {
		this.webServer = webServer;
		this.datapoint = datapoint;		
	}

	public float getFloatValue() {
		return this.webServer.getDataPointValueFloat(this.datapoint.getAddress());
	}
	
	

}
