import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

import Class.Conta;

public class App {
    private static boolean run = true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        while(run) {
                System.out.println("Digite o nome do cliente: ");
                String nomeCliente = scanner.nextLine();

                System.out.println("Digite o número da conta: ");
                int numeroConta = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite o número da agência: ");
                String agencia = scanner.nextLine();

                System.out.println("Digite o saldo: ");
                double saldo = scanner.nextDouble();
                scanner.nextLine();

                Conta conta = new Conta(nomeCliente, numeroConta, agencia, saldo);
                System.out.println(conta.ApresentarDados());
                run = false;
        }
        scanner.close();
    }
}
