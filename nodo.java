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
public class nodo {
    
    private String letra; //Atributo que almacenará la letra
    private nodo siguiente; //Apuntador que vinculará el objeto con otro nodo.
    
    public nodo(String letra){
        this.letra = letra; //Al construir un nuevo nodo, le asignamos una letra
        this.siguiente = null; //Al construir el nodo siguiente toma valor de nulo
    }
    
    //Método para asignar un nuevo nodo siguiente.
    public void setSiguiente(nodo siguiente){
        this.siguiente = siguiente;
    }
    
    //Método para rescatar el nodo siguiente.
    public nodo getSiguiente(){
        return this.siguiente;
    }
    
    //Método para rescatar la letra que almacena el nodo
    public String getLetra(){
        return this.letra;
    }
    
    
    
}
