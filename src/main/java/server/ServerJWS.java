package server;
import jakarta.xml.ws.Endpoint;
import ws.BankServer;

public class ServerJWS {
    public static void main(String[] args) {

        String url = "http://0.0.0.0:8787/";
        Endpoint.publish(url, new BankServer());
        System.out.println("Web service deployé sur " + url);
}
}
