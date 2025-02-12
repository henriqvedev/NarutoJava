package edu;

public class Main {
    public static void main(String[]args) {

        for (int i = 0; i < 10; i ++) {
            mostrarMeuNome("Henrique", 22);
        }
    }

    private static void mostrarMeuNome(String nome, int idade) {
        System.out.println("Meu nome é " + nome + "e minha idade é: " + idade );
    }
}