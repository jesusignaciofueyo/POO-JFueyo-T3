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
public class Marte extends Planeta implements PlanetaMovimiento {
    //Atributos
    private boolean contieneArgon;
    
    //Metodos
    public Marte (boolean agua, String sistemaSolar, int numeroDeLunas, int masa) {
        super(agua, sistemaSolar, numeroDeLunas, masa);
    }
    
    public Marte (boolean agua, String sistemaSolar, int numeroDeLunas, int masa, boolean contieneArgon) {
        super(agua, sistemaSolar, numeroDeLunas, masa);
        this.contieneArgon = contieneArgon;
    }
    
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

    @Override
    public void hacerUnaRevolucionAlSol() {
        System.out.println("El planeta Marte le hizo una revolucion al Sol.");
    }
    
    @Override
    public void hacerUnaRotacion() {
        System.out.println("El planeta Marte hizo una rotación completa.");
    }
    
    public void setContieneArgon(boolean ca) {
        this.contieneArgon = ca;
    }
    
    public boolean getContieneArgon() {
        return this.contieneArgon;
    }
    
}
