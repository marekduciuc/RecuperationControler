package recuperationControler.siemence;

import ch.qos.logback.core.joran.conditional.ThenAction;

public class DataPoint {
	
	private String address;
	private String name;
	private String valueType;
		
	public DataPoint() {
		// TODO Auto-generated constructor stub
	}

	public DataPoint(String address, String name, String valueType) {
		super();
		this.address = address;
		this.name = name;
		this.valueType = valueType;
	}

	public String getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	public String getValueType() {
		return valueType;
	}
	

}
