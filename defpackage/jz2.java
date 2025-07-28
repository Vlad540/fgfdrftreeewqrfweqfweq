package defpackage;

/* renamed from: jz2  reason: default package */
public final class jz2 {
    public final t97 a;
    public final t97 b;

    public jz2(t97 t97, t97 t972) {
        this.a = t97;
        this.b = t972;
    }

    public final void a(long j, long j2) {
        udd.p("jz2", "clearChat id=%d, time=%d", new Object[]{Long.valueOf(j), Long.valueOf(j2)});
        ((t52) this.a.getValue()).o(j, j2);
        ((p7a) this.b.getValue()).d(j);
    }
}
