
package main;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        String nome;
        Double peso, alt, res; 
        
        System.out.println("digite seu nome");
        nome = grava.nextLine();
        
        System.out.println("digite seu peso");
        peso = grava.nextDouble();
        
        System.out.println("digite sua altura");
        alt = grava.nextDouble();
        
        res = peso/(alt*alt);
        
        System.out.println(nome + "seu IMC é: " + res);
        
        

    }
    
}
