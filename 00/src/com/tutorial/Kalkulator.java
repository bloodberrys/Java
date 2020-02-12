package com.tutorial;
// nama package saya adalah com.tutorial atau jika tanpa package tinggal hapus saja

// import untuk scanner dari utility java
import java.util.Scanner;



public class Kalkulator{
    public static void main(String[] args) {
        

        int hasil, pilihan, angka1, angka2;

        Scanner input = new Scanner(System.in);

        System.out.println("aplikasi Kalkulator Sederhana");
        System.out.println("------------");
        System.out.println("Pilih Operasi:\n");
        System.out.println("1. Penjumlahan\n");
        System.out.println("2. Pengurangan\n");
        System.out.println("3. Perkalian\n");
        System.out.println("4. Pembagian\n");
        pilihan = input.nextInt();

        System.out.println("Masukkan angka pertama: ");
        angka1 = input.nextInt();

        System.out.println("Masukkan angka kedua: ");
        angka2 = input.nextInt();



        // condition
        if (pilihan == 1){
            
        }

    }
}