package Pertemuan12;

public class MahasiswaQueue02 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    int nomorAntrian;
 
    public MahasiswaQueue02() {}
 
    public MahasiswaQueue02(String nim, String nama, String kelas, double ipk) {
        this.nim   = nim;
        this.nama  = nama;
        this.kelas = kelas;
        this.ipk   = ipk;
    }
 
    public void tampilInformasi() {
        System.out.printf("  [%d] %-12s | NIM: %-10s | Kelas: %-4s | IPK: %.2f%n",
                nomorAntrian, nama, nim, kelas, ipk);
    }
}
