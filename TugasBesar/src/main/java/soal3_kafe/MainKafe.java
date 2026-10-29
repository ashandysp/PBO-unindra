/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3_kafe;
import java.util.Scanner;

/**
 *
 * @author fdnuser
 */
public class MainKafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu1 = new Menu("M01", "Nasi Goreng", 18000, "Makanan");
        menu1.tampilMenu();
        
        
        System.out.print("Masukkan jumlah pesanan : ");
        int jumlah = input.nextInt();
        System.out.println("Total   : " + menu1.hitungHarga(jumlah));
        System.out.println("------------------------------");
        input.close();
        
        // contoh constructor tanpa parameter (overloading)
        Menu menuKosong = new Menu();
        menuKosong.tampilMenu();
    }
}
