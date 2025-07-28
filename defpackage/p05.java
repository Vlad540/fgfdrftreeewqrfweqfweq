package defpackage;

/* renamed from: p05  reason: default package */
public final class p05 extends q05 {
    public final Runnable c;

    public p05(Runnable runnable, long j) {
        super(j);
        this.c = runnable;
    }

    public final void run() {
        this.c.run();
    }

    public final String toString() {
        return super.toString() + this.c;
    }
}
