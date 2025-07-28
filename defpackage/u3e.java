package defpackage;

import java.io.Serializable;

/* renamed from: u3e  reason: default package */
public final class u3e implements p3e, Serializable {
    public final p3e a;
    public volatile transient boolean b;
    public transient Object c;

    public u3e(p3e p3e) {
        this.a = p3e;
    }

    public final Object get() {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        Object obj = this.a.get();
                        this.c = obj;
                        this.b = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.b) {
            obj = "<supplier that returned " + this.c + ">";
        } else {
            obj = this.a;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
