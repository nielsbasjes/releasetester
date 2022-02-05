package nl.basjes.reltest.application;

import nl.basjes.reltest.library.DoesStuff;

public class App {
    public static void main(String[] arg) {
        System.out.println(makeMsg(2, 4));
    }

    public static String makeMsg(int one, int two) {
        return "Sum: " + one + " + " + two + " = " + DoesStuff.sum(one, two);
    }
}
