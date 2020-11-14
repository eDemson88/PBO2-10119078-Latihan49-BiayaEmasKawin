/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan49.biayaemaskawin;

/**
 *
 * @author ryzen
 */
public class EmasKawin {
    private double beratEmas;
    private final double hargaPerGram = 570000;
    
    public double getBeratEmas(){
        return beratEmas;
    }
    
    public void setBeratEmas(double beratEmas){
        this.beratEmas=beratEmas;
    }
    
    public double hargaEmas(double beratEmas){
        double hargaEmas;
        
        hargaEmas = beratEmas * hargaPerGram;
        System.out.println("Harga maharnya: Rp. " + hargaEmas);
        return hargaEmas;
    }
    
}
