/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gaji;

/**
 *
 * @author Wa Ode Nanda K.D (2110310)
 */
public class projectplanner extends employer {

    double uangmakan_3107;
    double tunjangankinerja;
    double tunjanganjabatan;

    public projectplanner() {
        jabatan_3107 = "project planner";
        uangmakan_3107 = 500000.0;
        tunjangankinerja = 500000.0;
        tunjanganjabatan = 1000000.0;
    }

    public double perhitungangaji() {
        double potongan;
        gajikotor_3107 = gajipokok_3107 + uangmakan_3107 + tunjangankinerja + tunjanganjabatan;
        potongan = (15.0 / 100.0) * gajikotor_3107;
        gajibersih_3107 = gajikotor_3107 - potongan;

        System.out.println("Gaji Pokok : " + gajipokok_3107);
        System.out.println("Uang Makan : " + uangmakan_3107);
        System.out.println("Tunjangan Kinerja : " + tunjangankinerja);
        System.out.println("Tunjangan Jabatan : " + tunjanganjabatan);
        System.out.println("Gaji Kotor : " + gajikotor_3107);
        System.out.println("Potongan : " + potongan);
        System.out.println("Gaji Bersih : " + gajibersih_3107);

        return gajibersih_3107;
    }
}
