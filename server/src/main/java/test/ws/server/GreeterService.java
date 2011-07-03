package test.ws.server;

import test.ws.service.Greeter;
import test.ws.service.GreeterConstants;

import javax.jws.WebService;

@WebService(endpointInterface = "test.ws.service.Greeter", targetNamespace = GreeterConstants.NAMESPACE, serviceName = GreeterConstants.SERVICE_NAME, portName = GreeterConstants.PORT_NAME)
public class GreeterService implements Greeter {
    @Override
    public String greet(String name) {
        return String.format("Hello %s!", name);
    }
}
