import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LojaVp loja = new LojaVp(3000.0);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Comprar Skin");
            System.out.println("2. Adicionar Valorant Points");
            System.out.println("3. Mostrar tempo para atualização da loja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Skins disponíveis na loja:");
                    List<Skin> skinsDaLoja = loja.getSkinsDaLoja();
                    for (int i = 0; i < skinsDaLoja.size(); i++) {
                        Skin skin = skinsDaLoja.get(i);
                        System.out.printf("%d. %s - %s: %.2f VP\n", 
                                          i + 1, 
                                          skin.getArma(), 
                                          skin.getNome(), 
                                          skin.getPreco());
                    }
                    System.out.print("Escolha a skin que deseja comprar (número): ");
                    int escolhaSkin = scanner.nextInt() - 1;
                    if (escolhaSkin >= 0 && escolhaSkin < skinsDaLoja.size()) {
                        loja.comprarSkin(skinsDaLoja.get(escolhaSkin));
                    } else {
                        System.out.println("Escolha inválida.");
                    }
                    break;

                case 2:
                    System.out.print("Digite a quantidade de VP a adicionar: ");
                    double vpParaAdicionar = scanner.nextDouble();
                    loja.adicionarValorantPoints(vpParaAdicionar);
                    break;

                case 3:
                    System.out.println(loja.tempoParaAtualizacao());
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
