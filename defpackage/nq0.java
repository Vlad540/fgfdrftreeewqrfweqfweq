package defpackage;

/* renamed from: nq0  reason: default package */
public final class nq0 extends dl {
    public final mq0 b;
    public final oq0 c;

    public nq0(mq0 mq0, oq0 oq0) {
        super(mq0.a);
        this.b = mq0;
        this.c = oq0;
    }

    public final boolean a() {
        this.b.getClass();
        return this.c.canRepeat();
    }

    public final boolean b() {
        return this.c.isSupplied();
    }

    public final boolean c() {
        this.b.getClass();
        return this.c.shouldPost();
    }

    public final void d(t67 t67) {
        oq0 oq0 = this.c;
        if (oq0.shouldSkipParam()) {
            t67.getClass();
            return;
        }
        t67.g0(this.b.a);
        oq0.write(t67);
    }

    public final String toString() {
        return this.a + " = " + this.c;
    }
}
