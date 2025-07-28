package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: pac  reason: default package */
public final class pac implements ThreadFactory {
    public String a;
    public int b;

    public final Thread newThread(Runnable runnable) {
        return new oac(runnable, this.a, this.b);
    }
}
