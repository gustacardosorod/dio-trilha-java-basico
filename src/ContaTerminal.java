import java.util.Scanner;

// Autor Gustavo Cardoso 
// Data 01/06/2024

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: conhecer e importar a classe scanner

        // Exibir as mensagens para o nosso usuario

        // Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem da conta criada

        // Criação do objeto Scanner para receber dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando e recebendo o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Limpando o buffer do Scanner
        scanner.nextLine();

        // Solicitando e recebendo o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicitando e recebendo o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicitando e recebendo o saldo da conta
        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem de confirmação
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}
