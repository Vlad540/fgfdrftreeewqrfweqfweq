package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: gq2  reason: default package */
public final class gq2 implements og6 {
    public static final List f = Collections.singletonList(new Object());
    public final r7e b;
    public final r7e c;
    public final yz d = new yz(13);
    public final yz e = new yz(14);

    public gq2(r7e r7e, t97 t97) {
        this.b = new r7e(new qo1(r7e, t97, this, 1));
        this.c = new r7e(new qo1(r7e, t97, this, 2));
    }

    public final boolean a() {
        return false;
    }

    public final Comparator c() {
        return this.d;
    }

    public final Comparator e() {
        return this.e;
    }

    public final long g() {
        return ((Number) this.b.getValue()).longValue();
    }

    public final long h() {
        return ((Number) this.c.getValue()).longValue();
    }

    public final List i() {
        return f;
    }
}
