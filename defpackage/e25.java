package defpackage;

/* renamed from: e25  reason: default package */
public final class e25 implements Runnable {
    public final Runnable a;
    public final z15 b;
    public final a25 c;

    public e25(Runnable runnable, z15 z15, a25 a25) {
        this.a = runnable;
        this.b = z15;
        this.c = a25;
    }

    public final void run() {
        a25 a25 = this.c;
        long a2 = this.b.a();
        try {
            this.a.run();
        } finally {
            a25.a(a2);
        }
    }
}
