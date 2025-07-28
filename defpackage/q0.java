package defpackage;

/* renamed from: q0  reason: default package */
public final class q0 {
    public static final q0 c;
    public static final q0 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (k1.o) {
            d = null;
            c = null;
            return;
        }
        d = new q0(false, (RuntimeException) null);
        c = new q0(true, (RuntimeException) null);
    }

    public q0(boolean z, RuntimeException runtimeException) {
        this.a = z;
        this.b = runtimeException;
    }
}
