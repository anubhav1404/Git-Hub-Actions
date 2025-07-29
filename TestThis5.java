/*class A {
    int x;

    A(int x) {
        this.x = x;

    }

    void show() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        A o1 = new A(10);
        o1.show();

    }
}*/
class A {
    A() {
        System.out.println("hello a");
    }

    A(int x) {

        this();
        System.out.println(x);
    }
}

class TestThis5 {
    public static void main(String args[]) {
        A a = new A(10);
    }
}
