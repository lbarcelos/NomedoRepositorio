package Calculadora;


import Calculadora.Implementacao;
import java.rmi.Naming;
import java.rmi.registry.Registry;

public class Servidor {
    public static void main (String arqs[]){
    try{
        // Cria um registro de objeto remoto que aceite chamadas em uma porta específica.
        Registry r = java.rmi.registry.LocateRegistry.createRegistry(1090);
        
        // Especifica o nome pelo qual o objeto remoto deverá ficar conhecido e cria o objeto 
        r.rebind("Calc", new Implementacao());
        
        System.out.println ("Servidor conectado");
    } 
    catch (Exception e) {
        System.out.println ("Servidor não conectado" + e ); 
    }
}
}
