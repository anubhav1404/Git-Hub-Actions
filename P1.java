class P1 {

    void m() {
        System.out.println("hello");

    }

    void n() {
        System.out.println("bye");
        m();

    }

    public static void main(String[] args) {
        P1 a = new P1();
        a.n();

    }
}