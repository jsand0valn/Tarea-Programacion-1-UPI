/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclosycondiciones;

import java.util.Scanner;

public class CiclosyCondiciones {

    public static void main(String[] args) {
       
        menu();//es para mostrar el metodo
      
        //Condicion IF 
        //&& es igual a and
        //ll es un o
        // ! NOT = NEGACION
        // = ASOGMAR
        // == COMPARACION
    }
    
    public static void condicionalif(){
        int num1, num2, num3;
        num1 = 6;
        num2 = 7;
        num3 = 9;
        
        if ((num1 > num2) && (num1 > num3)) { //Si cumple regresa verdadero si no es falso 
            System.out.println(num1 + " es mayor que " + num2);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println(num2 + " es mayor ");
        } else if ((num3 > num1) && (num3 > num2)) {
            System.out.println(num3 + " es mayor ");
        } else if ((num1 == num2) && (num2 == num3)) {
            System.out.println(" Los tres numeros son iguales ");
        }
    }
    
    public static void dividir() {
        int num1, num2, resultado;
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el primer digito:");
        num1 = reader.nextInt();
        System.out.println("Ingrese el segundo digito:");
        num2 = reader.nextInt();
        resultado = num1/num2;
        System.out.println("La division de " + num1 + " entre " + num2 + " = " + resultado);
    }

    public static void multiplicar() {
        int num1, num2, resultado;
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el primer digito:");
        num1 = reader.nextInt();
        System.out.println("Ingrese el segundo digito:");
        num2 = reader.nextInt();
        resultado = num1 * num2;
        System.out.println("La multiplicacion de " + num1 + " por " + num2 + " = " + resultado);
    }

    public static void restar() {
        int num1, num2, resultado;
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el primer digito:");
        num1 = reader.nextInt();
        System.out.println("Ingrese el segundo digito:");
        num2 = reader.nextInt();
        resultado = num1 - num2;
        System.out.println("La resta de " + num1 + " - " + num2 + " = " + resultado);
    }

    public static void Condicioswitch() {
        Scanner leer = new Scanner(System.in);
        byte dia = 0;
        System.out.println("Digite el dia");
        dia = leer.nextByte();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalido");
        }

    }

    public static void sumar() {
        int num1,num2, resultado;
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el primer digito:");	
        num1 = reader.nextInt();
        System.out.println("Ingrese el segundo digito:");
        num2 = reader.nextInt();
        resultado = num1+num2;
        System.out.println("La suma de " + num1 + " + " + num2 + " = " + resultado);
    } 

    public static void ciclodowhile() {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do {

            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Salir");
            System.out.println("Digite una opcion");
            opcion = leer.nextByte();
            
            switch (opcion){
                case 1: sumar();
                break;
                case 2: restar();
                break;
                case 3: System.out.println("Usted salio del programa");
                break;
            }
        } while (opcion != 3);
    }

    public static void menu() {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do {

            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            System.out.println("Digite una opcion");
            opcion = leer.nextByte();
            
            switch (opcion){
                case 1: sumar();
                break;
                case 2: restar();
                break;
                case 3: multiplicar();
                break;
                case 4: dividir();
                break;
                case 5: System.out.println("Usted salio del programa");
                break;
            }
        } while (opcion != 5);
    }
}
 
