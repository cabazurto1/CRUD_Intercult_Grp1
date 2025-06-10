/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;
import javax.json.bind.annotation.JsonbDateFormat;

/**
 *
 * @author ricar
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private String email;
    private String genero;
    private String telefono;
    @JsonbDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX")
    private Date fecha_nacimiento;
    /** 
     * Se serializará en JSON como "yyyy-MM-dd'T'HH:mm:ssXXX", 
     * incluyendo el offset de zona (p.ej. "-05:00") 
     */
    
    // Constructor vacío para JSON-B
    public Persona() {}

    public Persona(String nombre, String apellido, String email, String genero, String telefono, Date fecha_nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

}