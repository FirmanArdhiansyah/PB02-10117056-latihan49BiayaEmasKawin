/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Firman
 */
public class Main {

    public static void main(String[] args) {
        EmasKawin em = new EmasKawin(15.7, 570000);
        System.out.println("Harga 1 gram per Oktober : Rp." + em.getHargaPerGram());
        System.out.println("Berat emas : " + em.getBerat() + " gram");
        System.out.println("\nTotal Biaya : Rp." + em.hitungBiaya());
        System.out.println("(" + em.terbilang(em.hitungBiaya()) + "rupiah )");
    }

}
