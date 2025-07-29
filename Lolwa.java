public class Lolwa {
    public static void main(String args[]) {
        try {
            String a = null;
            System.out.println(a.length());
            // int a = args.length;
            // System.out.println("a = " + a);
            // int b = 42 / a;
            // int c[] = { 1 };
            // c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index oob: " + e);
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
        System.out.println("After try/catch blocks.");
    }
}