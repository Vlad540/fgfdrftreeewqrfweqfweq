package defpackage;

/* renamed from: d58  reason: default package */
public abstract class d58 {
    public static final hnc a;

    static {
        bve bve = new bve("media-gallery-scope");
        hnc hnc = at7.w0;
        if (hnc != null) {
            bve.c.add(hnc);
            a = bve.a();
            return;
        }
        throw new IllegalArgumentException("Trying to access DI graph before initialization!".toString());
    }
}
