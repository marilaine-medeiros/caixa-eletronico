import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Boas vindas ao caixa eletrônico!");

        Scanner leitor = new Scanner(System.in);

        // Solicita o nome e o valor do saque
        System.out.println("Digite o nome do titular da conta: ");
        String nome = leitor.nextLine();

        System.out.println("Digite o valor do saque: ");
        double valor = leitor.nextDouble();

        // Correção do código, eu não havia deixado o valor fixo
        double saldo = 539.32;



        // Regras do saque

        if (valor > 1000) {
            System.out.println(" Olá " +nome + "! O saque de " +valor + " não pode ser realizado: valor máximo para saque é de R$1.000,00");
        }

        if (valor < 10) {
            System.out.println(" Olá " +nome + "! O saque de " +valor + " não pode ser realizado: valor mínimo para saque é de R$10,00");
        }

        // resto da divisão diferente de zero
        if (valor % 10 != 0) {
            System.out.println(" Olá " +nome + "! O saque de " +valor + " não pode ser realizado: cédulas disponíveis 10, 20, 50 e 100");
        }

        if (valor > saldo) {
            System.out.println(" Olá " +nome + "! O saque de " +valor + " não pode ser realizado: saldo insuficiente");
        }

        System.out.println(" Olá " +nome + "! O saque de " +valor + " foi realizado com sucesso!");




/*
        if (valor < 10) {
            System.out.println("Olá!" +nome + "O saque de " +valor + "não pode ser realizado: valor abaixo do minimo permitido (10).");
        } else if (valor > 1000) {
            System.out.println("Olá!" +nome + "O saque de " +valor + "não pode ser realizado: valor acima do máximo permitido (1000).");
        } else if (valor > saldo) {
            System.out.println("Olá!" + nome + " O saque de " + valor + " não pôde ser realizado: Saldo insuficiente.");
        } else if (!valorValido((int) valor)) {
            System.out.println("Olá " + nome + "! O saque de " + valor + " não pode ser realizado: O valor deve ser múltiplo de 10, 20, 50 ou 100.");
        } else {
            System.out.println("Olá " + nome + "! O saque de " + valor + " foi realizado com sucesso!");
        }


            leitor.close();
    }

    private static boolean valorValido(int valor) {
        boolean multiploDe100 = (valor % 100 == 0);
        boolean multiploDe50 = (valor % 50 == 0);
        boolean multiploDe20 = (valor % 20 == 0);
        boolean multiploDe10 = (valor % 10 == 0);

        if (multiploDe100 || multiploDe50 || multiploDe20 || multiploDe10) {
            return true;
        } else {
            return false;
        }*/
    }


}
