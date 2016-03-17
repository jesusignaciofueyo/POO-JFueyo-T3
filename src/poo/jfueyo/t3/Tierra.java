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
public class Tierra extends Planeta implements PlanetaMovimiento {
    //Atributos
    private int numeroDeHumanos;
    private int numeroDeEstacionesDelAño;

    //Metodos
    public Tierra(boolean agua, String sistemaSolar, int numeroDeLunas, int masa) {
        super(agua, sistemaSolar, numeroDeLunas, masa);
        this.numeroDeHumanos = 7000;
        this.numeroDeEstacionesDelAño = 4;
    }
    
    public Tierra(boolean agua, String sistemaSolar, int numeroDeLunas, int masa, int numeroDeHumanos, int numeroDeEstacionesDelAño) {
        super(agua, sistemaSolar, numeroDeLunas, masa);
        this.numeroDeHumanos = numeroDeHumanos;
        this.numeroDeEstacionesDelAño = numeroDeEstacionesDelAño;
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
        System.out.println("El planeta Tierra le hizo una revolucion al Sol.");
    }
    
    @Override
    public void hacerUnaRotacion() {
        System.out.println("El planeta Tierra hizo una rotación completa.");
    }
    
    public void setNumeroDeHumanos(int numeroDeHumanos) {
        this.numeroDeHumanos = numeroDeHumanos;
    }
    
    public void setNumeroDeEstacionesDelAño(int numeroDeEstacionesDelAño) {
        this.numeroDeEstacionesDelAño = numeroDeEstacionesDelAño;
    }
    
    public int getNumeroDeHumanos() {
        return this.numeroDeHumanos;
    }
    
    public int getNumeroDeEstacionesDelAño() {
        return this.numeroDeEstacionesDelAño;
    }
}
