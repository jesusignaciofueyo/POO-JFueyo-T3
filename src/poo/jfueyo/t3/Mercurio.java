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
public class Mercurio extends Planeta implements PlanetaMovimiento {
    //Atributos
    private boolean contieneKrypton;
    private boolean contieneHidroxido;
    
    //Metodos
    public Mercurio (boolean agua, String sistemaSolar, int numeroDeLunas, int masa) {
       super(agua, sistemaSolar, numeroDeLunas, masa);
    }
    
    public Mercurio (boolean agua, String sistemaSolar, int numeroDeLunas, int masa, boolean contieneKrypton, boolean contieneHidroxido) {
       super(agua, sistemaSolar, numeroDeLunas, masa);
       this.contieneKrypton = contieneKrypton;
       this.contieneHidroxido = contieneHidroxido;
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
        System.out.println("El planeta Mercurio le hizo una revolucion al Sol.");
    }
    
    @Override
    public void hacerUnaRotacion() {
        System.out.println("El planeta Mercurio hizo una rotación completa.");
    }
    
    public void setContieneKrypton(boolean ck) {
        this.contieneKrypton = ck;
    }
    
     public void setContieneHydroxido(boolean ch) {
        this.contieneHidroxido= ch;
    }
     
    public boolean getContieneKrypton() {
        return this.contieneKrypton;
    }
    
    public boolean getContieneHidroxido() {
        return this.contieneHidroxido;
    }
    
}
