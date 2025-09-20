package Estática;
public interface Queueble {

    void enqueue( Object data);
    Object dequeue();
    Object front();
    boolean isEmpty();
    boolean isFull();
    
    
}