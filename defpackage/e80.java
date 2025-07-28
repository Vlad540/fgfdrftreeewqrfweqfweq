package defpackage;

/* renamed from: e80  reason: default package */
public final class e80 implements is9 {
    public static final e80 a = new Object();
    public static final cc5 b;
    public static final cc5 c;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, e80] */
    static {
        Class<shb> cls = shb.class;
        b = new cc5("currentCacheSizeBytes", hr1.p(hr1.n(cls, new mx(1))));
        c = new cc5("maxCacheSizeBytes", hr1.p(hr1.n(cls, new mx(2))));
    }

    public final void a(Object obj, Object obj2) {
        bzd bzd = (bzd) obj;
        js9 js9 = (js9) obj2;
        js9.e(b, bzd.a);
        js9.e(c, bzd.b);
    }
}
