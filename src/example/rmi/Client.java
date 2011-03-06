package example.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args) {
        
        String host = (args.length < 1) ? null : args[0]; 
        String message = (args.length < 2) ? "RMI Sample" : args[1];
        
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            Hello stub = (Hello) registry.lookup("Hello");
            
            String response = stub.sayHello(message);
            System.out.println("Response: " + response);
        } catch (Exception e) {
            System.err.println("Clinet exception: " + e.toString());
            e.printStackTrace();
        }
    }
    
}
