package defpackage;

/* renamed from: f0e  reason: default package */
public abstract class f0e extends dl {
    public final Object b;

    public f0e(String str, String str2) {
        super(str);
        this.b = str2;
    }

    public final void d(t67 t67) {
        Object obj = this.b;
        if (obj == null || ((CharSequence) obj).length() == 0) {
            t67.getClass();
            return;
        }
        t67.g0(this.a);
        ((t1) t67).i((String) obj);
    }

    public final String toString() {
        return this.a + " = " + this.b;
    }
}
