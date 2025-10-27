package lesson12.task1;

public class Storage<T>{
    private T item;

    public void set (T item) {
        this.item = item;
    }
    public T get ( ){
        return item;
    }
}
