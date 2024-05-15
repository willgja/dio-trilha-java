import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Configuração do Scanner para utilizar o padrão de localização dos Estados Unidos para números
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Mensagem de boas-vindas e instrução para o usuário prosseguir
        System.out.println("Olá! Bem-vindo(a) à ContaBanco. Pressione ENTER para continuar.");
        scanner.nextLine(); // Aguarda o Enter ser pressionado sem armazenar a entrada

        // Solicitação do número da agência
        System.out.println("Digite o número da sua agência:");
        int agencia = scanner.nextInt();

        // Limpeza do buffer do Scanner para evitar problemas com a próxima entrada
        scanner.nextLine();

        // Solicitação do número da conta
        System.out.println("Digite o número da sua conta:");
        String conta = scanner.nextLine();

        // Solicitação do nome do titular da conta
        System.out.println("Por favor, insira seu nome:");
        String nome = scanner.nextLine();

        // Solicitação de saldo do usuário
        System.out.println("Por favor, insira seu saldo atual:");
        double saldo = scanner.nextDouble();

        // Mensagem de confirmação com os detalhes da conta do usuário
        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta no nosso banco.\n" +
                           "Sua agência é " + agencia + ", conta " + conta + ", e seu saldo é R$" + saldo + ".");

    }
}
