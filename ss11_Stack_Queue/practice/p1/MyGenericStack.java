package ss11_Stack_Queue.practice.p1;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }else {
            return stack.removeFirst();
        }
    }
    public boolean isEmpty(){
        if (stack.size()==0){
            return true;
        }else {
            return false;
        }
    }
    public int size(){
        return stack.size();
    }

}
