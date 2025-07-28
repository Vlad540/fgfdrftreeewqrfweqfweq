package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: g13  reason: default package */
public abstract class g13 {
    public static final Logger a = Logger.getLogger(g13.class.getName());

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                a.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
            }
        }
    }

    public static void b(InputStream inputStream) {
        try {
            a(inputStream);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
