package lk.cinec;

import java.util.LinkedList;
import java.util.List;

public class KUnitTestClass {
    private static List<String> check;
    private static double checkMade = 0;
    private static double passedChecks = 0;
    private static double failedChecks = 0;

    private static void addToReport(String text) {

        if (check == null) {
            check = new LinkedList<String>();
        }

        check.add(String.format("Test Cnt %.0f: %s", checkMade++, text));
    }

    public static void checkEqualDouble(double x, double y) {

        if (x == (y)) {
            addToReport(String.format("Passed Check %.02f == %.02f", x, y));
            passedChecks++;
        } else {
            addToReport(String.format("Failed Check %.02f == %.02f", x, y));
            failedChecks++;
        }

    }

    public static void checkNotEqualDouble(double x, double y) {
        if (x != (y)) {
            addToReport(String.format("Passed Check %.02f != %.02f", x, y));
            passedChecks++;
        } else {
            addToReport(String.format("Failed Check %.02f != %.02f", x, y));
            failedChecks++;
        }
    }

    public static void report() {

        System.out.printf("%.0f checks passed\n", passedChecks);
        System.out.printf("%.0f checks failed\n", failedChecks);
        System.out.println();

        for (String check: check) {
            System.out.println(check);
        }

    }

}
