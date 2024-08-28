import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        Pessoa pessoa = null;
        Conta conta = null;

        System.out.println("O que você deseja fazer?");
        while (true) {
            System.out.println("1. Cadastrar.");
            System.out.println("2. Sacar.");
            System.out.println("3. Depositar.");
            System.out.println("4. Extrato.");
            System.out.println("5. Alterar Informações.");
            System.out.println("6. Sair.");

            System.out.print("Digite a opção: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Digite o seu nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o seu CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Digite o seu telefone: ");
                    String telefone = sc.nextLine();
                    System.out.print("Digite seu ano de nascimento: ");
                    int anoNascimento = sc.nextInt();
                    System.out.print("Digite sua renda mensal: ");
                    float renda = sc.nextFloat();
                    sc.nextLine();

                    pessoa = new Pessoa(nome, cpf, telefone, anoNascimento, renda);
                    conta = new Conta();
                    System.out.println("Cadastro realizado com sucesso!");
                    break;
                case 2:
                    if (conta != null) {
                        System.out.print("Qual valor deseja sacar? R$ ");
                        float valor = sc.nextFloat();
                        sc.nextLine();
                        boolean sucesso = conta.sacar(valor);
                        if (sucesso) {
                            System.out.println("Saque realizado com sucesso! Saldo atual: R$ " + conta.getSaldo());
                        } else {
                            System.out.println("Falha no saque.");
                        }
                    } else {
                        System.out.println("Nenhuma conta cadastrada.");
                    }
                    break;
                case 3:
                    if (conta != null) {
                        System.out.print("Qual valor deseja depositar? R$ ");
                        float valor = sc.nextFloat();
                        sc.nextLine();
                        boolean sucesso = conta.depositar(valor);
                        if (sucesso) {
                            System.out.println("Depósito realizado com sucesso! Saldo atual: R$ " + conta.getSaldo());
                        } else {
                            System.out.println("Falha no depósito.");
                        }
                    } else {
                        System.out.println("Nenhuma conta cadastrada.");
                    }
                    break;
                case 4:
                    if (pessoa != null && conta != null) {
                        System.out.println("Pessoa: " + pessoa);
                        System.out.println("Conta: Saldo atual: R$ " + conta.getSaldo());
                    } else {
                        System.out.println("Nenhuma pessoa ou conta cadastrada.");
                    }
                    break;
                case 5:
                    if (pessoa != null) {
                        System.out.println("O que deseja alterar?");
                        System.out.println("1. Renda mensal");
                        System.out.println("2. Telefone");

                        option = sc.nextInt();
                        sc.nextLine();
                        if (option == 1) {
                            System.out.print("Digite a nova renda: R$ ");
                            pessoa.setRenda(sc.nextFloat());
                            sc.nextLine();
                            System.out.println("Renda alterada com sucesso!");
                        } else if (option == 2) {
                            System.out.print("Digite o novo telefone: ");
                            pessoa.setTelefone(sc.nextLine());
                            System.out.println("Telefone alterado com sucesso!");
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    } else {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    }
                    break;
                case 6:
                    System.out.println("Você saiu!");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
