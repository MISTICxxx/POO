public class Garrafa {
    public String marca;
    public String cor;
    public float capacidade;
    public boolean tampaAberta;
    public boolean estaCheia;

    public Garrafa(String marca, String cor, float capacidade, boolean estaCheia) {
        this.marca = marca;
        this.cor = cor;
        this.capacidade = capacidade;
        this.estaCheia = estaCheia;
        this.tampaAberta = false;
    }

    public void abrirTampa() {
        if (tampaAberta) {
            System.out.println("A tampa já está aberta.");
        } else {
            tampaAberta = true;
            System.out.println("A tampa foi aberta.");
        }
    }

    public void fecharTampa() {
        if (tampaAberta) {
            tampaAberta = false;
            System.out.println("A tampa foi fechada.");
        } else {
            System.out.println("A tampa já está fechada.");
        }
    }

    public void encher() {
        if (estaCheia) {
            System.out.println("A garrafa já está cheia.");
        } else {
            estaCheia = true;
            System.out.println("A garrafa foi cheia.");
        }
    }

    public void esvaziar() {
        if (estaCheia) {
            estaCheia = false;
            System.out.println("A garrafa foi esvaziada.");
        } else {
            System.out.println("A garrafa já está vazia.");
        }
    }
}
