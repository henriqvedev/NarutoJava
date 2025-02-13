package edu;

public class Main {
    public static void main(String[]args) {

        //obj 1
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.temBijuu = true;
        naruto.ataqueKunai();


        //obj 2
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.ataqueKunai();
        sasuke.ataqueKunai(3);

    }
    }
