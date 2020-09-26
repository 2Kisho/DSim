package de.nerdfactory.dsim.util;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * The {@link UtilLogger} provides a method {@link #getStacktrace(Throwable)} to get a Stacktrace
 * from a {@link Throwable}.
 * 
 * @author basti
 *
 */
public class UtilLogger {

    /**
     * Gets a stacktrace from a given {@link Throwable}.
     * 
     * @param t
     *            A {@link Throwable}
     * @return A String with the stacktrace from the {@link Throwable}.
     */
    public static String getStacktrace(Throwable t) {
        StringWriter sw = new StringWriter(512);
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }
}
