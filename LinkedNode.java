import java.lang.reflect.Type;

public class LinkedNode<T> {
    private int size = 0;
    public LinkedNode<T> head;   // the first node in the list;
    public T data;
    public LinkedNode<T> next;

    public LinkedNode(T element) {
        data = element;
        //next = null;
    }
    public LinkedNode() {
        //data = null;
    }
    public LinkedNode<T> getNext(){
        if(isEmpty()){
            throw new NullPointerException("List is empty");
        }return this.next;

    }
    public void setNext(LinkedNode<T> node){
        this.next = node;
    }
    public T getElement   (int index){
        int i = 0;
        if(head ==null){
            throw new NullPointerException("List is empty");
        }
        LinkedNode<T> curr = head;
        if (index >= size) {// returns only up to size return nothing beyond
            throw new IndexOutOfBoundsException("Index is greater than size of list.");
        }else{
            i = 0;
            while (i < index&&curr.next!=null) {
                curr = curr.next;
                i++;
            }
            return curr.data;// now returns the last point regardless.
        }
    }
    public void setElement(int index, T data){
        LinkedNode<T> curr = head;
        //curr = first;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }curr.data = data;
    }
    public boolean isEmpty(){
        if (head == null) {
            return true;
        }
        return false;
    }

}
