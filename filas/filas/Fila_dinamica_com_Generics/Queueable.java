package filas.Fila_dinamica_com_Generics;

public interface Queueable<T> {
    void enqueue( Object data);
    T dequeue();
    T front();
    boolean isEmpty();
    boolean isFull();
    
}
