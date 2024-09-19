class Skin {
    private String arma;
    private String nome;
    private double preco;

    public Skin(String arma, String nome, double preco) {
        this.arma = arma;
        this.nome = nome;
        this.preco = preco;
    }

    public String getArma() {
        return arma;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Arma: " + arma + ", Skin: " + nome + ", Preço: " + preco + " VP";
    }
}
