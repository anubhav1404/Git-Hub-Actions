class Ak {
    String x = "Hello";
}

class B extends Ak {
    String x = "bye";

    void show() {
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        B o1 = new B();
        o1.show();

    }
}
