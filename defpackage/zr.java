package defpackage;

/* renamed from: zr  reason: default package */
public abstract class zr {
    public static final int a;

    static {
        Object obj;
        try {
            obj = o0e.G(System.getProperty("kotlinx.serialization.json.pool.size"));
        } catch (Throwable th) {
            obj = new kcc(th);
        }
        if (obj instanceof kcc) {
            obj = null;
        }
        Integer num = (Integer) obj;
        a = num != null ? num.intValue() : 2097152;
    }
}
