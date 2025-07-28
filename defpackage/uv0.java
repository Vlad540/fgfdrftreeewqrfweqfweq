package defpackage;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: uv0  reason: default package */
public final class uv0 {
    public static final LinkedHashSet l;
    public final ed5 a;
    public final h30 b;
    public final luf c;
    public final hvf d;
    public final of3 e;
    public final qmc f;
    public final qmc g;
    public final tv0 h;
    public final AtomicBoolean i = new AtomicBoolean();
    public volatile uu9 j;
    public volatile sv0 k;

    static {
        LinkedList linkedList = new LinkedList(Arrays.asList(xv0.values()));
        linkedList.remove(xv0.a);
        l = new LinkedHashSet(linkedList);
    }

    public uv0(ed5 ed5, h30 h30, hvf hvf, luf luf, qmc qmc, qmc qmc2, of3 of3, tv0 tv0) {
        this.a = ed5;
        this.b = h30;
        this.c = luf;
        this.h = tv0;
        this.d = hvf;
        this.e = of3;
        this.f = qmc;
        this.g = qmc2;
    }

    public final void a(c97 c97) {
        try {
            this.e.accept(c97);
        } catch (Throwable th) {
            udd.s("uv0", "updateData: failed to accept disposable", th);
        }
    }

    public final void b() {
        nu9 n = c().r(this.f).n(this.g);
        c97 c97 = new c97(new qv0(this, 0), new ak0(6), z3d.i);
        n.a(c97);
        a(c97);
    }

    public final synchronized ms9 c() {
        if (this.j != null) {
            return this.j;
        }
        ms9 n = new mhd(new mv9(2, new m5(2, this)), new qv0(this, 6), 2).n();
        qv0 qv0 = new qv0(this, 7);
        gf6 gf6 = z3d.j;
        this.j = new uu9(new ru9(new ts9(new kt9(n, gf6, qv0, z3d.i), gf6, new f5(3, this), 2)));
        return this.j;
    }
}
