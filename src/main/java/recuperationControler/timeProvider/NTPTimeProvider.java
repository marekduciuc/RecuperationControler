package recuperationControler.timeProvider;

import java.util.Date;
import java.util.List;

import org.apache.commons.net.time.TimeTCPClient;
import org.apache.commons.net.time.TimeUDPClient;

public class NTPTimeProvider implements TimeProvider {

	private  List<String> hosts ;
	
	public List<String> getHosts() {
		return hosts;
	}

	public void setHosts(List<String> hosts) {
		this.hosts = hosts;
	}

	public NTPTimeProvider(List<String> hosts) {
		hosts.addAll(hosts);
		
	}

	@Override
	public Date getTime() {
		for (String host : hosts) {
			TimeTCPClient client = new TimeTCPClient();
            // We want to timeout if a response takes longer than 5 seconds
            client.setDefaultTimeout(5000);
            try {
                client.connect (host);
                java.util.Date ntpDate = client.getDate();
                client.disconnect();
                // Just to be extra caution.
                if (ntpDate != null) {
                    return ntpDate;
                }
            }
            catch (java.net.SocketException exp) {
                exp.printStackTrace();
            }
            catch (java.io.IOException exp) {
                exp.printStackTrace();
            }
        }
        return null;
    }
		
	}
