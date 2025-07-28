package defpackage;

/* renamed from: uz5  reason: default package */
public final class uz5 extends RuntimeException {
    public final int a;
    public final Throwable b;

    public uz5(Throwable th, int i) {
        super(th);
        this.a = i;
        this.b = th;
    }

    public final Throwable getCause() {
        return this.b;
    }
}
