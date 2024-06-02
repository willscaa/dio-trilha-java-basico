import java.util.Scanner;

public class VerificacaoChequeEspecial { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        double saldo = scanner.nextDouble(); 
        double saque = scanner.nextDouble(); 
        double limiteChequeEspecial = 500; 

        // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:
        if (saldo > saque) {
            System.out.println("Transacao realizada com sucesso.");
            
        } else if (saldo < saque && saque < saldo+limiteChequeEspecial) {
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");

        } else{
            System.out.println("Transacao não realizada. Limite do cheque especial excedido.");

        }

                // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
             
                scanner.close();
            }
        }

// Fechamos o objeto Scanner para liberar os recursos:
    
