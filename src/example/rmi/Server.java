package example.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {

    public static void main(String[] args) {
        
        try{
           HelloImpl helloImpl = new HelloImpl();
           Hello stub = (Hello) UnicastRemoteObject.exportObject(helloImpl, 0);
           
           Registry registry = LocateRegistry.getRegistry();
           registry.bind("Hello", stub);
           
           System.out.println("Server ready");
        }catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
