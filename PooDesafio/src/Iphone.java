import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) throws Exception {
        AparelhoTelefonico celular = new AparelhoTelefonico();
        NavegadorInternet navSafari = new NavegadorInternet();
        ReprodutorMusical iTunes = new ReprodutorMusical();

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Olá eu sou a Siri! Bem ao seu Iphone!");
        iTunes.selecionarMusica("No lie ");
        iTunes.pausar();
        scanner.nextLine();

        System.out.println("Sua mãe esta ti ligando.");
        celular.atender();
        celular.ligar("Pai");
        celular.iniciarCorreioDeVoz();
        scanner.nextLine();

        System.out.println("Safari aberto");
        navSafari.adicionarNovaAba();
        navSafari.exibirPagina("google.com.br");
        navSafari.atualizarPagina();
        scanner.close();


    }
}
