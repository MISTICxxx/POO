public class Fogao {
    public String marca;
    public int numeroBocas;
    public String cor;
    public String temForno;
    public String alimentacao;
    public int temperaturaForno = 0;
    public int tempoForno = 0;
    public boolean fornoLigado = false;

    public Fogao (int numeroBocas, String marca, String alimentacao, String temForno, String cor){
        this.numeroBocas = numeroBocas;
        this.marca = marca;
        this.alimentacao = alimentacao;
        this.temForno = temForno;
        this.cor = cor;
    }

    public void ligarForno() {
        if (!fornoLigado){
            fornoLigado = true;
        System.out.println("forno ligado, digite a temperatura do forno:");}

        else {
            System.out.println("o forno ja esta ligado");
        }
    }

    public void defineTemperatura(){
        System.out.println("digite a temperatura do forno:");
        System.out.println("temperatura definida para o forno em "  + temperaturaForno + " graus celsius.");
    }

    public void defineTempo(){
        System.out.println("timer definido para " + tempoForno + "minutos.");
    }
}