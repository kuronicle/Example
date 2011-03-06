package example.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    
    String sayHello(String hello) throws RemoteException;
    
}
