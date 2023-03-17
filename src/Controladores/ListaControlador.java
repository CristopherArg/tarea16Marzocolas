/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.ListaPacientes;
import Modelos.Pasientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;
import pckVistas.frmVista;

/**
 *
 * @author umg
 */
public class ListaControlador {
  public class ListaController implements ActionListener{
    frmVista VistaLista;
    ListaPacientes ModeloListaPacientes;

    public ListaController(frmVista VistaLista, ListaPacientes ModeloListaPacientes) {
        this.VistaLista = VistaLista;
        this.ModeloListaPacientes = ModeloListaPacientes;
        
        //PONER A LA ESCUCHA LOS BOTONES 
        this.VistaLista.btnMedico1.addActionListener(this);
        this.VistaLista.btnListaMedico1.addActionListener(this);
        this.VistaLista.btnMedico2.addActionListener(this);
        this.VistaLista.btnListaMedico2.addActionListener(this);
        
        //LEVANTAR LA VISTA LISTA
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
        
    }
    
  
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==this.VistaLista.btnMedico1){
            this.ModeloListaPacientes.EncolarCliente(this.VistaLista.txtNombre.getText(), 
                    this.VistaLista.txtApellido.getText(),this.VistaLista.txtEdad.getText());
            
            //TRAE LA LISTA CLIENTES DESDE EL MODELO
            Queue <Pasientes> listaLocal = this.ModeloListaPacientes.ListarClientes();
            
            //RECORRE LA LISTA Y ASIGNA EL TEXT AREA 
            String Cadena = "";
            for(Pasientes MiListaClientes: listaLocal){
                Cadena = Cadena + MiListaClientes.getApellidos()+" "+MiListaClientes.getNombre()+"\n";
                this.VistaLista.btnListaMedico1.setText(Cadena);
            }
            
          
           
        }
        
    }
}  
}
