class A1 {
    void m1() {
        System.out.println("A");

    }
}

class B1 extends A {
    void m1() {
        System.out.println("B");

    }
}

class C1 extends A {
    void m1() {
        System.out.println("C");

    }
}

class Test {
    public static void main(String args[]) {
        A1 a = new A1();
        // B1 b = new B1();

        //C1 c = new C1();
        A1 ref;
        ref = a;
        ref.m1();
        // ref= b;
        // ref= c;

    }
}
