public class StackTugasMahasiswa04 {
    int size, top;
    Mahasiswa04[] stack;

    StackTugasMahasiswa04(int size){
        this.size = size;
        this.top = -1;
        this.stack = new Mahasiswa04[size];
    }

    boolean isFull(){
        return top == size - 1 ? true : false;
    }

    boolean isEmpty(){
        return top == -1 ? true : false;
    }

    void push(Mahasiswa04 mhs){
        if(!isFull()){
            top++;
            stack[top] = mhs;
        }
    }

    Mahasiswa04 pop(){
        if(!isEmpty()){
            Mahasiswa04 mhs = stack[top];
            top--;
            return mhs;
        }else{
            return null; 
        }
    }

    Mahasiswa04 peek(){
        if(!isEmpty()){
            return stack[top];
        }else{
            return null; 
        }
    }

    Mahasiswa04 bottom(){
        if(!isEmpty()){
            return stack[0];
        }else{
            return null; 
        }
    }

    void print(){
        if(!isEmpty()){
            for(int i = top; i >= top; i--){
                Mahasiswa04 mhs = stack[i];
                System.out.println(mhs.nama + " \t" + mhs.nim + " \t" + mhs.kelas);
            }
        }else{
            System.out.println("Data mahasiswa masih belum ada!!");
        }
    }

    int count(){
        return top + 1;
    }

    String konversiDecimalkeBiner(int nilai){
        StackKonversi stackKonversi = new StackKonversi();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stackKonversi.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stackKonversi.isEmpty()) {
            biner += stackKonversi.pop();
        }  
        return biner;
    }
}
