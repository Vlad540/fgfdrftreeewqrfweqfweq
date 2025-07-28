package defpackage;

/* renamed from: y70  reason: default package */
public final class y70 implements is9 {
    public static final y70 a = new Object();
    public static final cc5 b;
    public static final cc5 c;

    /* JADX WARNING: type inference failed for: r0v0, types: [y70, java.lang.Object] */
    static {
        Class<shb> cls = shb.class;
        b = new cc5("eventsDroppedCount", hr1.p(hr1.n(cls, new mx(1))));
        c = new cc5("reason", hr1.p(hr1.n(cls, new mx(3))));
    }

    public final void a(Object obj, Object obj2) {
        rn7 rn7 = (rn7) obj;
        js9 js9 = (js9) obj2;
        js9.e(b, rn7.a);
        js9.a(c, rn7.b);
    }
}
