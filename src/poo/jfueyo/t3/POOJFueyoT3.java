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
public class POOJFueyoT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tierra tierra = new Tierra(true, "Solar", 1, 640);
        Mercurio mercurio = new Mercurio(false, "Solar", 0, 27);
        Marte marte = new Marte(true, "Solar", 2, 58);
        Kepler452b kepler452b = new Kepler452b(false, "Kepler-452", 0, 1037);
        Kepler438b kepler438b = new Kepler438b(false, "Kepler-438", 0, 540);

        tierra.setAgua(true);

        mercurio.setAgua(false);

        marte.setAgua(false);

        kepler452b.setAgua(false);

        kepler438b.setAgua(false);

        
        if (tierra.getAgua()) {
            System.out.println("El planeta Tierra contiene agua.");
        } else {
            System.out.println("El planeta Tierra no contiene agua.");
        }

        System.out.println("La masa de la Tierra es de " + tierra.getMasa() + ".");

        System.out.println("El numero de lunas del planeta Tierra es " + tierra.getNumeroDeLunas() + ".");

        System.out.println("El sistema solar en el que se encuentra el planeta Tierra es " + tierra.getSistemaSolar() + ".");

        tierra.hacerUnaRevolucionAlSol();

        tierra.hacerUnaRotacion();
        
        tierra.setNumeroDeHumanos(7000);
        
        tierra.setNumeroDeEstacionesDelAño(4);
        
        System.out.println("El numero de humanos que habitan al planeta Tierra es de " + tierra.getNumeroDeHumanos() + " millones.");
        
        System.out.println("El numero de estaciones del año en el planeta Tierra es " + tierra.getNumeroDeEstacionesDelAño() + ".");
        
        System.out.println("");

        
        if (mercurio.getAgua()) {
            System.out.println("El planeta Mercurio contiene agua.");
        } else {
            System.out.println("El planeta Mercurio no contiene agua.");
        }

        System.out.println("La masa de Mercurio es de " + mercurio.getMasa() + ".");

        System.out.println("El numero de lunas del planeta Mercurio es " + mercurio.getNumeroDeLunas() + ".");

        System.out.println("El sistema solar en el que se encuentra el planeta Mercurio es " + mercurio.getSistemaSolar() + ".");

        mercurio.hacerUnaRevolucionAlSol();

        mercurio.hacerUnaRotacion();
        
        mercurio.setContieneHydroxido(true);
        
        mercurio.setContieneKrypton(true);
        
        if (mercurio.getContieneHidroxido()) {
            System.out.println("El planeta Mercurio contiene hidroxido.");
        }
        
        if (mercurio.getContieneKrypton()) {
            System.out.println("El planeta Mercurio contiene Krypton.");
        }
        
        System.out.println("");

        
        if (marte.getAgua()) {
            System.out.println("El planeta Marte contiene agua.");
        } else {
            System.out.println("El planeta Marte no contiene agua.");
        }

        System.out.println("La masa de Marte es de " + marte.getMasa() + ".");

        System.out.println("El numero de lunas del planeta Marte es " + marte.getNumeroDeLunas() + ".");

        System.out.println("El sistema solar en el que se encuentra el planeta Marte es " + marte.getSistemaSolar() + ".");

        marte.hacerUnaRevolucionAlSol();

        marte.hacerUnaRotacion();
        
        marte.setContieneArgon(true);
        
        if (marte.getContieneArgon()) {
            System.out.println("El planeta Marte contiene Argon.");
        }

        System.out.println("");
        
        
        if (kepler452b.getAgua()) {
            System.out.println("El planeta Kepler-452b contiene agua.");
        } else {
            System.out.println("El planeta Kepler-452b no contiene agua.");
        }

        System.out.println("La masa de Kepler-452b es de " + kepler452b.getMasa() + ".");

        System.out.println("El numero de lunas del planeta Kepler-452b es " + kepler452b.getNumeroDeLunas() + ".");

        System.out.println("El sistema solar en el que se encuentra el planeta Kepler-452b es " + kepler452b.getSistemaSolar() + ".");

        kepler452b.setSeEncuentraEnCygnus(true);
        
        if (kepler452b.getSeEncuentraEnCygnus()) {
            System.out.println("El planeta Kepler-452b se encuentra en la constelación Cygnus.");
        }
        
        System.out.println("");
        
        
        if (kepler438b.getAgua()) {
            System.out.println("El planeta Kepler-438b contiene agua.");
        } else {
            System.out.println("El planeta Kepler-438b no contiene agua.");
        }

        System.out.println("La masa de Kepler-438b es de " + kepler438b.getMasa() + ".");

        System.out.println("El numero de lunas del planeta Kepler-438b es " + kepler438b.getNumeroDeLunas() + ".");

        System.out.println("El sistema solar en el que se encuentra el planeta Kepler-438b es " + kepler438b.getSistemaSolar() + ".");

        kepler438b.setSeEncuentraEnLyra(true);
        
        if (kepler438b.getSeEncuentraEnLyra()) {
            System.out.println("El planeta Kepler-438b se encuentra en la constelación Lyra.");
        }
        
        System.out.println("");
    }
}
