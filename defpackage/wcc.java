package defpackage;

import java.lang.ref.SoftReference;

/* renamed from: wcc  reason: default package */
public abstract class wcc implements wy6 {
    public SoftReference a;

    public final Object a(w4 w4Var) {
        SoftReference softReference = this.a;
        SoftReference softReference2 = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            obj = b(w4Var);
            if (obj != null) {
                softReference2 = new SoftReference(obj);
            }
            this.a = softReference2;
        }
        return obj;
    }

    public abstract Object b(w4 w4Var);
}
