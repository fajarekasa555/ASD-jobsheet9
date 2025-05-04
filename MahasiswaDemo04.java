import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        StackTugasMahasiswa04 stack = new StackTugasMahasiswa04(5);

        do {
            System.out.println("Menu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat daftar tugas");
            System.out.println("5. Melihat tugas paling bawah");
            System.out.println("6. Jumlah tugas yang dikumpulkan");
            System.out.println("7. Keluar");
            System.out.print("Pilih : ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = input.next();
                    System.out.print("Masukkan Nama: ");
                    input.nextLine();
                    String nama = input.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = input.nextLine();
                    Mahasiswa04 mhs = new Mahasiswa04(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.println("Tugas dari " + mhs.nama + " telah dikumpulkan.");
                    break;
                case 2:
                    Mahasiswa04 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari : " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100) : ");
                        int nilai = input.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Niliai Tugas %s adalah %d\n", dinilai.nama, dinilai.nilai);
                        String biner = stack.konversiDecimalkeBiner(nilai);
                        System.out.printf("Nilai biner dari %d adalah %s\n", dinilai.nilai, biner);
                    } else {
                        System.out.println("Stack kosong!");
                    }
                    break;
                case 3:
                    Mahasiswa04 peekedMhs = stack.peek();
                    if (peekedMhs != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh : " + peekedMhs.nama);
                    } else {
                        System.out.println("Stack kosong!");
                    }
                    break;
                case 4:
                System.out.println("Daftar semua tugas :");
                System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa04 bottomMhs = stack.bottom();
                    if (bottomMhs != null) {
                        System.out.println("Tugas paling bawah dikumpulkan oleh : " + bottomMhs.nama);
                    } else {
                        System.out.println("Stack kosong!");
                    }
                    break;
                case 6:
                    System.out.println("Jumlah tugas yang dikumpulkan: " + stack.count());
                    break;
                case 7:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 7);
    }
}