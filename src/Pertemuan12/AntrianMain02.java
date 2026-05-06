package Pertemuan12;

import java.util.Scanner;

public class AntrianMain02 {
    public static void main(String[] args) {
        AntrianLinkedList02 antrian = new AntrianLinkedList02();
        Scanner sc = new Scanner(System.in);
 
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║     SISTEM ANTRIAN LAYANAN UNIT KEMAHASISWAAN        ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
 
        boolean running = true;
        while (running) {
            System.out.println("\n─────────────────── MENU ───────────────────");
            System.out.println(" 1. Daftar Antrian (Enqueue)");
            System.out.println(" 2. Panggil Antrian (Dequeue)");
            System.out.println(" 3. Tampilkan Semua Antrian");
            System.out.println(" 4. Cek Status Antrian (Kosong/Penuh)");
            System.out.println(" 5. Lihat Antrian Terdepan");
            System.out.println(" 6. Lihat Antrian Paling Akhir");
            System.out.println(" 7. Jumlah Mahasiswa Mengantre");
            System.out.println(" 8. Kosongkan Antrian");
            System.out.println(" 0. Keluar");
            System.out.print("Pilih menu: ");
 
            String pilihan = sc.nextLine().trim();
 
            switch (pilihan) {
                case "1":
                    if (antrian.isFull()) {
                        System.out.println(">> Antrian penuh! Tidak bisa mendaftar.");
                        break;
                    }
                    System.out.println("\n-- Pendaftaran Antrian --");
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk = Double.parseDouble(sc.nextLine());
                    MahasiswaQueue02 mhs = new MahasiswaQueue02(nim, nama, kelas, ipk);
                    antrian.enqueue(mhs);
                    break;
 
                case "2":
                    System.out.println();
                    antrian.dequeue();
                    break;
 
                case "3":
                    System.out.println();
                    antrian.tampilAntrian();
                    break;
 
                case "4":
                    System.out.println();
                    if (antrian.isEmpty()) {
                        System.out.println(">> Status: Antrian KOSONG.");
                    } else if (antrian.isFull()) {
                        System.out.println(">> Status: Antrian PENUH (kapasitas 10).");
                    } else {
                        System.out.println(">> Status: Antrian tersedia (" +
                                antrian.getSize() + " orang dalam antrian).");
                    }
                    break;
 
                case "5":
                    System.out.println();
                    antrian.peekFront();
                    break;
 
                case "6":
                    System.out.println();
                    antrian.peekRear();
                    break;
 
                case "7":
                    System.out.println();
                    System.out.println(">> Jumlah mahasiswa yang masih mengantre: "
                            + antrian.getSize() + " orang.");
                    break;
 
                case "8":
                    System.out.println();
                    antrian.clear();
                    break;
 
                case "0":
                    System.out.println("\n>> Terima kasih. Program selesai.");
                    running = false;
                    break;
 
                default:
                    System.out.println(">> Pilihan tidak valid, coba lagi.");
            }
        }
        sc.close();
    }
    
}
