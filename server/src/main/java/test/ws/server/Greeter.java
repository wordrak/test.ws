package test.ws.server;

import javax.jws.WebService;

@WebService(endpointInterface = "test.ws.service.Greeter", targetNamespace = Greeter.NAMESPACE, serviceName = Greeter.SERVICE_NAME)
public class Greeter extends test.ws.service.Greeter {
    @Override
    public String greet(String name) {
        return String.format("Hello %s!", name);
    }
}
