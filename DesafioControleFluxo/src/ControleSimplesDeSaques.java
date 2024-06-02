import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        
        double limiteDiario = scanner.nextDouble();
        double valorSaque;
        int maxSaques = 20;  

       
        for (int i = 0; i < maxSaques; i++) {
            
            valorSaque = scanner.nextDouble();
            
           
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (valorSaque <= limiteDiario) {
                
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
                
            } else{
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
        }

    
        scanner.close();
    }
}
