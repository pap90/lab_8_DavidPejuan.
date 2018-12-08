/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.buses;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JProgressBar;
import javax.swing.JTable;

/**
 *
 * @author david
 */
public class administrarbarra extends Thread {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private JTable tabla;
    private buses bus;

    public administrarbarra(JProgressBar barra, JTable tabla, buses bus) {
        this.barra = barra;
        avanzar = true;
        vive = true;
        this.tabla = tabla;
        this.bus = bus;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public buses getBus() {
        return bus;
    }

    public void setBus(buses bus) {
        this.bus = bus;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        parada parada1 = null;
        parada parada2 = null;
        int i2=1;
        
        while (vive) {
            if (parada2 == null) {
                ArrayList<Double> p = new ArrayList();
                for (int i = 0; i < bus.getEstu().size(); i++) {
                    p.add(((estudiante) bus.getEstu().get(i)).getParada().getDistancia());

                }
                Double min = Collections.min(p);
                int posi = 0;
                for (int i = 0; i < p.size(); i++) {
                    if (p.get(i) == min) {
                        posi = i;
                    }
                }
                parada1 = ((estudiante) bus.getEstu().get(posi)).getParada();
                Double t = parada1.getDistancia() / bus.getVelocidad();
                double t2 = Math.round(parada1.getDistancia() / bus.getVelocidad());

                barra.setMaximum((int) t2);
            }else if (barra.getValue()==0) {
                ArrayList<Double> p=new ArrayList();
                for (int i = i2; i < bus.getEstu().size(); i++) {
                    double x=((((estudiante) bus.getEstu().get(i)).getParada().getCoorx()));
                    double y=((((estudiante) bus.getEstu().get(i)).getParada().getCoorx()));
                    
                }
                i2++;
                
            }
                
            

            if (avanzar) {
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == barra.getMaximum()) {
                    parada2 = parada1;
                    parada1 = null;
                    barra.setValue(0);
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}