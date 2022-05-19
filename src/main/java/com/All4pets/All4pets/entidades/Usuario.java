
package com.All4pets.All4pets.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
    
    @Id
    private String id;
    private String  nombreYapellido;
    private int edad;
    @OneToMany
    private List<Mascota> mascota;
    private String mail;
    private String contraseña;
    private String telefono;
    private String direccion;
    private Boolean alta;

    public Usuario() {
    }

    public Usuario(String nombreYapellido, int edad, List<Mascota> mascota, String mail, String contraseña, String telefono, String direccion, Boolean alta) {
        this.nombreYapellido = nombreYapellido;
        this.edad = edad;
        this.mascota = mascota;
        this.mail = mail;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.direccion = direccion;
        this.alta = alta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreYapellido() {
        return nombreYapellido;
    }

    public void setNombreYapellido(String nombreYapellido) {
        this.nombreYapellido = nombreYapellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Mascota> getMascota() {
        return mascota;
    }

    public void setMascota(List<Mascota> mascota) {
        this.mascota = mascota;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombreYapellido=" + nombreYapellido + ", edad=" + edad + ", mascota=" + mascota + ", mail=" + mail + ", contrase\u00f1a=" + contraseña + ", telefono=" + telefono + ", direccion=" + direccion + ", alta=" + alta + '}';
    }
    
    
}
