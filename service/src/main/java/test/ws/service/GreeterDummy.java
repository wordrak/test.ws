package test.ws.service;

import javax.jws.WebService;

@WebService(endpointInterface = "test.ws.service.Greeter", serviceName = GreeterConstants.SERVICE_NAME, portName = GreeterConstants.PORT_NAME, targetNamespace = GreeterConstants.NAMESPACE)
public class GreeterDummy implements Greeter {

    public String greet(String name) {
        return null;
    }
}
