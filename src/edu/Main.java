package edu;

public class Main {
    public static void main(String[]args) {

        //obj 1
        Uzumaki naruto = new Uzumaki();
        naruto.setNome("Naruto Uzumaki");
        naruto.getNome();
        System.out.println("Meu nome é:" + naruto.getNome());
        naruto.idade = 16;
        naruto.temBijuu = true;
        naruto.ataqueKunai();


        //obj 2
        Uchiha sasuke = new Uchiha();
        sasuke.ataqueKunai();
        sasuke.ataqueKunai(3);

    }
    }
