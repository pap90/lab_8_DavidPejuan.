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
public class parada {
    private double distancia;
    private double rad;
    private double coorx;
    private double coory;

    public parada() {
    }

    public parada(double distancia, double rad, double coorx, double coory) {
        this.distancia = distancia;
        this.rad = rad;
        this.coorx = coorx;
        this.coory = coory;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public double getCoorx() {
        return coorx;
    }

    public void setCoorx(double coorx) {
        this.coorx = coorx;
    }

    public double getCoory() {
        return coory;
    }

    public void setCoory(double coory) {
        this.coory = coory;
    }
    
}
