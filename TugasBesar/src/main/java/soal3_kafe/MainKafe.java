/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3_kafe;

/**
 *
 * @author fdnuser
 */
public class MainKafe {
    public static void main(String[] args) {
        Menu menu1 = new Menu("M01", "Nasi Goreng", 18000, "Makanan");
        int jumlah = 2;
        
        menu1.tampilMenu();
        System.out.println("Jumlah  : " + jumlah);
        System.out.println("Total   : " + menu1.hitungHarga(jumlah));
        System.out.println("------------------------------");
        
        // contoh constructor tanpa parameter (overloading)
        Menu menuKosong = new Menu();
        menuKosong.tampilMenu();
    }
}
