/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal5_tiket;

/**
 *
 * @author fdnuser
 */
public class Tiket {
    private String kodeTiket;
    private String namaFilm;
    private String jenisTiket;
    private double hargaTiket;
    private int jumlahTiket;
    
    public Tiket(String kodeTiket, String namaFilm, String jenisTiket, double hargaTiket, int jumlahTiket) {
        this.kodeTiket = kodeTiket;
        this.namaFilm = namaFilm;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
        this.jumlahTiket = jumlahTiket;
    }
    
    public double hitungTotal() {
        return hargaTiket = jumlahTiket;
    }
    
    public void tampilData() {
        System.out.println("==========================================");
        System.out.println("        DATA PEMESANAN TIKET");
        System.out.println("==========================================");
        System.out.printf("Kode Tiket  : %s%n", kodeTiket);
        System.out.printf("Film        : %s%n", namaFilm);
        System.out.printf("Jenis Tiket : %s%n", jenisTiket);
        System.out.printf("Harga       : %.0f%n", hargaTiket);
        System.out.printf("Jumlah      : %d%n", jumlahTiket);
        System.out.printf("Total       : %.0f%n", hitungTotal());
        System.out.println("------------------------------------------");
    }
}
