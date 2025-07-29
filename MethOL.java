
class MethOL {
    int add(int a, int b) {
        System.out.println(a + b);
        return 0;

    }

    int add(int a, int b, int c) {

        return a - b + c;

    }

    public static void main(String args[]) {
        MethOL m1 = new MethOL();
        m1.add(10, 20);

    }
}