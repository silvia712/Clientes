/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author daw-B
 */
public class IODatos {
    
    
    public static void encriptar(ArrayList<Cliente> vDatos){
        
        String datos= "clientes.dat";
        File f= new File(datos);
    
            if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex);
            }
            }

            
        try (FileOutputStream fo = new FileOutputStream(f); 
                ObjectOutputStream escribir = new ObjectOutputStream (fo)){
            
                escribir.writeObject(vDatos);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
      public static ArrayList<Cliente> desencriptar(){
        
         ArrayList <Cliente> vDatos = new ArrayList();
        String datos= "clientes.dat";
        File f= new File(datos);
    
         if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex);
            }
            }

            
        try (FileInputStream fi = new FileInputStream(f); 
                ObjectInputStream leer = new ObjectInputStream (fi)){
            
                vDatos = (ArrayList<Cliente>) leer.readObject();
          

        } catch (FileNotFoundException ex) {
            System.out.println("1");           
// Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Fichero creado de 0");
// Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
System.out.println("3");
            // Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vDatos;
      }

}
