package test.ws.client;

import test.ws.service.Greeter;
import test.ws.service.GreeterConstants;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {

        String name = "World";
        if (args.length > 0) {
            name = args[0];
        }

        Service greeterService = Service.create(
                new URL("http://localhost:6666/greeter?wsdl"),
                new QName(GreeterConstants.NAMESPACE, GreeterConstants.SERVICE_NAME));
        Greeter greeter = greeterService.getPort(Greeter.class);
        String greeting = greeter.greet(name);

        System.out.println();
        System.out.println(greeting);
        System.out.println();
        System.out.println();
    }
}
