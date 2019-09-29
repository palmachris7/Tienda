/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.io.Serializable;
import Modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author palmachris7
 */
public class Proceso_Proveedor implements Serializable {
     private ArrayList<Object> c = new ArrayList<Object>();
    
     public Proceso_Proveedor(){}
    
    public Proceso_Proveedor(ArrayList<Object> b){
        this.c = c;
    }
    
    public void agregarRegistro(Usuario p){
        this.c.add(p);
    }

    public void modificarRegistro(int i, Usuario p){
        this.c.set(i, p);
    }
    
    public void eliminarRegistro(int i){
        this.c.remove(i);
    }
    
    public Usuario obtenerRegistro(int i){
        return (Usuario)c.get(i);
    }
    
    public int cantidadRegistro(){
        return this.c.size();
    }
    
    public int buscaCodigo(String codigo){
        for(int i = 0; i < cantidadRegistro(); i++){
            if(codigo == obtenerRegistro(i).getPassword())return i;
        }
        return -1;
    }
    
    
    
    
}
