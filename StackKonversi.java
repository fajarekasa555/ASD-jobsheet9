public class StackKonversi {
    int size, top;
    int[] stack;

    StackKonversi(){
        this.size = 32;
        this.top = -1;
        this.stack = new int[size];
    }

    boolean isFull(){
        return top == size - 1 ? true : false;
    }

    boolean isEmpty(){
        return top == -1 ? true : false;
    }

    void push(int data){
        if(!isFull()){
            top++;
            stack[top] = data;
        }
    }

    int pop(){
        if(!isEmpty()){
            int data = stack[top];
            top--;
            return data;
        }else{
            return -1; 
        }
    }

    int peek(){
        if(!isEmpty()){
            return stack[top];
        }else{
            return -1; 
        }
    }

    void print(){
        if(!isEmpty()){
            for(int i = top; i >= 0; i--){
                System.out.println(stack[i]);
            }
        }else{
            System.out.println("Stack kosong!!");
        }
    }
}
