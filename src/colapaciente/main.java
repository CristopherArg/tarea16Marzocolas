/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colapaciente;

import Controladores.ListaControlador;
import Modelos.ListaPacientes;
import pckVistas.frmVista;

/**
 *
 * @author umg
 */
public class main {

    /**
     * @param args the command line arguments
     */
  
        public static void main(String[] args) {
        // TODO code application logic here
        frmVista VistaListas = new frmVista(null, true);
        ListaPacientes ModeloLista = new ListaPacientes();
        ListaControlador ControladorLista = new ListaControlador(VistaListas, ModeloListaPacientes);
    }
    
}
