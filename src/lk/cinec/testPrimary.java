package lk.cinec;

import static lk.cinec.KUnitTestClass.*;

public class testPrimary {

    void checkConstructorAndAccess() {
        Primary primary = new Primary(4, 5);

        checkEqualDouble(primary.getX(), 4);
        checkNotEqualDouble(primary.getX(), 4);
        checkEqualDouble(primary.getY(), 5);
        checkNotEqualDouble(primary.getY(), 5);

    }

    void checkPowerX() {
        Primary primary = new Primary(4, 5);
        primary.powerX();
        checkEqualDouble(primary.getX(), 16);
    }

    public static void main(String[] args) {
        testPrimary testPrimary = new testPrimary();
        testPrimary.checkConstructorAndAccess();
        testPrimary.checkPowerX();
        report();
    }
}
