package generics;

public class NodeBoundedType<T extends Comparable<T>> {

    // here, T is bounded, in the sense, bounded by Comparable.
    private T data;
    private NodeBoundedType<T> next;

    public NodeBoundedType(T data, NodeBoundedType<T> next){
        this.data = data;
        this.next = next;
    }

    public void setData(T data){
        this.data = data;
    }

}
