package defpackage;

/* renamed from: vw4  reason: default package */
public enum vw4 implements zjb {
    ;

    public static void a(b1e b1e) {
        b1e.e(a);
        b1e.b();
    }

    public static void b(Throwable th, b1e b1e) {
        b1e.e(a);
        b1e.onError(th);
    }

    public final void cancel() {
    }

    public final void clear() {
    }

    public final void i(long j) {
        f1e.d(j);
    }

    public final boolean isEmpty() {
        return true;
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final Object poll() {
        return null;
    }

    public final int q(int i) {
        return 2;
    }

    public final String toString() {
        return "EmptySubscription";
    }
}
