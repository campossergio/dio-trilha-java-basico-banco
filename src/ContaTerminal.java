import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws IOException {
       // TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
         /**
        String agencia = args[0];
        int numeroConta = Integer.valueOf(args[1]);
        String nomeTitular = args[2];
        double saldo = Double.valueOf(args[3]);
        */

       // Exibir as mensagens para o nosso usuário
        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da Conta: ");
        String numeroConta = scanner.nextLine();

        System.out.println("Digite o nome do Titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.println("Digite o saldo do Titular: ");
        double saldo = scanner.nextDouble();

       // Obter pela Scanner os valores digitados no terminal
        System.out.println("Agencia: " + agencia);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Saldo: " + saldo);

       // Exibir a mensagem de conta criada
        System.out.println("Olá " + nomeTitular + ", obrigado por criar uma conta em nosso banco, sua Agência: " + agencia + ", número da sua Conta: " + numeroConta + ", Saldo: " + saldo + " e já está disponível para saque!!!");
    }
}