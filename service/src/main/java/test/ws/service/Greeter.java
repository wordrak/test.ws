package test.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = Greeter.NAMESPACE, serviceName = Greeter.SERVICE_NAME)
public class Greeter {

    public static final String NAMESPACE = "http://greeter.test.ws";
    public static final String SERVICE_NAME = "GreeterService";

    @WebMethod
    @WebResult(name = "greeting")
    public String greet(@WebParam(name = "name") String name) {
        return null;
    }
}
