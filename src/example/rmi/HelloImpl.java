package example.rmi;

import java.rmi.RemoteException;

public class HelloImpl implements Hello {

    @Override
    public String sayHello(String hello) throws RemoteException {
        return hello;
    }
}
