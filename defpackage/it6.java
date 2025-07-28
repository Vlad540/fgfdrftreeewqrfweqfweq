package defpackage;

import java.util.AbstractMap;

/* renamed from: it6  reason: default package */
public final class it6 extends ws6 {
    public final /* synthetic */ jt6 c;

    public it6(jt6 jt6) {
        this.c = jt6;
    }

    public final boolean f() {
        return true;
    }

    public final Object get(int i) {
        jt6 jt6 = this.c;
        return new AbstractMap.SimpleImmutableEntry(jt6.o.X.a().get(i), jt6.o.Y.get(i));
    }

    public final int size() {
        return this.c.o.Y.size();
    }
}
