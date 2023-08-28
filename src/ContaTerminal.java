import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== MENU ===");
                System.out.println("1. Acessar Conta");
                    System.out.println("2. Sair");
            System.out.print("Escolha uma opcao: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Digite seu nome");
            String nomeCliente = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenomeCliente = scanner.next();

        System.out.println("Digite sua agência");
        String agencia = scanner.next();

        System.out.println("Digite sua conta");
        int numero = scanner.nextInt();

        double saldo = 500;

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + " obrigado por criar uma conta em nosso banco,");
        System.out.println("Sua agência é " + agencia + ", conta " + numero);
        System.out.println("E seu saldo de " + saldo + " já está disponivel para saque.");
        break;

        } else if (opcao == 2) {
            break;
        } else {
            System.out.println("Opcão não encontrada");
        }
    }
}
}