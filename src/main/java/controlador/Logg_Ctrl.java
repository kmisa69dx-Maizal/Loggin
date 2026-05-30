/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Usuario;
import vista.Logg;

/**
 *
 * @author Maizal
 */
public class Logg_Ctrl {
    private Usuario usuario;
    private Logg vista;
    
    public Logg_Ctrl(Usuario usuario, Logg vista) {
        this.usuario = usuario;
        this.vista = vista;
    }
    
    public void iniciar() {
        vista.setVisible(true); 
    }
    
}
