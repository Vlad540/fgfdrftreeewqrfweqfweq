package defpackage;

import java.io.Serializable;

/* renamed from: r7e  reason: default package */
public final class r7e implements t97, Serializable {
    public s16 a;
    public volatile Object b = s59.X;
    public final Object c = this;

    public r7e(s16 s16) {
        this.a = s16;
    }

    public final boolean a() {
        return this.b != s59.X;
    }

    public final Object getValue() {
        Object obj;
        Object obj2 = this.b;
        s59 s59 = s59.X;
        if (obj2 != s59) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == s59) {
                obj = this.a.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
