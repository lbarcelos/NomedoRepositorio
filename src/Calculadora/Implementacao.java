package Calculadora;

import Calculadora.Interface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/* A classe UnicastRemoteObject cria objetos remotos e os exporta, ou seja, 
permite que os objetos remotos sejam usados por clientes remotos */
public class Implementacao extends UnicastRemoteObject implements Interface {

    public Implementacao() throws RemoteException {
        int a,b;
    }
    
    //Implementação dos métodos da Interface  
    public int add(int a, int b) throws RemoteException{
        return a+b;
    }
    public int sub(int a, int b) throws RemoteException{
        return a-b;
    }
    public int mul(int a, int b) throws RemoteException{
        return a*b;
    }
    public int div(int a, int b) throws RemoteException{
        return a/b;
    }
}
