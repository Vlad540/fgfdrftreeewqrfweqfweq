package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: h3  reason: default package */
public final class h3 {
    public static final h3 c;
    public static final h3 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (n3.o) {
            d = null;
            c = null;
            return;
        }
        d = new h3(false, (CancellationException) null);
        c = new h3(true, (CancellationException) null);
    }

    public h3(boolean z, CancellationException cancellationException) {
        this.a = z;
        this.b = cancellationException;
    }
}
