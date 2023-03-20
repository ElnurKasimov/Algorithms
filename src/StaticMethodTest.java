public class StaticMethodTest {


    public static void main(String[] args) {
        Parent parent;
        Children children = new Children();
        parent = children;
        parent.print();
    }

}
