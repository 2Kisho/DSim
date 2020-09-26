package de.nerdfactory.dsim.util;

import java.io.PrintWriter;
import java.io.StringWriter;

public class UtilLogger {

    public static String getStacktrace(Throwable t) {
        StringWriter sw = new StringWriter(512);
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }
}
