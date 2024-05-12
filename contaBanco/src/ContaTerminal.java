import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
   
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta bancária: ");
        int numeroConta = scanner.nextInt(); 

        System.out.println("Digite o número da agência: ");
        String agenciaBancaria = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println( "Digite o saldo: " );
        Double saldoConta = scanner.nextDouble();

        System.out.print("Olá "+nomeCliente+ " muito obrigado por criar uma conta em nosso banco, sua agência é: "+agenciaBancaria+" conta: "+numeroConta+ " e seu saldo de: "+saldoConta+ " que já esta disponível para saque. ");
    }
}
