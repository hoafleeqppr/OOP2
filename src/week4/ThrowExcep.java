package week4;

public class ThrowExcep {
    static void fun() {
        try {
            throw new NullPointerException("demo"); // throw ngoai le null pointer
        } catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw e; // rethrow ngoai le null pointer the exception
        }
    }

    public static void main(String args[]) {
        try {
            fun();
        } catch (NullPointerException e) {
            System.out.println("Caught in main.");
        }
    }
}
