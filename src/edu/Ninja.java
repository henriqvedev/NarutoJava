package edu;

public class Ninja {
    private String nome;
    String aldeia;
    int idade;
    int nivelDeMissao;

    /* Getter - Criar getter para mostrar para o usuário */
    public String getNome (){
        return nome;
    }

    /* Setter - Settar o valor da variavel*/
    public void setNome(String nome){
        this.nome = nome;
    }

    public void ataqueKunai(){
        System.out.println("Kunai lançada!");
    }

    }


