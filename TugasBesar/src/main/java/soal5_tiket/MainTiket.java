package soal5_tiket;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fdnuser
 */
public class MainTiket {
  public static void main(String[] args) {
      ArrayList<Tiket> daftarTiket = new ArrayList<>();
      
      daftarTiket.add(new Tiket("T01", "Avengers", "Reguler", 50000, 2));
      daftarTiket.add(new Tiket("T02", "Interstellar", "VIP", 75000, 2));
      
      for (Tiket t : daftarTiket) {
          t.tampilData();
      }
  }  
}
