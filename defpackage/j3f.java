package defpackage;

import java.util.HashMap;

/* renamed from: j3f  reason: default package */
public final class j3f {
    public final u98 a;
    public final l3f b;
    public final bf5 c;
    public final bd d;
    public final xmc e;
    public final qmc f;
    public final vmc g;
    public final zef h = new zef();
    public final HashMap i = new HashMap();

    public j3f(u98 u98, l3f l3f, bf5 bf5, bd bdVar, xmc xmc, qmc qmc, vmc vmc) {
        this.a = u98;
        this.b = l3f;
        this.c = bf5;
        this.d = bdVar;
        this.e = xmc;
        this.f = qmc;
        this.g = vmc;
    }

    public final synchronized void a(a3f a3f) {
        this.i.remove(a3f);
        iu7.a0(new w63(this.b.a(), 2, new g3f(a3f, 2)).l(), z3d.j, new g3f(a3f, 0), new f5(21, a3f));
    }
}
