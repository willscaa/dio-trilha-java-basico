import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
            int opcao = scanner.nextInt(); 
        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        switch(opcao){
          
          case 1:
             
          double valorDepositado = scanner.nextDouble();
          saldo = saldo+valorDepositado;
          
          System.out.println("Saldo atual: "+saldo);
          
          break;
          
          case 2:      
          double valorSacado = scanner.nextDouble();
           if(valorSacado > saldo){
            System.out.println("Saldo insuficiente");
             }else{
            saldo = saldo - valorSacado;
             }
          System.out.println("Saldo atual: "+saldo);
          break;
            
          case 3:
          System.out.println("Saldo atual: "+saldo);
          break;
          
          case 4:
          System.out.println("Programa encerrado");
          return;
         
          default:
          System.out.println("Opção inválida. Tente novamente."); 
        }
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            scanner.close();
               
            }
        }
    }
