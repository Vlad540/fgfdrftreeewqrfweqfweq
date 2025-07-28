package defpackage;

/* renamed from: io5  reason: default package */
public final class io5 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final long b;
    public final Object c;

    public io5(long j, d1e d1e) {
        this.c = d1e;
        this.b = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((d1e) this.c).i(this.b);
                return;
            default:
                ((wv9) this.c).a(this.b);
                return;
        }
    }

    public io5(long j, wv9 wv9) {
        this.b = j;
        this.c = wv9;
    }
}
