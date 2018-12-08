/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.buses;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class buses {
    private int id;
    private String placa;
    private String color;
    private double velocidad;
    private ArrayList<estudiante> estu=new ArrayList();

    public buses() {
    }

    public buses(int id, String placa, String color, double velocidad) {
        this.id = id;
        this.placa = placa;
        this.color = color;
        this.velocidad = velocidad;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public ArrayList<estudiante> getEstu() {
        return estu;
    }

    public void setEstu(ArrayList<estudiante> estu) {
        this.estu = estu;
    }

    @Override
    public String toString() {
        return placa;
    }
    
}
