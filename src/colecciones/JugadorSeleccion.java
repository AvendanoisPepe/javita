/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author Sebastian
 */
public class JugadorSeleccion {
    
    private int dorsal;
    private String nombre;
    private String demarcacion;
    
    public JugadorSeleccion(){
    }

    public JugadorSeleccion(int dorsal, String nombre, String demarcacion) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.demarcacion = demarcacion;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "JugadorSeleccion{" + "dorsal=" + dorsal + ", nombre=" + nombre + ", demarcacion=" + demarcacion + '}';
    }
    
    
}
