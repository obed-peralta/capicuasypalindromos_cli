/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capicuasypalindromos;

/**
 *
 * @author obed
 */
public class pila {
    
    private nodo tope; // Este es el nodo tope de la pila.
    
    public pila(){
        this.tope = null; //Inicializamos el tope con valor nulo
    }
    
    public void push(nodo nuevo){
        if(this.tope == null){ //Si el tope está vacio...
            this.tope = nuevo; //Entonces el nuevo es el tope...
        }else{ //Si no
            nuevo.setSiguiente(this.tope); //El nuevo nodo, su siguiente será el actual tope
            this.tope = nuevo; // Y después el tope es el nuevo nodo
        }
    }
    
    public nodo pop(){
        nodo saliente = this.tope; //El nodo que saldrá es el tope actual.
        this.tope = saliente.getSiguiente(); //El nuevo tope es el nodo siguiente del nodo saliente
        saliente.setSiguiente(null); //Desvinculamos el nodo siguiente del nodo saliente.
        return saliente; //Retornamos el nodo saliente
    }
    
    //Método para saber si la pila está vacia.
    public boolean estaVacia(){
        return (this.tope == null); // Retorna verdad o falso según la evaluación de esta condición
    }
    
}
