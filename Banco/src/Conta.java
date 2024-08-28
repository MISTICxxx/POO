public class Conta {
    private float saldo;

    public Conta() {
        this.saldo = 0;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean sacar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor para saque deve ser positivo.");
            return false;
        }
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente para o saque.");
            return false;
        }
    }

    public boolean depositar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor para depósito deve ser positivo.");
            return false;
        }
        saldo += valor;
        return true;
    }
}
