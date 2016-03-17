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
public abstract class Planeta {
    //Atributos
    protected boolean agua;
    protected String sistemaSolar;
    protected int numeroDeLunas;
    protected int masa;
    
    //Metodos
    public Planeta(boolean agua, String sistemaSolar, int numeroDeLunas, int masa) {
        this.agua = agua;
        this.sistemaSolar = sistemaSolar;
        this.numeroDeLunas = numeroDeLunas;
        this.masa = masa;
    }
    
    public void setAgua(boolean agua) {
        
    }
    
    public void setSistemaSolar(String sistemaSolar) {
        
    }
    
    public void setNumeroDeLunas(int numeroDeLunas) {
        
    }
    
    public void setMasa(int masa) {
        
    }
    
    public boolean getAgua() {
        return this.agua;
    }
    
    public String getSistemaSolar() {
        return this.sistemaSolar;
    }
    
    public int getNumeroDeLunas() {
        return this.numeroDeLunas;
    }
    
    public int getMasa() {
        return this.masa;
    }
    
}
