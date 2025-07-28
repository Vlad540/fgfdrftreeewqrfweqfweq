package defpackage;

import java.util.regex.Pattern;

/* renamed from: f1f  reason: default package */
public abstract class f1f {
    static {
        Pattern.compile("[-_./;:]");
    }

    public static final void a() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }
}
