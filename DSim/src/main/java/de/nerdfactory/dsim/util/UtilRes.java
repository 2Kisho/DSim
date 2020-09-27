package de.nerdfactory.dsim.util;

import java.util.MissingResourceException;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * The {@link UtilRes} holds the {@link ResourceBundle} for the application.
 * 
 * @author basti
 *
 */
public class UtilRes {

    private static final Logger LOGGER = Logger.getLogger(UtilRes.class.getName());
    private static final String BASE_NAME = "DSim";
    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle(BASE_NAME);

    private UtilRes() {
        throw new IllegalStateException("No instance for you!");
    }

    /**
     * Retrieves the translation from the {@link ResourceBundle} wit the given key in the manner of:
     * 
     * <pre>
     * ClazzName.key
     * </pre>
     * 
     * @param clazz
     *            The {@link Class} thats name should be used.
     * @param key
     *            A {@link String} that indicates the key.
     * @return A String with the translation, if no key was found the key itself.
     */
    public static String getString(Class<?> clazz, String key) {
        return getString(clazz.getSimpleName() + "." + key);
    }

    /**
     * Retrieves the translation from the {@link ResourceBundle} with the given key.
     * 
     * @param key
     *            A String that determines which translation should be used.
     * @return A String with the translation, if no key was found the key itself.
     */
    public static String getString(String key) {
        Objects.requireNonNull(key, "The key must not be null!");
        try {
            return BUNDLE.getString(key);
        } catch (MissingResourceException ex) {
            LOGGER.fine("The key(" + key + ") was not found in the ResourceBundle!");
            return key;
        }
    }
}
