package defpackage;

/* renamed from: tcc  reason: default package */
public final class tcc {
    public static final tcc d = new tcc(0, false, false);
    public static final tcc e = new tcc(500, true, false);
    public static final tcc f = new tcc(0, false, true);
    public final long a;
    public final boolean b;
    public final boolean c;

    static {
        new tcc(100, true, false);
    }

    public tcc(long j, boolean z, boolean z2) {
        this.b = z;
        this.a = j;
        if (z2) {
            e07.j("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.c = z2;
    }
}
