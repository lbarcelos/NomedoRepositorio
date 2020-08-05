package Calculadora;


import Calculadora.Interface;
import java.rmi.Naming;
import java.util.Scanner;

public class Cliente {
   public static void main (String arqs[]){
       Scanner sc = new Scanner(System.in);
    try{
        //Cria um objeto do tipo Interface que recebe o endereço do servidor        
        Interface c = (Interface) Naming.lookup("//127.0.0.1:1090/Calc");
        
        //Menu de chamada dos metodos
        System.out.println("Menu");
        System.out.println("Digite (1) para Adição:");
        System.out.println("Digite (2) para Subtração:");
        System.out.println("Digite (3) para Multiplicação:");
        System.out.println("Digite (4) para Divisão:");
        System.out.print("Opção Escolhida: ");
        
        
        // Escolha do Método
        int escolha = sc.nextInt();

        int x, y;
        switch (escolha){
            case 1: {
                System.out.println("Entre com X: ");
                x = sc.nextInt();
                System.out.println("Entre com Y: ");
                y = sc.nextInt();
                
                // Invocação Remota do Método add
                System.out.println("Resultado:" + c.add(x,y));
                break;
            }
            case 2: {
                System.out.println("Entre com X: ");
                x = sc.nextInt();
                System.out.println("Entre com Y: ");
                y = sc.nextInt();
                System.out.println("Resultado:" + c.sub(x,y));
                break;
            }
            case 3: {
                System.out.println("Entre com X: ");
                x = sc.nextInt();
                System.out.println("Entre com Y: ");
                y = sc.nextInt();
                System.out.println("Resultado:" + c.mul(x,y));
                break;
            }
             case 4: {
                System.out.println("Entre com X: ");
                x = sc.nextInt();
                System.out.println("Entre com Y: ");
                y = sc.nextInt();
                System.out.println("Resultado:" + c.div(x,y));
                break;
            }
        }     
    } catch (Exception e) {
        System.out.println ("Exception" + e ); 
    }
} 
}
