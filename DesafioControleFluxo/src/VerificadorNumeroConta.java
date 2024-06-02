import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Digite o numero da conta: ");
            String numeroConta = scanner.nextLine();

            verificarNumeroConta(numeroConta);

            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
          
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    
    private static void verificarNumeroConta(String numeroConta) {
      
     if (numeroConta.length()!= 8 || !numeroConta.matches("\\d{8}")) {
            
        throw new IllegalArgumentException("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
