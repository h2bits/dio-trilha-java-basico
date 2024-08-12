import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Agência:");
        String agencia = scanner.next();

        System.out.println("Conta");
        int conta = scanner.nextInt();

        System.out.println("Saldo inicial");
        double saldoInicial = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + Integer.toString(conta) + ".");
        System.out.println("Seu saldo de " + String.format("%.2f", Double.valueOf(saldoInicial))
            + " já está disponível para saque.");
    }
}
