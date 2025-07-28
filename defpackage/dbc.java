package defpackage;

/* renamed from: dbc  reason: default package */
public final class dbc implements t97 {
    public final s16 a;
    public volatile Object b = dr9.o;
    public final Object c = this;

    public dbc(s16 s16) {
        this.a = s16;
    }

    public final boolean a() {
        return this.b != dr9.o;
    }

    public final void b() {
        synchronized (this.c) {
            this.b = dr9.o;
        }
    }

    public final Object getValue() {
        Object obj;
        Object obj2 = this.b;
        dr9 dr9 = dr9.o;
        if (obj2 != dr9) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == dr9) {
                obj = this.a.invoke();
                this.b = obj;
            }
        }
        return obj;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
