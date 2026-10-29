package soal1_buku;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fdnuser
 */
public class MainBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku("B01", "Mein Kampf", "Adolf Hitler", 99999);
        Buku buku2 = new Buku("B02", "Petualangan Doraemon", "Fujiko F. Fujio", 89500);
        
        buku1.tampilData();
        buku2.tampilData();
    }
}
