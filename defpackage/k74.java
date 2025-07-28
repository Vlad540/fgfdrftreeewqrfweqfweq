package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: k74  reason: default package */
public final class k74 implements o3e {
    public static final long a = TimeUnit.MINUTES.toMillis(5);

    public final Object get() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i = min < 16777216 ? 1048576 : min < 33554432 ? 2097152 : 4194304;
        return new fl8(i, Integer.MAX_VALUE, i, a, i / 8);
    }
}
