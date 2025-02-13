package edu;

public class Uchiha extends Ninja{

    public void sharinganAtivado(){
        System.out.println("Sharingan Nivel 2!");
        System.out.println("Sharingan Ativado!");
    }

    @Override
    public void ataqueKunai(){
        System.out.println("Taquei uma kunai de FOGO!");
    }

    public void ataqueKunai(int nivelChakra){
        if (nivelChakra > 2) {
            System.out.println("Susano ativado");
        } else if (nivelChakra < 1){
            System.out.println("Eu so consegui ativar o sharingan");
        }
        else{
            System.out.println("Eu to sem chakra");
        }
    }
}
