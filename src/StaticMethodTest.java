class Parent {

    public void print() {
        System.out.println("Print from parent");
    }

}

class Children extends Parent {

    //@Override
    public void print() {
        System.out.println("Print from children");
    }
}


public class StaticMethodTest {


    public static void main(String[] args) {
        Parent parent;
        Children children = new Children();
        parent = children;
        parent.print();
    }

}
