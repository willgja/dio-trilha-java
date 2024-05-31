import java.util.Scanner;

public class VerificadorConta {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double saque = 0;

        for(int i = 0; i <= limiteDiario; i++){
            saque = scanner.nextDouble();
            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                limiteDiario = 0;
            }else if (saque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                limiteDiario = 0;
            }else{
                limiteDiario = limiteDiario - saque;
                System.out.printf("Saque realizado. Limite restante: %.1f\n", limiteDiario);
                if (saque == 0) {
                    System.out.println("Transacoes encerradas.");
                    limiteDiario = 0;
                }
            }
        }

        scanner.close();
    }
}

        
