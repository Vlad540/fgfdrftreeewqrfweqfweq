package defpackage;

/* renamed from: pib  reason: default package */
public final class pib extends yg0 {
    public final int j;

    public pib(it4 it4, cd3 cd3, und und, yd3 yd3, int i) {
        super(it4, cd3, und, yd3);
        this.j = i;
    }

    public final void close() {
    }

    public final int d() {
        return ((Number) this.f.d.getValue()).intValue();
    }

    public final void g(boolean z) {
    }

    public final String i() {
        return this.f.a;
    }

    public final int j() {
        return this.j;
    }

    public final String toString() {
        return "ProxyClient{connectionHost=" + this.f + "}";
    }
}
