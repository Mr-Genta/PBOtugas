package inheritance;

import java.util.Scanner;

public class InheritMain {

	public static void main(String[] args) {
        String nama, alamat, nim, hobi;
        int spp, sks, modul;

        // object scanner
        Scanner input = new Scanner(System.in);

        // input data
        System.out.println("--- INPUT DATA MAHASISWA ---");
        System.out.print("Nama: ");
        nama = input.next();
        System.out.print("Alamat: ");
        alamat = input.next();
        System.out.print("NIM: ");
        nim = input.next();
        System.out.print("Hobi: ");
        hobi = input.next();
        System.out.print("Pembayaran SPP: ");
        spp = input.nextInt();
        System.out.print("Jumlah SKS: ");
        sks = input.nextInt();
        System.out.print("Jumlah Modul: ");
        modul = input.nextInt();

        Student mahasiswa = new Student(nama, alamat, nim, hobi);
        
        // menampilkan data
        System.out.println("\n--- DATA MAHASISWA ---");
        mahasiswa.identity();

        // total pembayaran
        System.out.println("Total Pembayaran: "+mahasiswa.hitungPembayaran(spp, sks, modul));
	}

}