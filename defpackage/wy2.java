package defpackage;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: wy2  reason: default package */
public final class wy2 implements j39 {
    public static final Logger a = Logger.getLogger(wy2.class.getName());

    public final InputStream b(String str) {
        InputStream resourceAsStream = wy2.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            Level level = Level.WARNING;
            a.log(level, "File " + str + " not found");
        }
        return resourceAsStream;
    }
}
