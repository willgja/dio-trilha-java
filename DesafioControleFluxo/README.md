# Contador

Este é um simples programa Java chamado Contador que solicita dois parâmetros do usuário e imprime uma sequência de números, garantindo que o segundo parâmetro seja maior que o primeiro. Se o segundo parâmetro for menor ou igual ao primeiro, uma exceção personalizada é lançada.

## Funcionalidades

- Solicitação de dois parâmetros inteiros do usuário.
- Validação para garantir que o segundo parâmetro seja maior que o primeiro.
- Impressão de uma sequência de números com base na diferença entre os dois parâmetros.
- Tratamento de exceção personalizada para parâmetros inválidos.

## Como usar

1. Clone este repositório em sua máquina local.
2. Abra o arquivo `Contador.java` em sua IDE ou editor de código preferido.
3. Compile e execute o programa.

## Detalhes do código

### Estrutura do Código

```java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        
        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException();
        }
        
        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
