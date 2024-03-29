public class Node {
    private Object value;
    private Node next;
    private Node prev;


    public Node(){
    }
    public Node(Object value) {
        this.value = value;
    }
    public Node(Object value,Node next,Node prev){
        this.value=value;
        this.next=next;
        this.prev=prev;
    }
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public String toString() {
        return "Number "+value;
    }
}
