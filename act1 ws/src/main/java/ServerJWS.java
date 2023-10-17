
import org.sid.BanqueService;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args){

        Endpoint.publish("http://localhost:8098/",new BanqueService());

    }
}
