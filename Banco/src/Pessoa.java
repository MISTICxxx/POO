public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private int anoNascimento;
    private float renda;

    public Pessoa(String nome, String cpf, String telefone, int anoNascimento, float renda) {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setAnoNascimento(anoNascimento);
        setRenda(renda);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public float getRenda() {
        return renda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setAnoNascimento(int anoNascimento) {
        int anoAtual = java.time.Year.now().getValue();
        if (anoNascimento <= 1900 || anoNascimento > anoAtual) {
            System.out.println("Ano de nascimento inválido. Deve ser maior que 1900 e não ser um ano futuro.");
            return;
        }
        this.anoNascimento = anoNascimento;
    }

    public void setRenda(float renda) {
        if (renda <= 0) {
            System.out.println("Renda negativa. Digite uma renda mensal válida.");
            return;
        }
        this.renda = renda;
    }
}
