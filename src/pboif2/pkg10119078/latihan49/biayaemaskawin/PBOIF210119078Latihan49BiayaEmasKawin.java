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
public class PBOIF210119078Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EmasKawin emas = new EmasKawin();
        
        emas.setBeratEmas(15.7);
        System.out.println("Berat Emas: " + emas.getBeratEmas());
        System.out.println("Harga per gram: Rp. 570.000 ");
        emas.hargaEmas(emas.getBeratEmas());
    }
    
}
