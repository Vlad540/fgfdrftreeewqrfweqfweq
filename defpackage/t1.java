package defpackage;

/* renamed from: t1  reason: default package */
public abstract class t1 implements t67 {
    public abstract void a(String str);

    public void c0() {
        a("null");
    }

    public final void d(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Numeric value to be finite but was " + d);
        }
        a(Double.toString(d));
    }
}
