/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listapila;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Pila {
    private Nodo LastNode;
    int size = 0;
    String List = "";
    
    public Pila(){
        LastNode = null;
        size = 0;
    }
    
    //1. Método para ingresar un nodo en el stack
    public void InsertNode(int node){
        Nodo new_node = new Nodo(node);
        new_node.next = LastNode;
        LastNode = new_node;
        size++;
    }
    
    //2. Método para eliminar un node del stack
    public int DeleteNode(){
        int variable = LastNode.information;
        LastNode = LastNode.next;
        size--;
        return variable;
    }
    
    //3. Método para saber si el stack está vacío
    public boolean StackEmpty(){
        return LastNode == null;
    }
    
    //4. Método para saber el último node ingresado en el stack
    public int ShowLastNodeEntered(){
        return LastNode.information;
    }
    
    //5. Método para saber cuantos nodes tiene el stack
    public int StackSize(){
        return size;
    }
    
    //6. Método para vaciar el stack
    public void EmptyStack(){
        while(!StackEmpty()){
            DeleteNode();
        }
    }
    //7. Método para mostrar contenido del stack
    public void ShowValue(){
        Nodo route = LastNode;
        
        while(route != null){
            List += route.information + "\n";
            route = route.next;
        }
        JOptionPane.showMessageDialog(null, List);
        List = "";
    }
    //8. Método para salir
}
