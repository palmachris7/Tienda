package Modelo;

import java.io.Serializable;

public class Usuario implements Serializable{

	private String username;
	private String password;
        private String nombre;
        private String correo;
        private String telefono;
        private int dni;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
        private byte[] foto;
        
        public Usuario(){}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
              
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
public void setPassword(String password) {
		this.password = password;
	}

    public Usuario(String username, String password, String nombre, String correo, String telefono, int dni, byte[] foto) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.dni = dni;
        this.foto = foto;
    }
   
	
    
	
}
