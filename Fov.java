class Fov {
    int a;

    void show() {
        System.out.println("soja bhai thak gaya hoga");
    }

    int show(int a) {
        System.out.println(a + a);
        return 0;

    }

    public static void main(String[] args) {
        Fov f1= new Fov();
        f1.show();
        f1.show(10);
    }
}