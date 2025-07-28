package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: f8c  reason: default package */
public final class f8c extends ws6 {
    public final /* synthetic */ g8c c;

    public f8c(g8c g8c) {
        this.c = g8c;
    }

    public final boolean f() {
        return true;
    }

    public final Object get(int i) {
        g8c g8c = this.c;
        a06.k(i, g8c.Z);
        int i2 = i * 2;
        int i3 = g8c.Y;
        Object[] objArr = g8c.X;
        Object obj = objArr[i2 + i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.c.Z;
    }
}
