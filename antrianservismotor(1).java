import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class LayananServisMotor {
    private Queue<String> antrian; // hanya dapat diakses di dalam kelas

    public LayananServisMotor() {
        antrian = new LinkedList<>(); // konstuktor ini untuk inisialisasi antrian sebagai LinkedList kosong.
    }

    public void tambahMotor(String nomorMotor) {
        antrian.add(nomorMotor); // menambahkan nomor motor ke dalam antrian.
        System.out.println("Motor dengan nomor " + nomorMotor + " telah ditambahkan ke dalam antrian servis.");
    }

    public void layaniMotorSelanjutnya() {
        if (antrian.isEmpty()) { // mengecek apakah antrian kosong.
            System.out.println("Tidak ada motor dalam antrian.");
        } else {
            String motorSelanjutnya = antrian.poll(); // Mengambil dan menghapus motor selanjutnya dari antrian.
            System.out.println("Melayani motor dengan nomor " + motorSelanjutnya + "."); // motor sedang dilayani
        }
    }

    public void tampilkanAntrian() {
        System.out.println("Antrian servis motor saat ini: " + antrian); // Menampilkan isi antrian servis motor.
    }
}

public class AntrianServisMotor {
    public static void main(String[] args) {
        LayananServisMotor layanan = new LayananServisMotor(); // terdapat objek layanan dibuat dengan konstruktor layananservismotor.
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk menerima input dari pengguna.

        int pilihan = 0; //dideklarasikan dengan angka 0 sebagai pilihan awal pengguna

        while (pilihan != 4) { // Looping menu utama hingga pilihan keluar (4).
            System.out.println("Antrian Servis Motor");
            System.out.println("1. Tambah motor ke antrian");
            System.out.println("2. Layani motor selanjutnya");
            System.out.println("3. Tampilkan antrian");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt(); // Menerima pilihan pengguna.

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nomor motor: "); // Menerima nomor motor dari pengguna.
                    String nomorMotor = scanner.next(); // Memanggil metode tambahMotor untuk menambahkan motor ke antrian.
                    layanan.tambahMotor(nomorMotor);
                    break;
                case 2:
                    layanan.layaniMotorSelanjutnya(); // Memanggil metode layaniMotorSelanjutnya untuk melayani motor selanjutnya dalam antrian.
                    break;
                case 3:
                    layanan.tampilkanAntrian(); // Memanggil metode tampilkanAntrian untuk menampilkan isi antrian.
                    break;
                case 4:
                    System.out.println("Keluar..."); // Menampilkan pesan keluar.
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi."); // Menampilkan pesan jika pilihan tidak valid.
                    break;
            }

            System.out.println();
        }

        scanner.close(); // Menutup objek Scanner.
    }
}
