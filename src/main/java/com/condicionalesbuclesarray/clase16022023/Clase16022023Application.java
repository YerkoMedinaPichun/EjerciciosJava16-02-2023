package com.condicionalesbuclesarray.clase16022023;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase16022023Application {


  /*
   * 12. Escriba un programa que imprima en pantalla si un número dado por teclado es positivo, 
negativo o cero.
   * 
   */

  public static String positivoNegativoCero(double numero){

    String respuesta = "";

    if(numero < 0){
      respuesta = "Negativo";
    }else if(numero == 0){
      respuesta = "Cero";
    }else{
      respuesta = "Positivo";
    }

    return respuesta;
  }




  //13. Escriba un programa que lea un número del teclado e imprima en pantalla si es par o impar

  public static String parImpar(double numero){

    String respuesta = "";

    if(numero % 2 == 0.0){
      respuesta = "Par";
    }else{
      respuesta = "Impar";
    }
    return respuesta;
  }


  //14. Escriba un programa que imprima los números del 100 al 1 de dos en dos

  public static void numeros100a1(){
    for(int i = 100; i > 0; i-=2){
      System.out.println(i);
    }
  }



  //15. Escriba un programa que imprima todos los números pares entre 0 y 100.
  public static void numerosPares(){
    for(int i = 1; i < 100; i++){
      if(i % 2 == 0){
        System.out.println(i);
      }
    }
  }


  //16. Escriba un programa que imprima la suma de los 100 primeros números naturales.

  public static int suma100PrimerosNumeros(){
    int suma = 0;

    for(int i = 1; i <= 100; i++){
      suma += i;
    }

    return suma;
  }


  /*
   * Como se escribian en JS
   * const nomArray = []
   * 
   * Array en Java
   * Paso 1: import jva.util.ArrayList;
   * 
   * ArrayList <String> nomArrayString = new ArrayList<String>();
   * ["Yerko","Medina","Pichún"];
   *
   * ArrayList <Integer> nomArrayInt = new ArrayList<Integer>();
   * [ 1, 9, 27 ]
   * 
   * Agregar 
   * nomArrayString.add("algo");
   * 
   * Para obtener el valor que existe en un indice predeterminado
   * 
   * nomArrayString.get(0); (Donde 0 es el indice que yo voy a buscar)
   * 
   * 
   * Para cambiar un dato en especifico según su indice
   * 
   * nomArrayString.set(0, "newString1"); 
   * donde 0 es el índice y "newString1" es la nueva palabra
   * 
   * Para remover o eliminar un dato según su indice
   * nomArrayList.remove(0); Donde 0 es el indice
   * 
   * Para limpiar un ArrayList Completo
   * nomArrayString.clear();
   * 
   * 
   * Para Obtener la cantidad de datos que tiene un ArrayList
   * 
   * nomArrayString.size();
   * 
   */


   /*
    * HashMap con llave/indice (0) y valor ("Hola")
    * 
    * import java.util.HashMap;
    *
    *HashMap <String, Double> nomHashMap = new HashMap<String, Double>();

    Así se vería en consola
    [
      {"Pamela": 4.0},
      {"Fabian": 6.8},
      {"Diego": 6.5}
    ]


    Como ingresamos datos al HashMap
    nomHashMap.put("Danissa", 6.2);
    nomHashMap.put("Camila", 6.3);



    Obtener datos según la llave

    nomHashMap.get("Fabian");
    //Devuelve->6.8



    Remover Datos

    nomHashMap.remove("Pamela");



    Limpiar todos los valors de un HashMap

    nomHashMap.clear();



    Como obtengo el valor total de los datos que tengo en un HashMap

    nomHashMap.size();



    Como iterar un HashMap obteniendo la llave y el valor

    Manda el tipo de dato de la llave
    for(String i: nomHashMap.keySet() ){
      System.out.println("Key: "+ i + " Valor: "+nomHashMap.get(i) )
    }

    

    */

  

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


    //12
    // System.out.print("Ingrese un numero: ");
    // double numero = sc.nextDouble();
    // String respuesta = positivoNegativoCero(numero);
    // sc.close();
    // System.out.println("El numero "+numero+" es "+respuesta);





    //13
    // System.out.print("Ingrese un numero: ");
    // double numero = sc.nextDouble();
    // String respuesta = parImpar(numero);
    // sc.close();
    // System.out.println("El número "+numero+" es "+respuesta);





    //14
    //numeros100a1();


    //15
    //numerosPares();


    //16
    int resultadoSuma = suma100PrimerosNumeros();

    System.out.println("El resultado de la suma de los 100 primeros numeros naturales es "+resultadoSuma);
	}

}
