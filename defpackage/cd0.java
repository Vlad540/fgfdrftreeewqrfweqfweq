package defpackage;

/* renamed from: cd0  reason: default package */
public final class cd0 implements pv1 {
    public final bd0[] a;

    public cd0(bd0[] bd0Arr) {
        this.a = bd0Arr;
    }

    public final void a() {
        for (bd0 bd0 : this.a) {
            aj4 aj4 = bd0.c;
            if (aj4 == null) {
                aj4 = null;
            }
            aj4.dispose();
        }
    }

    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
