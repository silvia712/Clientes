/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Silvia
 */
public class Cliente {
    
    private String nombre;
    private String apel1;
    private String apel2;
    private String estado;
    private String sexo;
    private int edad;

    public Cliente(String nombre, String apel1, String apel2, String estado, String sexo, int edad) {
        this.nombre = nombre;
        this.apel1 = apel1;
        this.apel2 = apel2;
        this.estado = estado;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApel1() {
        return apel1;
    }

    public String getApel2() {
        return apel2;
    }

    public String getEstado() {
        return estado;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApel1(String apel1) {
        this.apel1 = apel1;
    }

    public void setApel2(String apel2) {
        this.apel2 = apel2;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apel1=" + apel1 + ", apel2=" + apel2 + ", estado=" + estado + ", sexo=" + sexo + ", edad=" + edad + '}';
    }
    
    
    
    
    
}
