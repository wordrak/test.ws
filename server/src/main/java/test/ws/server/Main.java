package test.ws.server;

import javax.xml.ws.Endpoint;

public class Main {

    private static Endpoint endpoint;
    private static boolean done = false;

    public static void main(String[] args) throws InterruptedException {
        GreeterService greeter = new GreeterService();
        endpoint = Endpoint.publish("http://0.0.0.0:6666/greeter", greeter);

        while (!done) {
            Thread.sleep(1000);
        }
        if (endpoint != null && endpoint.isPublished()) {
            endpoint.stop();
        }
    }
}
