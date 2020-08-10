package test;

import edu.kit.informatik.Terminal;
import utils.TimeOfMinute;

public class Test {

    public static void main(String[] args) {
        String regex = "^([1-9]\\d{3})-(0[1-9]|1[0-2])-([0][1-9]|[12][0-9]|3[01])$";
        Terminal.printLine("2020-01-25".matches(regex));
    }
}
