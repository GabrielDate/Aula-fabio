
package main;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
       
        Scanner grava = new Scanner(System.in);
        
        
        String nome;
        
        int ida ,dia, bi, res ;
        double horas = 24;
        int ano = 365;
        
        
        System.out.println("Digite o seu nome ");
        nome = grava.nextLine();
        
        System.out.println("Digite a sua idade");
        ida = grava.nextInt();
        
        bi = ida/4;
        res = (ano + bi)*ida;
        System.out.println(nome + " " + "você esta vivo á : " + res + "dias" );
        
        
        System.out.println(nome + " " + "você esta vivo á : " + res*horas + "horas" );
        
        
     
        
        
        
    }
    
}
