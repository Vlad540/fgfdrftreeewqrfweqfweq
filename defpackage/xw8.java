package defpackage;

/* renamed from: xw8  reason: default package */
public abstract class xw8 {
    public static final hnc a;

    static {
        bve bve = new bve("messages-list-scope");
        hnc hnc = at7.w0;
        if (hnc != null) {
            bve.c.add(hnc);
            bve.e(vw8.class, new ja7(20));
            bve.e(ww8.class, new ho7(7));
            bve.e(y76.class, new ho7(8));
            bve.e(h29.class, new ho7(9));
            a = bve.a();
            return;
        }
        throw new IllegalArgumentException("Trying to access DI graph before initialization!".toString());
    }
}
