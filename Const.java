class Const {
    int a;

    Const() {
        System.out.println("anubhav");
    }

    Const(int a) {
        this.a = a;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Const c1 = new Const();
        Const c2 = new Const(10);

    }
}