/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capicuasypalindromos;

import java.util.Scanner;

/**
 *
 * @author obed
 */
public class Capicuasypalindromos {

    private String Palabra; // Palabra introducida
    private String arbalaP; // Palabra al revés xD
    private pila PILA;
    
    public Capicuasypalindromos(){
        this.Palabra = "";
        this.arbalaP = "";
        this.PILA = new pila();
    }
    
    // Método que asigna la palabra
    public void setPalabra(String Palabra){
        this.Palabra = Palabra;
    }
    
    //Método para evaluar la palabra
    public boolean evaluarPalabra(){
        partirPalabra(); //Hay que seccionar las letras de la palabra
        voltearPalabra(); // Ahora se debe voltear...
        return (this.Palabra.equals(this.arbalaP)); // Retorna verdad o falso según sea el caso de que sean o no iguales.
    }
    
    //Método para dividir la palabra por nodos
    public void partirPalabra(){
        this.Palabra = this.Palabra.toUpperCase(); //La palabra que se ingresó la hacemos en mayúsculas.
        for (int i = 0; i < this.Palabra.length(); i++) { //Recorremos la palabra
            char caracter = this.Palabra.charAt(i); //Extraemos el caracter de tal posición según el recorrido
            String letra = String.valueOf(caracter); //Convertimos el caracter en String
            this.PILA.push(new nodo(letra)); //Agregamos un nuevo nodo con su letra a la pila.
        }
        //Hasta aquí ha sido dividida la palabra
    }
    
    public void voltearPalabra(){
        while (!this.PILA.estaVacia()) { //Mientras la pila NO esté vacia...
            nodo saliente = this.PILA.pop(); //Extraemos el nodo tope.
            this.arbalaP += saliente.getLetra(); //Concatenamos las letras conforme vayan saliendo. (saldrán volteadas)
        }
    }
    
    public String getPalabra(){
        return this.Palabra;
    }
    public String getarbalaP(){
        return this.arbalaP;
    }
    
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in); // Entrada de teclado
        Capicuasypalindromos main = new Capicuasypalindromos(); // Objeto de control
        
        System.out.print("Ingrese una palabra a evaluar: ");
        main.setPalabra(entradaTeclado.next()); // Guardamos la palabra
        boolean resultado = main.evaluarPalabra();
        
        if(resultado){ //Si fue cierto el resultado, es decir, si son iguales.
            System.out.println("--- La palabra se lee igual de izquierda a derecha y viceversa ---");
        }else{
            System.err.println("=== La palabra no se lee igual de izquierda a derecha y viceversa ===");
        }
        System.out.println("Palabra izq->der :"+main.getPalabra());
        System.out.println("Palabra der->izq :"+main.getarbalaP());
    }
    
}
