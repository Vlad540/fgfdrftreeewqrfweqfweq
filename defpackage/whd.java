package defpackage;

/* renamed from: whd  reason: default package */
public abstract class whd implements wy6 {
    public volatile Object a = gt0.g;

    public final Object a(w4 w4Var) {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = gt0.g;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.a;
            if (obj == obj3) {
                obj = b(w4Var);
                this.a = obj;
            }
        }
        return obj;
    }

    public abstract Object b(w4 w4Var);
}
