public class StackSurat {
    int size, top;
    Surat04[] stack;

    public StackSurat(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new Surat04[size];
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Surat04 surat) {
        if (!isFull()) {
            stack[++top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak dapat menerima surat baru.");
        }
    }

    Surat04 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    Surat04 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk dilihat.");
            return null;
        }
    }

    Surat04 search(String namaMahasiswa) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].nama.equalsIgnoreCase(namaMahasiswa)) {
                return stack[i];
            }
        }
        return null;
    }

    void tampilkan(Surat04 surat) {
        System.out.println("NIM: " + surat.id);
        System.out.println("Nama: " + surat.nama);
        System.out.println("Kelas: " + surat.kelas);
        System.out.println("Jenis Izin: " + (surat.jenis == 'S' ? "Sakit" : "Izin"));
        System.out.println("Durasi Izin: " + surat.durasi + " hari");
    }
}
