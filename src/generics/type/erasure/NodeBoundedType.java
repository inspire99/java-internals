package generics.type.erasure;

public class NodeBoundedType {

    private Comparable data;
    private NodeBoundedType next;

    public NodeBoundedType(Comparable data,NodeBoundedType next){
        this.data = data;
        this.next = next;
    }

    public void setData(Comparable data){
        this.data = data;
    }
}
