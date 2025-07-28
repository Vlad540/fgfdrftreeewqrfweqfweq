package defpackage;

/* renamed from: cw4  reason: default package */
public enum cw4 implements xjb {
    ;

    public static void a(bw9 bw9) {
        bw9.d(a);
        bw9.b();
    }

    public static void b(Throwable th, bw9 bw9) {
        bw9.d(a);
        bw9.onError(th);
    }

    public static void c(Throwable th, zhd zhd) {
        zhd.d(a);
        zhd.onError(th);
    }

    public final void clear() {
    }

    public final void f() {
    }

    public final boolean h() {
        return this == a;
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
}
