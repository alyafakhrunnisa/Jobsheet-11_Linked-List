package Pertemuan12;

public class AntrianLinkedList02 {
    private NodeAntrian02 head; // depan (front)
    private NodeAntrian02 tail; // belakang (rear)
    private int size;
    private int counterNomor; // nomor antrian auto-increment
    private final int KAPASITAS_MAX = 10; // batas kapasitas antrian
 
    public AntrianLinkedList02() {
        head         = null;
        tail         = null;
        size         = 0;
        counterNomor = 0;
    }
 
    // Cek antrian kosong
    public boolean isEmpty() {
        return head == null;
    }
 
    // Cek antrian penuh 
    public boolean isFull() {
        return size >= KAPASITAS_MAX;
    }
 
    //Mengosongkan seluruh antrian 
    public void clear() {
        head         = null;
        tail         = null;
        size         = 0;
        counterNomor = 0;
        System.out.println(">> Antrian berhasil dikosongkan.");
    }
 
    // Enqueue: tambah antrian di belakang 
    public void enqueue(MahasiswaQueue02 mhs) {
        if (isFull()) {
            System.out.println(">> Antrian penuh! Tidak dapat menambah data.");
            return;
        }
        counterNomor++;
        mhs.nomorAntrian = counterNomor;
        NodeAntrian02 node = new NodeAntrian02(mhs, null);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
        System.out.printf(">> %s berhasil masuk antrian dengan nomor %d.%n",
                mhs.nama, mhs.nomorAntrian);
    }
 
    // Dequeue: panggil / layani antrian terdepan
    public MahasiswaQueue02 dequeue() {
        if (isEmpty()) {
            System.out.println(">> Antrian kosong! Tidak ada yang dipanggil.");
            return null;
        }
        MahasiswaQueue02 dilayani = head.data;
        head = head.next;
        if (head == null) tail = null;
        size--;
        System.out.printf(">> Memanggil antrian no. %d – %s (%s)%n",
                dilayani.nomorAntrian, dilayani.nama, dilayani.nim);
        return dilayani;
    }
 
    // ── Tampilkan antrian terdepan (peek front) ──────
    public void peekFront() {
        if (isEmpty()) {
            System.out.println(">> Antrian kosong.");
        } else {
            System.out.print(">> Antrian terdepan: ");
            head.data.tampilInformasi();
        }
    }
 
    // Tampilkan antrian paling akhir (peek rear) 
    public void peekRear() {
        if (isEmpty()) {
            System.out.println(">> Antrian kosong.");
        } else {
            System.out.print(">> Antrian paling akhir: ");
            tail.data.tampilInformasi();
        }
    }
 
    // Tampilkan jumlah antrian 
    public int getSize() {
        return size;
    }
 
    // Tampilkan seluruh antrian 
    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println(">> Antrian kosong.");
        } else {
            System.out.println("          DAFTAR ANTRIAN LAYANAN KEMAHASISWAAN        ");
            NodeAntrian02 tmp = head;
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("  Jumlah mahasiswa yang mengantre: " + size);
        }
    }
    
}
