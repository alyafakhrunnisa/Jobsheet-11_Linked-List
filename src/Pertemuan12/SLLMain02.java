package Pertemuan12;

import java.util.Scanner;

public class SLLMain02 {
    public static void main(String[] args) {
        SingleLinkedList02 sll = new SingleLinkedList02();
        Scanner sc = new Scanner(System.in);

        Mahasiswa02 mhs1 = new Mahasiswa02("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa02 mhs2 = new Mahasiswa02("23212201", "Bimon",  "2B", 3.8);    
        Mahasiswa02 mhs3 = new Mahasiswa02("22212202", "Cintia", "3C", 3.5);
        Mahasiswa02 mhs4 = new Mahasiswa02("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        // boolean lanjut = true;
        // System.out.println("======================================");
        // System.out.println("   Tambah Data Mahasiswa dari Keyboard");
        // System.out.println("======================================");

        // while (lanjut) {
        //     System.out.println("\nPilih posisi penambahan:");
        //     System.out.println(" 1. Tambah di depan       (addFirst)");
        //     System.out.println(" 2. Tambah di belakang    (addLast)");
        //     System.out.println(" 3. Sisipkan setelah nama (insertAfter)");
        //     System.out.println(" 4. Sisipkan pada indeks  (insertAt)");
        //     System.out.println(" 0. Selesai");
        //     System.out.print("Pilihan: ");
        //     String pilihan = sc.nextLine().trim();

        //     if (pilihan.equals("0")) {
        //         lanjut = false;
        //         break;
        //     }

        //     // Input data mahasiswa baru
        //     System.out.println("\n--- Input Data Mahasiswa ---");
        //     System.out.print("NIM   : ");
        //     String nim = sc.nextLine();
        //     System.out.print("Nama  : ");
        //     String nama = sc.nextLine();
        //     System.out.print("Kelas : ");
        //     String kelas = sc.nextLine();
        //     System.out.print("IPK   : ");
        //     double ipk = 0.0;
        //     try {
        //         ipk = Double.parseDouble(sc.nextLine());
        //     } catch (NumberFormatException e) {
        //         ipk = 0.0;
        //     }

        //     Mahasiswa02 baru = new Mahasiswa02(nim, nama, kelas, ipk);

        //     switch (pilihan) {
        //         case "1":
        //             sll.addFirst(baru);
        //             System.out.println("[OK] Data ditambahkan di depan.");
        //             break;
        //         case "2":
        //             sll.addLast(baru);
        //             System.out.println("[OK] Data ditambahkan di belakang.");
        //             break;
        //         case "3":
        //             System.out.print("Sisipkan setelah nama: ");
        //             String key = sc.nextLine();
        //             sll.insertAfter(key, baru);
        //             System.out.println("[OK] Data disisipkan setelah " + key + ".");
        //             break;
        //         case "4":
        //             System.out.print("Masukkan indeks: ");
        //             int idx = 0;
        //             try {
        //                 idx = Integer.parseInt(sc.nextLine());
        //             } catch (NumberFormatException e) {
        //                 idx = 0;
        //             }
        //             sll.insertAt(idx, baru);
        //             System.out.println("[OK] Data disisipkan pada indeks " + idx + ".");
        //             break;
        //         default:
        //             System.out.println("[!] Pilihan tidak valid.");
        //     }

        //     System.out.println();
        //     sll.print();
        // }

        // System.out.println("\n--- Linked List Akhir ---");
        // sll.print();
        // sc.close();

        System.out.print("data index 1 : ");
        sll.getData(1);
 
        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();
 
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
    }
    

