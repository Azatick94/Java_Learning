package tim_learning;

public class OuterClass {

    private String info;

    // constructor of OUterClass
    public OuterClass(String info) {
        this.info = info;
        this.hello_outer();
    }

    public void hello_outer() {
        System.out.println("Outer class was instantiated");
    }



    // lets create inner Class within Outer class
    private class InnerClass {

        public void display_inner_class() {
            System.out.println("Hello! You are in inner class");
        }
    }

    // and now within OUterClass lets instantiate InnerClass
    public void inner() {
        InnerClass inner_class = new InnerClass();
        inner_class.display_inner_class();

    }




}
