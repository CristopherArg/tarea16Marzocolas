/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class ListaPacientes {
     Queue<Pasientes> ListaPacientes = new LinkedList();
    
    public void EncolarCliente(String ape, String nom, String edd){
        Pasientes nuevoCliente = new Pasientes(ape, nom, edd);
        this.ListaPacientes.add(nuevoCliente);
        JOptionPane.showMessageDialog(null,"Cliente Argregado A LA LISTA");
    }
    
    public Queue ListarClientes(){
        return this.ListaPacientes;
        
    }
    
    public void DesEncolar(){
        this.ListaPacientes.poll();
    }
}

