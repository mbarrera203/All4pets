package com.All4pets.All4pets.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mascota {
    
    @Id
    private String id;
    private Imagen imagen;
    private Estado estado;
    private String observacion;
    private Edad edad;
    private Genero genero;
    private Boolean alta;

    public Mascota() {
    }

    public Mascota(Imagen imagen, Estado estado, String observacion, Edad edad, Genero genero, Boolean alta) {
        this.imagen = imagen;
        this.estado = estado;
        this.observacion = observacion;
        this.edad = edad;
        this.genero = genero;
        this.alta = alta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Edad getEdad() {
        return edad;
    }

    public void setEdad(Edad edad) {
        this.edad = edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", imagen=" + imagen + ", estado=" + estado + ", observacion=" + observacion + ", edad=" + edad + ", genero=" + genero + ", alta=" + alta + '}';
    }
    
 

}
