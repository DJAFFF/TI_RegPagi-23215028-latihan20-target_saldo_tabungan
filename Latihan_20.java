/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg5;

/**
 *
 * @author USER
 */
public class Latihan_20 {
    
    public static void main(String[] args) {
        double saldoAwal = 3500000;
        double bungaPerBulan = 0.08;
        double saldoTarget = 6000000;

        System.out.println("Input:");
        System.out.println("Perhitungan lama tabungan sampai mencapai saldo target.");
        System.out.println("Saldo Awal: Rp. " + saldoAwal);
        System.out.println("Bunga/Bulan(%): " + (bungaPerBulan * 100));
        System.out.println("Saldo target: Rp. " + saldoTarget);

        System.out.println("\nOutput:");
        int bulan = 1;
        double saldoBulan = saldoAwal;
        while (saldoBulan < saldoTarget) {
            saldoBulan = hitungSaldoBulan(saldoBulan, bungaPerBulan);
            System.out.println("Saldo di bulan ke-" + bulan + " Rp. " + saldoBulan);
            bulan++;
        }
        System.out.println("BUILD SUCCESSFUL (total time: 0 seconds)");
    }

    public static double hitungSaldoBulan(double saldoAwal, double bungaPerBulan) {
        double saldoAkhir = saldoAwal * (1 + bungaPerBulan);
        return saldoAkhir;
    }
}

