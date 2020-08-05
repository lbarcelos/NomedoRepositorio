package Calculadora;


import java.rmi.Remote;
import java.rmi.RemoteException;

//A interface que declara os métodos que os clientes podem invocar a partir de uma máquina virtual remota é conhecido como interface remota.
public interface Interface extends Remote{ 
                                               
    //Cada declaração de método na interface remota deve incluir a exceção RemoteException
    //Quando uma chamada de método remoto tiver um erro, a exceção RemoteException é executada para garantir a robustez das aplicações.
    public int add(int x, int y) throws RemoteException;
    public int sub(int x, int y) throws RemoteException;
    public int mul(int x, int y) throws RemoteException;
    public int div(int x, int y) throws RemoteException;
}

