package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: pk1  reason: default package */
public abstract class pk1 {
    public static final sq7 a;

    static {
        long millis = TimeUnit.SECONDS.toMillis(5);
        a = new qq7(millis - 2000, millis + 4000);
    }
}
