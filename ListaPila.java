/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listapila;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ListaPila {
    public static void main(String[] args) {
        int menu=0,node=0;
        Pila stack=new Pila();        
        do{
            try{
                menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "                UNIVERSIDAD DE CARTAGENA\n" 
                        + "    Ingeniería de Software - III Semestre CTM\n"
                        + "                       Estructura de Datos\n"
                        + "                        Team UDC Society\n\n"
                        + "MENÚ\n\n"
                        + "1. Insertar Nodo\n"
                        + "2. Eliminar un Nodo\n"
                        + "3. ¿La Pila está vacía?\n"
                        + "4. ¿Cuál es el último nodo ingresado en la pila?\n"
                        + "5. ¿Cuántos nodos tiene la pila?\n"
                        + "6. Vaciar la pila.\n"
                        + "7. Mostrar contenido de la pila.\n"
                        + "8. Salir\n","Actividad Unidad I PILAS",JOptionPane.PLAIN_MESSAGE));
                switch(menu){
                    case 1:
                        node = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor a guardar en el nodo"));
                        stack.InsertNode(node);
                        break;
                    case 2:
                        if(!stack.StackEmpty()){
                            JOptionPane.showMessageDialog(null, "eliminado el nodo con valor :" + stack.DeleteNode());
                        }else{
                            JOptionPane.showMessageDialog(null, "El stack está vacío");
                        }
                        break;
                    case 3:
                        if(stack.StackEmpty()){
                            JOptionPane.showMessageDialog(null, "La pila está vacía.");
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila no está vacía.");
                        }
                        break;
                    case 4:
                        if(!stack.StackEmpty()){
                            JOptionPane.showMessageDialog(null, "El último valor ingresado en la pila(stack) es:  " + stack.ShowLastNodeEntered());
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila (stack) está vacía");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila ( stack)contiene  " + stack.StackSize() + " nodes");
                        break;
                    case 6:
                        if(!stack.StackEmpty()){
                            stack.EmptyStack();
                            JOptionPane.showMessageDialog(null, "La pila (stack se ha vaciado.");
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila (stack) se encuentra vacía.");
                        }
                        break;
                    case 7:
                        stack.ShowValue();
                        break;
                    case 8:
                        menu = 8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Has ingresado una opción incorrecta, por favor intenta de nuevo.");
                        break;                        
                }
             } catch (NumberFormatException e) {

            }
        } while (menu != 8);
    }
}
