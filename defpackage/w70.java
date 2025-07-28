package defpackage;

/* renamed from: w70  reason: default package */
public final class w70 implements is9 {
    public static final w70 a = new Object();
    public static final cc5 b;
    public static final cc5 c;
    public static final cc5 d;
    public static final cc5 e;

    /* JADX WARNING: type inference failed for: r0v0, types: [w70, java.lang.Object] */
    static {
        Class<shb> cls = shb.class;
        b = new cc5("window", hr1.p(hr1.n(cls, new mx(1))));
        c = new cc5("logSourceMetrics", hr1.p(hr1.n(cls, new mx(2))));
        d = new cc5("globalMetrics", hr1.p(hr1.n(cls, new mx(3))));
        e = new cc5("appNamespace", hr1.p(hr1.n(cls, new mx(4))));
    }

    public final void a(Object obj, Object obj2) {
        e03 e03 = (e03) obj;
        js9 js9 = (js9) obj2;
        js9.a(b, e03.a);
        js9.a(c, e03.b);
        js9.a(d, e03.c);
        js9.a(e, e03.d);
    }
}
