/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.gaji;

/**
 *
 * @author Wa Ode Nanda K.D (2110310)
 */
public class Gaji {

    public static void main(String[] args) {
        employer ref;
        salariedemployer pekerja = new salariedemployer();
        commisionemployer pegawai = new commisionemployer();
        projectplanner atasan = new projectplanner();

        System.out.println("** DAFTAR GAJI KARYAWAN **");
        System.out.println("\n");

        ref = pekerja;
        ref.setNama("Nanda");
        ref.getNama();
        ref.jabatan_3107();
        ref.perhitungangaji();
        System.out.println("\n");

        ref = pegawai;
        ref.setNama("Kharisma");
        ref.getNama();
        ref.jabatan_3107();
        ref.perhitungangaji();
        System.out.println("\n");
        ref = atasan;
        ref.setNama("Dewi");
        ref.getNama();
        ref.jabatan_3107();
        ref.perhitungangaji();
    }
}
