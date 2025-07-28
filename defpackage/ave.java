package defpackage;

import java.io.Serializable;

/* renamed from: ave  reason: default package */
public final class ave implements t97, Serializable {
    public s16 a;
    public Object b;

    public final boolean a() {
        return this.b != s59.X;
    }

    public final Object getValue() {
        if (this.b == s59.X) {
            this.b = this.a.invoke();
            this.a = null;
        }
        return this.b;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
