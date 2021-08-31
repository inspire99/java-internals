package generics;

public class NodeUnboundedType<T>{

    // here, T is unbounded
    private T data; // what data we want generics.Node to hold
    private NodeUnboundedType<T> next; // next node in the list

    public NodeUnboundedType(T data, NodeUnboundedType<T> next){
        this.data = data;
        this.next = next;
    }

    public void setData(T data){
        this.data = data;
    }
}