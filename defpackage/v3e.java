package defpackage;

/* renamed from: v3e  reason: default package */
public final class v3e implements p3e {
    public static final d93 c = new d93(5);
    public volatile p3e a;
    public Object b;

    public final Object get() {
        p3e p3e = this.a;
        d93 d93 = c;
        if (p3e != d93) {
            synchronized (this) {
                try {
                    if (this.a != d93) {
                        Object obj = this.a.get();
                        this.b = obj;
                        this.a = d93;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.b;
    }

    public final String toString() {
        Object obj = this.a;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == c) {
            obj = "<supplier that returned " + this.b + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
