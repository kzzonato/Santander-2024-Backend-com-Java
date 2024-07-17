package org.example;

public class ParametrosInvalidosExceptions extends Exception{

    private int numero1;
    private int numero2;

    public ParametrosInvalidosExceptions(int numero1, int numero2){
        super();
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "O segundo parâmetro ("+numero2+") deve ser maior que o primeiro ("+numero1+").";
    }
}
