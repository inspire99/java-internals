# java-internals
trying to go deeper into java

| **Java SE Version **         | **Version Number** | **Release Date**         | **notes branch**|
| ---------------------------- | ------------------ | ------------------------ |--- |
| **JDK 1.0** (Oak)           | 1.0                | January 1996             | [java-0-notes](https://github.com/inspire99/java-internals/tree/java-0) |
| **JDK 1.1**                  | 1.1                | February 1997            | [java-1-notes](https://github.com/inspire99/java-internals/tree/java-1)|
| **J2SE 1.2** (Playground)   | 1.2                | December 1998            | [java-2-notes](https://github.com/inspire99/java-internals/tree/java-2) |
| **J2SE 1.3** (Kestrel)      | 1.3                | May 2000                 | [java-3-notes](https://github.com/inspire99/java-internals/tree/java-3)|
| **J2SE 1.4** (Merlin)       | 1.4                | February 2002            | [java-4-notes](https://github.com/inspire99/java-internals/tree/java-4)|
| **J2SE 5.0** (Tiger)        | 1.5                | September 2004           | [java-5-notes](https://github.com/inspire99/java-internals/tree/java-5)|
| **Java SE 6** (Mustang) | 1.6                | December 2006            | [java-6-notes](https://github.com/inspire99/java-internals/tree/java-6)|
| **Java SE 7** (Dolphin) | 1.7                | July 2011                | [java-7-notes](https://github.com/inspire99/java-internals/tree/java-7)|
| **Java SE 8**            | 1.8                | March 2014               | [java-8-notes](https://github.com/inspire99/java-internals/tree/java-8)|
| **Java SE 9**            | 9                  | September, 21st 2017     | [java-9-notes](https://github.com/inspire99/java-internals/tree/java-9)|
| **Java SE 10**           | 10                 | March, 20th 2018         | [java-10-notes](https://github.com/inspire99/java-internals/tree/java-10)|
| **Java SE 11**           | 11                 | September, 25th 2018     | [java-11-notes](https://github.com/inspire99/java-internals/tree/java-11)|
| **Java SE 12**               | 12                 | March, 19th 2019         | [java-12-notes](https://github.com/inspire99/java-internals/tree/java-12)|
| **Java SE 13**               | 13                 | September, 17th 2019     | [java-13-notes](https://github.com/inspire99/java-internals/tree/java-13)|
| **Java SE 14**               | 14                 | March, 17th 2020         | [java-14-notes](https://github.com/inspire99/java-internals/tree/java-14)|
| **Java SE 15**               | 15                 | September, 15th 2020     | [java-15-notes](https://github.com/inspire99/java-internals/tree/java-15)|
| **Java SE 16**               | 16                 | March, 16th 2021         | [java-16-notes](https://github.com/inspire99/java-internals/tree/java-16)|
| _Java SE 17_                 | _17_               | _Expected on Sept. 2021_ | [java-17-notes](https://github.com/inspire99/java-internals/tree/java-17)|



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

### 3. concurrency

### 4. serialization

### 5. testing
