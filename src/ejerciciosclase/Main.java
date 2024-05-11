/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosclase;

import java.util.Scanner;

/**
 *
 * @author 59397
 */
public class Main {

    public static void main(String[] args) {
        //tipo de datos
        //1.-enterro
        // declaro un valor 
        int numeroUno = 0;//=>publica
        int numeroDos = 0;
        //sobre escrivir un valor
        numeroUno = 8;
        numeroDos = 17;

        //2.-declaro en sero
        //1.- suma 2 numeros
        int resultado = numeroUno + numeroDos;

        //imprimir de tipo cadena salida de informacion
        System.out.println("Lasuma es :");
        
        
        
        //3.-suma 2 numeros ,utilizando entrada
        Scanner es=new Scanner(System.in);
        //trasformar de un objeto cadena a un entero
        System.out.println("ingese numero 1:");
        int num1=Integer.parseInt(es.next());
        //==int num1=(es.nextInt())
        System.out.println("ingrese numero2:");
        int num2=Integer.parseInt(es.next());
        num1=num1 + num2; 
        //num1=num1+num2 =resp=num1+num2
        System.out.println("el resultado es:"+num1);
        
        
        //trasformar de cadena a entero
        //1 cadena =()de caracteres
        String cadena="la suma de 2 numeros enteros es:";
        System.out.println("ingese numero 1:");
        int n1=Integer.parseInt(es.next());
        //==int num1=(es.nextInt())
        System.out.println("ingrese numero2:");
        int n2=Integer.parseInt(es.next());
        int resul=n1+n2;
        //+"" trasformarles cualquer tipo de datos en cadenas
        cadena +=resul+"";
        
    }
}
