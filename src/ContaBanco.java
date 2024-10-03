import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        ContaTerminal contaTerminal = new ContaTerminal();

        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useLocale(Locale.US);
            System.out.println("Digite seu nome:");
            contaTerminal.nomeCliente = scanner.nextLine();
            System.out.println("Digite sua Agencia:");
            contaTerminal.agencia = scanner.nextLine();
            System.out.println("Digite o numero da conta:");
            contaTerminal.numero = scanner.nextInt();
            System.out.println("Digite seu Saldo:");
            contaTerminal.saldo = scanner.nextDouble();
        }
        System.out.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",contaTerminal.nomeCliente,contaTerminal.agencia,contaTerminal.numero,contaTerminal.saldo);

    }
}
