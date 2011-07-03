package test.ws.client;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {

        String name = "World";
        if (args.length > 0) {
            name = args[0];
        }

        GreeterService greeterService = new GreeterService(
                new URL("http://localhost:6666/greeter?wsdl"),
                new QName(test.ws.service.Greeter.NAMESPACE, test.ws.service.Greeter.SERVICE_NAME));
        Greeter greeter = greeterService.getGreeterPort();
        String greeting = greeter.greet(name);

        System.out.println();
        System.out.println(greeting);
        System.out.println();
        System.out.println();
    }
}
