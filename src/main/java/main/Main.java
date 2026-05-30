/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import modelo.Usuario;
import vista.Logg;
import controlador.Logg_Ctrl; //ssssss.

/**
 *
 * @author Maizal
 */
public class Main {
    
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("admin", "1234");
        
       
        Logg vista = new Logg();
        
        
        Logg_Ctrl controller = new Logg_Ctrl(usuario, vista);
        
        
        controller.iniciar();
    }
    
}
