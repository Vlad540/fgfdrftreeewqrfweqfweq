package defpackage;

/* renamed from: v97  reason: default package */
public final class v97 implements jib {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile jib b;

    public v97(jib jib) {
        this.b = jib;
    }

    public final Object get() {
        Object obj = this.a;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.a;
                    if (obj == obj2) {
                        obj = this.b.get();
                        this.a = obj;
                        this.b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
