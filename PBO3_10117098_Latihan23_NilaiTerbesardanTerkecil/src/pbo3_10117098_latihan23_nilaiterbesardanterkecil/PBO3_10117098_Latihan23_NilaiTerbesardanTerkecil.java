/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan23_nilaiterbesardanterkecil;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Program ini berisi program untuk menentukan nilai 
 *                     terbesar dan terkecil dari nilai-nilai mahasiswa
 *                     yang nilai dan jumlah mahasiswa nya di input oleh user
 */
public class PBO3_10117098_Latihan23_NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String petugas;
        int nMhs; 
        int nBesar;
        int nKecil;
        int nilaiMhs;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("======Program Nilai Terbesar dan Terkecil Nilai "
                + "Mahasiswa======");
        
        System.out.print("Masukkan Nama Petugas : ");
        petugas = scn.next();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nMhs = scn.nextInt();

        nBesar = 0;
        nKecil = 100;

        for (int i = 1; i <= nMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+i+" = ");
            nilaiMhs = scn.nextInt();

            nBesar = ((nBesar<=nilaiMhs)?nilaiMhs:nBesar);
            nKecil = ((nKecil>=nilaiMhs)?nilaiMhs:nKecil);
        }

        System.out.print("\nNilai Terbesar adalah : "+ nBesar);
        System.out.println("\nNilai Terkecil adalah : "+ nKecil);
        System.out.println("");
        System.out.println("Petugas\t : " +petugas);
    }
    
}
