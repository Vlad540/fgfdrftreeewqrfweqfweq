package defpackage;

/* renamed from: a1g  reason: default package */
public final class a1g implements c1g {
    public static final Object c = new Object();
    public volatile c1g a;
    public volatile Object b;

    /* JADX WARNING: type inference failed for: r0v1, types: [a1g, c1g, java.lang.Object] */
    public static c1g a(c1g c1g) {
        if (c1g instanceof a1g) {
            return c1g;
        }
        ? obj = new Object();
        obj.b = c;
        obj.a = c1g;
        return obj;
    }

    public final Object n() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == obj2) {
                        obj = this.a.n();
                        Object obj3 = this.b;
                        if (obj3 != obj2) {
                            if (obj3 != obj) {
                                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                            }
                        }
                        this.b = obj;
                        this.a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
