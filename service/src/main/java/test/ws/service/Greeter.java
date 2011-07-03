package test.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = GreeterConstants.NAMESPACE)
public interface Greeter {

    @WebMethod
    @WebResult(name = "greeting")
    public String greet(@WebParam(name = "name") String name);
}
