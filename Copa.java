import java.util.Scanner;

public class Copa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Garrafa garrafa1 = new Garrafa("tupperware", "azul", 1.5f, true);
        Garrafa garrafa2 = new Garrafa("crystal", "verde", 0.75f, false);

        System.out.println("Escolha uma ação para a garrafa 1:");
        System.out.println("1 - Abrir tampa");
        System.out.println("2 - Fechar tampa");
        System.out.println("3 - Encher");
        System.out.println("4 - Esvaziar");

        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                garrafa1.abrirTampa();
                break;
            case 2:
                garrafa1.fecharTampa();
                break;
            case 3:
                garrafa1.encher();
                break;
            case 4:
                garrafa1.esvaziar();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        System.out.println("Informações da garrafa 1:");
        System.out.println("Marca: " + garrafa1.marca);
        System.out.println("Cor: " + garrafa1.cor);
        System.out.println("Capacidade: " + garrafa1.capacidade + " litros");
        System.out.println("Está cheia: " + (garrafa1.estaCheia ? "Sim" : "Não"));
        System.out.println("Tampa aberta: " + (garrafa1.tampaAberta ? "Sim" : "Não"));

        System.out.println("Informações da garrafa 2:");
        System.out.println("Marca: " + garrafa2.marca);
        System.out.println("Cor: " + garrafa2.cor);
        System.out.println("Capacidade: " + garrafa2.capacidade + " litros");
        System.out.println("Está cheia: " + (garrafa2.estaCheia ? "Sim" : "Não"));
        System.out.println("Tampa aberta: " + (garrafa2.tampaAberta ? "Sim" : "Não"));

        sc.close();
    }
}
