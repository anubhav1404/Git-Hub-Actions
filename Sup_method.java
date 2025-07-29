class Sup_A {
    void show() {
        System.out.println("class a");

    }
}

class Sup_method extends Sup_A {
    void show() {
        System.out.println("B");

    }

    void displ() {
        super.show();
        show();

    }

    public static void main(String[] args) {
        Sup_method o2 = new Sup_method();
        o2.displ();
    }
}