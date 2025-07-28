package defpackage;

import java.io.Closeable;

/* renamed from: om6  reason: default package */
public final class om6 implements Closeable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;
    public final Closeable o;

    public /* synthetic */ om6(int i, Object obj, Closeable closeable, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.o = closeable;
    }

    private final void m() {
    }

    public final void close() {
        switch (this.a) {
            case 0:
                return;
            default:
                sz5 sz5 = this.o;
                if (sz5 != null) {
                    sz5.close();
                    return;
                }
                return;
        }
    }
}
