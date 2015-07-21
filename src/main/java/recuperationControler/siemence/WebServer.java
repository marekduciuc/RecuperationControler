package recuperationControler.siemence;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import us.monoid.web.JSONResource;
import us.monoid.web.Resty;

public class WebServer {

	private String sessionID; 
	private Resty resty =  new Resty();
	private String ip = "46.174.56.18:40002"; 
	private String login  = "Administrator";
	private String passwd = "password";
	
	static final Logger logger = Logger.getLogger(WebServer.class);

	public WebServer(String ip, String login, String passwd) {
		super();
		this.ip = ip;
		this.login = login;
		this.passwd = passwd;
		this.authenticate(this.resty, login, passwd);
	}
	
	public void authenticate(Resty r,String usr,String pwd ) {
		StringBuilder uri  = new StringBuilder();
		JSONResource message = new JSONResource(null);
		uri.append("http://"+this.ip+"/api/auth/login.json?user=");
		uri.append(usr);
		uri.append("&pwd=");
		uri.append(pwd);	
		try {
			message = r.json(uri.toString());
			if (Boolean.parseBoolean(message.get("Result.Success").toString())){
				this.sessionID = message.get("SessionId").toString();
			}
		} catch (Exception e) {
			logger.debug("URL:"+uri);
			logger.error(e.getStackTrace());
		}
	}


public String getSessionID() {
	return sessionID;
}

public String getDataPointValue(String id){
	if (this.sessionID!=null) {
		StringBuilder uri  = new StringBuilder();
		JSONResource message = new JSONResource(null);
		uri.append("http://"+this.ip+"/api/menutree/read_datapoint.json?Id="+id+"&SessionId=");
		uri.append(this.sessionID);
		try {
			message = this.resty.json(uri.toString());
			if (Boolean.parseBoolean(message.get("Result.Success").toString())){
					return message.get("Data.Value").toString() +" "+message.get("Data.Unit").toString();
				}
		} catch (Exception e) {
			logger.debug("URL:"+uri);
			logger.error(e.getStackTrace());
		}
		return"1";
	}
	return"2";
}

	
public float getDataPointValueFloat(String id){
		StringBuilder uri  = new StringBuilder();
		JSONResource message = new JSONResource(null);
		uri.append("http://"+this.ip+"/api/menutree/read_datapoint.json?Id="+id+"&SessionId=");
		uri.append(this.sessionID);
		try {
			message = this.resty.json(uri.toString());
			if (Boolean.parseBoolean(message.get("Result.Success").toString())){
					return Float.parseFloat( message.get("Data.Value").toString());
				}
		} catch (Exception e) {
			logger.debug("URL:"+uri);
			logger.error(e.getStackTrace());
		}
		return 1;
	}
}