package defpackage;

/* renamed from: cf4  reason: default package */
public final class cf4 extends bm3 {
    public final void G(Object obj, float f) {
        df4 df4 = (df4) obj;
        df4.D0.b = f / 10000.0f;
        df4.invalidateSelf();
    }

    public final float o(Object obj) {
        return ((df4) obj).D0.b * 10000.0f;
    }
}
