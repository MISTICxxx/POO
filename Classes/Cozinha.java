import java.util.Scanner;

public class Cozinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fogao fogao1 = new Fogao(4, "eletrolux", "eletrico", "nao", "preto");
        Fogao fogao2 = new Fogao(4, "brastemp", "gas", "sim", "prata");
        Fogao fogao3 = new Fogao(0, "batata", "eletrico", "sim", "rosa");

        System.out.print("Digite a temperatura do forno: ");
        fogao1.temperaturaForno = sc.nextInt();
        System.out.println("A temperatura do seu forno está a " + fogao1.temperaturaForno + " graus Celsius");
        System.out.println(fogao1.marca + " " + fogao1.cor + " " + fogao1.temForno);
        System.out.println(fogao2.marca + " " + fogao2.cor + " " + fogao2.alimentacao + " " + fogao2.temForno);
        System.out.println("a cor do fogao e " + fogao3.cor);

        sc.close();
    }
}
