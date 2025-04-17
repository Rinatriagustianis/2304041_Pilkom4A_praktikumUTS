/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rinatriagustianis2304041.praktikumuts;

/**
 *
 * @author user
 */

import java.util.Scanner;
import java.util.Random;

public class PraktikumUTS {
    public static void main(String[] args) {
        
        // Soal Nomor 1
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", 
            "Agustus", "September", "Oktober", "November", "Desember"
        };
        
        Random acak = new Random();
        int nomor = acak.nextInt(12) + 1;
        
        System.out.println("Nomor acak: " +nomor);
        System.out.println("Nama bulan: " +namaBulan[nomor - 1]);
        
        
        // Soal Nomor 2
        Scanner inputObjek = new Scanner(System.in);
        int positif = 0, negatif = 0, total = 0, jml = 0;
        
        System.out.println("Masukan bilangan integer, program akan berhenti jika memasukan niali 0: ");
        int angka = inputObjek.nextInt();
        while (angka != 0) {
            if (angka > 0) {
                positif++;
            } else if (angka < 0) {
                negatif++;
            } 
            total += angka;
            jml++;
            
            angka = inputObjek.nextInt();
        }
        
        double rataRata;
        if (jml > 0) {
            rataRata = (double) total / jml;
        } else {
            rataRata = 0;
        }
        
        System.out.println("Jumlah bilangan positif adalah " +positif);
        System.out.println("Jumlah bilangan negatif adalah " +negatif);
        System.out.println("Nilai total adalah " +total);
        System.out.println("Nilai rata-rata " +rataRata);
    }
}