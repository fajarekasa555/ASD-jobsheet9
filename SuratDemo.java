import java.util.Scanner;
public class SuratDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat stackSurat = new StackSurat(10);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    input.nextLine();
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Kelas Mahasiswa: ");
                    String kelas = input.nextLine();
                    System.out.print("Masukkan Jenis Izin (S/I): ");
                    char jenisIzin = input.next().charAt(0);
                    System.out.print("Masukkan Durasi Izin (hari): ");
                    int durasi = input.nextInt();
                    Surat04 surat = new Surat04(nim, nama, kelas, jenisIzin, durasi);
                    stackSurat.push(surat);
                    System.out.println("Surat izin berhasil diterima.");
                    break;
                case 2:
                    Surat04 diproses = stackSurat.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat: ");
                        stackSurat.tampilkan(diproses);
                        System.out.println("Surat izin telah diproses.");
                    }
                    break;

                case 3:
                    Surat04 terakhir = stackSurat.peek();
                    if (terakhir != null) {
                        System.out.println("Surat izin terakhir: ");
                        stackSurat.tampilkan(terakhir);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang Dicari: ");
                    input.nextLine();
                    String cariNama = input.nextLine();
                    Surat04 founded = stackSurat.search(cariNama);
                    if (founded != null) {
                        System.out.println("Surat izin ditemukan untuk mahasiswa: " + cariNama);
                        System.out.println("Detail Surat Izin: ");
                        stackSurat.tampilkan(founded);
                    } else {
                        System.out.println("Surat izin tidak ditemukan untuk mahasiswa: " + cariNama);
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 5);

        input.close();
    }
}
