package defpackage;

/* renamed from: ebc  reason: default package */
public final class ebc implements t97 {
    public s16 a;
    public Object b;

    public final boolean a() {
        return this.b != smc.Y;
    }

    public final Object getValue() {
        if (this.b == smc.Y) {
            this.b = this.a.invoke();
        }
        return this.b;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
