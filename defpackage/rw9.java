package defpackage;

import java.io.Closeable;
import java.util.regex.Pattern;

/* renamed from: rw9  reason: default package */
public final class rw9 implements Closeable {
    public static final Pattern b = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"", 2);
    public final xbc a;

    public rw9(xbc xbc) {
        this.a = xbc;
    }

    public final void close() {
        this.a.close();
    }
}
