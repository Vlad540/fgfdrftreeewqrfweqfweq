package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: r0  reason: default package */
public final class r0 {
    public static final r0 c;
    public static final r0 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (l1.o) {
            d = null;
            c = null;
            return;
        }
        d = new r0(false, (CancellationException) null);
        c = new r0(true, (CancellationException) null);
    }

    public r0(boolean z, CancellationException cancellationException) {
        this.a = z;
        this.b = cancellationException;
    }
}
