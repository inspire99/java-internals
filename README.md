# java-internals
trying to go deeper into java


### 1. generics 
 
#### 1.1 type erasure

1. generics rely on type-erasure
2. type erasure - erasing type variables to their bound
3. when we create a generic class/method/variable - the type specified 
might be bounded/unbounded. 
4. depending on the bounds, java compiler will erase the type and replaces
with the bound. 

```java

//1. unbounded type example - 
// node in singly linked list
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

// After compiler applies a type erasure, it becomes like below

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

// 2. bounded type example

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

// After compiler applies a type erasure, it becomes like below

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
```
### 2. collections