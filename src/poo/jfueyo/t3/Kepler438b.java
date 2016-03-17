/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.jfueyo.t3;

/**
 *
 * @author jesus_ignacio_159
 */
public class Kepler438b extends Planeta {
    //Atributos
    private boolean seEncuentraEnLyra;
    
    //Metodos
    public Kepler438b(boolean agua, String sistemaSolar, int numeroDeLunas, int masa) {
        super(agua, sistemaSolar, numeroDeLunas, masa);
    }
    
    public Kepler438b(boolean agua, String sistemaSolar, int numeroDeLunas, int masa, boolean seEncuentraEnLyra) {
        super(agua, sistemaSolar, numeroDeLunas, masa);
        this.seEncuentraEnLyra = seEncuentraEnLyra;
    }
    /*
    public Kepler438b(boolean agua, String sistemaSolar, int numeroDeLunas, int masa, boolean potencialmenteHabitable, double indiceDeSimilitudALaTierra, int distanciaDeLaTierra) {
        super(agua, sistemaSolar, numeroDeLunas, masa, potencialmenteHabitable, indiceDeSimilitudALaTierra, distanciaDeLaTierra);
    }
    */
    
    @Override
    public void setAgua(boolean agua) {
        super.agua = agua;
    }
    
    @Override
    public void setSistemaSolar(String sistemaSolar) {
        super.sistemaSolar = sistemaSolar;
    }
    
    @Override
    public void setNumeroDeLunas(int numeroDeLunas) {
        super.numeroDeLunas = numeroDeLunas;
    }
    
    @Override
    public void setMasa(int masa) {
        super.masa = masa;
    }
    /*
    @Override
    public void setDistanciaDeLaTierra(int dt) {
        super.distanciaDeLaTierra = dt;
    }
    
    @Override
    public void setPontecialmenteHabitable(boolean ph) {
        super.potencialmenteHabitable = ph;
    }
    
    @Override
    public void setIndiceDeSimilitudALaTierra(double ist) {
        super.indiceDeSimilitudALaTierra = ist;
    }
    */
    
    public void setSeEncuentraEnLyra(boolean seEncuentraEnLyra) {
        this.seEncuentraEnLyra = seEncuentraEnLyra;
    }
    
    public boolean getSeEncuentraEnLyra() {
        return this.seEncuentraEnLyra;
    }
    
}
