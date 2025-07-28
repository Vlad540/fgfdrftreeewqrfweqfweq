package defpackage;

/* renamed from: z70  reason: default package */
public final class z70 implements is9 {
    public static final z70 a = new Object();
    public static final cc5 b;
    public static final cc5 c;

    /* JADX WARNING: type inference failed for: r0v0, types: [z70, java.lang.Object] */
    static {
        Class<shb> cls = shb.class;
        b = new cc5("logSource", hr1.p(hr1.n(cls, new mx(1))));
        c = new cc5("logEventDropped", hr1.p(hr1.n(cls, new mx(2))));
    }

    public final void a(Object obj, Object obj2) {
        wn7 wn7 = (wn7) obj;
        js9 js9 = (js9) obj2;
        js9.a(b, wn7.a);
        js9.a(c, wn7.b);
    }
}
