# ContaBanco

Este é um simples programa Java chamado ContaBanco que solicita algumas informações do usuário, como o número da agência, número da conta e nome do titular da conta, e exibe uma mensagem de boas-vindas com essas informações.

## Funcionalidades

- Solicitação do número da agência.
- Solicitação do número da conta.
- Solicitação do nome do titular da conta.
- Exibição de uma mensagem de boas-vindas com os detalhes da conta.

## Como usar

1. Clone este repositório em sua máquina local.
2. Abra o arquivo `ContaBanco.java` em sua IDE ou editor de código preferido.
3. Compile e execute o programa.

## Detalhes do código

- O programa utiliza a classe `Scanner` para obter entrada do usuário.
- É configurado para usar o padrão de localização dos Estados Unidos para números.
- Após cada solicitação de entrada, há uma pausa para o usuário pressionar Enter antes de prosseguir para a próxima etapa.
- Após solicitar o número da agência, o programa limpa o buffer do Scanner para evitar problemas com a próxima entrada.
- A mensagem de boas-vindas é exibida com os detalhes fornecidos pelo usuário.

### Estrutura do Código

```java
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

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request ou uma issue se encontrar algum problema ou tiver sugestões de melhorias.

