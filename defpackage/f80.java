package defpackage;

/* renamed from: f80  reason: default package */
public final class f80 implements is9 {
    public static final f80 a = new Object();
    public static final cc5 b;
    public static final cc5 c;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, f80] */
    static {
        Class<shb> cls = shb.class;
        b = new cc5("startMs", hr1.p(hr1.n(cls, new mx(1))));
        c = new cc5("endMs", hr1.p(hr1.n(cls, new mx(2))));
    }

    public final void a(Object obj, Object obj2) {
        jje jje = (jje) obj;
        js9 js9 = (js9) obj2;
        js9.e(b, jje.a);
        js9.e(c, jje.b);
    }
}
