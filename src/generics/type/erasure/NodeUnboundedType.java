package generics.type.erasure;

public class NodeUnboundedType {
    private Object data;
    private NodeUnboundedType next;

    public NodeUnboundedType(Object data,NodeUnboundedType next){
        this.data = data;
        this.next = next;
    }

    public void setData(Object data){
        this.data = data;
    }
}
