abstract class ran {
    abstract void dosp();

}

class abst extends ran {
    void dosp() {
        // System.out.println("hello");

    }

    public static void main(String args[]) {
        ran o1 = new abst();
        o1.dosp();

    }

}
