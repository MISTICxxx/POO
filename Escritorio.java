public class Escritorio {
    public static void main(String[] args) {
        Teclado teclado1 = new Teclado("redragon", "branco", 60, true,
                "wireless", "plastico", true);
        Teclado teclado2 = new Teclado("multilaser", "preto", 100, true,
                "fio", "plastico", false);
        Teclado teclado3 = new Teclado("attackshark", "rosa", 93, false,
                "wireless", "aluminio", true);

        teclado3.tipoSwitch = "optico";
        teclado1.tipoSwitch = "blue";
        
        teclado1.ligarLed();
        teclado3.ligarLed();
        System.out.println(teclado1.ledLigado);
        teclado1.desligarLed();
        System.out.println(teclado1.ledLigado);


        System.out.println("\nInformações do teclado1:");
        System.out.println("Marca: " + teclado1.marca +
                           ", Cor: " + teclado1.cor +
                           ", Tamanho: " + teclado1.tamanho +
                           ", Tem LED: " + teclado1.temLed +
                           ", Conexão: " + teclado1.conexao +
                           ", Material: " + teclado1.material +
                           ", Tipo de Switch: " + teclado1.tipoSwitch +
                           ", Mecânico: " + teclado1.mecanico +
                           ", LED Ligado: " + teclado1.ledLigado);

        System.out.println("\nInformações do teclado2:");
        System.out.println("Marca: " + teclado2.marca +
                           ", Cor: " + teclado2.cor +
                           ", Tamanho: " + teclado2.tamanho +
                           ", Tem LED: " + teclado2.temLed +
                           ", Conexão: " + teclado2.conexao +
                           ", Material: " + teclado2.material +
                           ", Tipo de Switch: " + teclado2.tipoSwitch +
                           ", Mecânico: " + teclado2.mecanico +
                           ", LED Ligado: " + teclado2.ledLigado);

        System.out.println("\nInformações do teclado3:");
        System.out.println("Marca: " + teclado3.marca +
                           ", Cor: " + teclado3.cor +
                           ", Tamanho: " + teclado3.tamanho +
                           ", Tem LED: " + teclado3.temLed +
                           ", Conexão: " + teclado3.conexao +
                           ", Material: " + teclado3.material +
                           ", Tipo de Switch: " + teclado3.tipoSwitch +
                           ", Mecânico: " + teclado3.mecanico +
                           ", LED Ligado: " + teclado3.ledLigado);
    }
}
