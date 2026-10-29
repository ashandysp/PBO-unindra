package soal2_sepeda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fdnuser
 */
public class Sepeda {
    private String kodeSepeda;
    private String jenisSepeda;
    private int lamaSewa;
    private double hargaPerJam;
    
    public Sepeda(String kodeSepeda, String jenisSepeda, int lamaSewa, double hargaPerJam) {
        this.kodeSepeda = kodeSepeda;
        this.jenisSepeda = jenisSepeda;
        this.lamaSewa = lamaSewa;
        this.hargaPerJam = hargaPerJam;
    }
    
    public double hitungBiaya() {
        return lamaSewa * hargaPerJam;
    }
    
    public void tampilData() {
        System.out.println("Kode Sepeda  : " + kodeSepeda);
        System.out.println("Jenis Sepeda : " + jenisSepeda);
        System.out.println("Lama Sewa    : " + lamaSewa + " jam");
        System.out.println("Harga/Jam    : " + hargaPerJam);
        System.out.println("Total Biaya  : " + hitungBiaya());
        System.out.println("-------------------------");
    }
}
