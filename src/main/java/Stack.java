import java.util.ArrayList;



class Stack<T>{

    ArrayList<T> stack;

    Stack(){
        stack = new ArrayList<>();
    }

    public T pop() throws Exception {
        T obj;
        if (stack.isEmpty()) {
            throw new Exception("Stack is empty");
        }
        obj = stack.remove(stack.size()-1);
        return obj;
    }

    public T push (T i){
        stack.add(i);
        return i;
    }

    public boolean empty(){
        return stack.isEmpty();
    }

    public T peek(){
        return stack.get(stack.size()-1);
    }

    public int search(T search){
        for (int i = stack.size()-1; i >=0; i--) {
            if (stack.get(i) == search)
                return stack.size()-i;
        }
        return -1;
    }
}