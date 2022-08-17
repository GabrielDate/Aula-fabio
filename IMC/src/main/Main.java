
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
        
        
        if(res <=18.5){
            System.out.println("Você esta abaixo do peso.");
                   
        }else if (res >= 18.5 && res <=24.9){
         System.out.println("Você esta com o Peso normal.");
        
        }else if (res >=25.0 && res <=29.9){
            System.out.println("Você esta com Sobrepeso.");
        
        
        }else if (res >=30.0 && res <=34.9){
            System.out.println("Você esta com Obesidade leve.");
        
        
        }else if (res >=35.0 && res <=39.9){
            System.out.println("Você esta com Obesidade Moderada.");
        
        
        }else {
            System.out.println("Você esta com Obesidade móbida");
        
        
        }
        
        

    }
    
}
