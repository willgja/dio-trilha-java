import java.util.Scanner;

public class SimularConta {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0;
        double valor = 0;
        int opcao = 0;
        boolean statusPrograma = true;

        
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (statusPrograma) { 
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    valor = scanner.nextDouble();
                    saldo = saldo + valor;
                    System.out.printf("Saldo atual: %.1f \n", saldo);
                    break;

                case 2:
                    valor = scanner.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Saldo insuficiente.");
                        break;
                    }
                    saldo = saldo - valor;
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;

                case 3:
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;

                case 4:
                System.out.println("Programa encerrado.");
                    statusPrograma = false;
                    break;
            
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
    
        }
    }

}
