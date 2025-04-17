/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rinatriagustianis2304041.praktikumuts_soal3;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class PraktikumUTS_Soal3 {
    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner inputObjek = new Scanner(System.in);
        System.out.println("Masukan bilangan bulat: ");
        long angka = inputObjek.nextInt();
        
        int hasil = sumDigits(angka);
        System.out.println("Jumlah semua digit: " +hasil);
    }
}
