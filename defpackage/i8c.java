package defpackage;

import java.util.Objects;

/* renamed from: i8c  reason: default package */
public final class i8c extends ws6 {
    public final transient int X;
    public final transient Object[] c;
    public final transient int o;

    public i8c(int i, int i2, Object[] objArr) {
        this.c = objArr;
        this.o = i;
        this.X = i2;
    }

    public final boolean f() {
        return true;
    }

    public final Object get(int i) {
        a06.k(i, this.X);
        Object obj = this.c[(i * 2) + this.o];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return this.X;
    }
}
