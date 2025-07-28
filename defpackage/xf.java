package defpackage;

import java.io.Closeable;

/* renamed from: xf  reason: default package */
public final class xf implements Closeable {
    public final int a;
    public final e13 b;

    public xf(int i, t54 t54) {
        this.a = i;
        this.b = t54;
    }

    public final void close() {
        this.b.close();
    }
}
