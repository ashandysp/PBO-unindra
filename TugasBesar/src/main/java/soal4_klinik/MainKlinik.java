/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal4_klinik;
import java.util.ArrayList;

/**
 *
 * @author fdnuser
 */
public class MainKlinik {
    public static void main(String[] args) {
        ArrayList<Pemeriksaan> daftarPemeriksaan = new ArrayList<>();
        
        daftarPemeriksaan.add(new Pemeriksaan("P01", "Wowo", "Dr. Angga", 1500000));
        daftarPemeriksaan.add(new Pemeriksaan("P02", "Fufu", "Dr. Marcel", 2750000));
        daftarPemeriksaan.add(new Pemeriksaan("P03", "Fafa", "Dr. Natan", 3390000));
        
        for (Pemeriksaan p : daftarPemeriksaan) {
            p.tampilData();
        }
    }

}
