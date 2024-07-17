package org.example;

import java.util.Scanner;

public class Contador {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParametrosInvalidosExceptions {

        int numero1;
        int numero2;

        System.out.println("Digite o primeiro numero: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero (maior do que o primeiro numero): ");
        numero2 = scanner.nextInt();

        if(numero2 < numero1){
            throw new ParametrosInvalidosExceptions(numero1, numero2);
        } else {
            for(int i =  numero1 ; i <= numero2; i++){
                System.out.println(i);
            }
        }
    }
}
