/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author palmachris7
 */
public class Proceso_Usuario  implements Serializable{
    private ArrayList<Object> b = new ArrayList<Object>();
    
     public Proceso_Usuario(){}
    
    public Proceso_Usuario(ArrayList<Object> b){
        this.b = b;
    }
    
    public void agregarRegistro(Usuario p){
        this.b.add(p);
    }

    public void modificarRegistro(int i, Usuario p){
        this.b.set(i, p);
    }
    
    public void eliminarRegistro(int i){
        this.b.remove(i);
    }
    
    public Usuario obtenerRegistro(int i){
        return (Usuario)b.get(i);
    }
    
    public int cantidadRegistro(){
        return this.b.size();
    }
    
    public int buscaCodigo(int codigo){
        for(int i = 0; i < cantidadRegistro(); i++){
            if(codigo == obtenerRegistro(i).getDni())return i;
        }
        return -1;
    }
    
    
    
}
