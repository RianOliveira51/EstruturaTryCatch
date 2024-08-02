package com.example.estruturatrycatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class EstruturaTryCatchApplication {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        //criando estrutura de tratamento de exceção
       try {
           //sprit ("") - separar por espaço em branco
           //criando vetor
           String[] vect = sc.nextLine().split("");
           //criando variavel para buscar uma posição especifica no vetor.
           int position = sc.nextInt();
           //imprimindo a posicação indicada do vetor
           System.out.println(vect[position]);
       }
       /* o nome da execeção é mostrado ao executar o codigo, na primeira linha, apos o java.util
       * exemplo dessa execeção:
       * Exeption in thread  "main" java.util.ArrayIndexOutOfBoundsException*/
       catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Invalid position");
       }catch (InputMismatchException e){
           System.out.println("Input error");
       }
        System.out.println("End of program");
       sc.close();
    }

}