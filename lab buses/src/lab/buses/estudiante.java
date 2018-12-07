/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.buses;

/**
 *
 * @author david
 */
public class estudiante {
    private String nombre;
    private int edad;
    private int numcuenta;
    private parada parada;

    public estudiante() {
    }

    public estudiante(String nombre, int edad, int numcuenta, parada parada) {
        this.nombre = nombre;
        this.edad = edad;
        this.numcuenta = numcuenta;
        this.parada = parada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public parada getParada() {
        return parada;
    }

    public void setParada(parada parada) {
        this.parada = parada;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
