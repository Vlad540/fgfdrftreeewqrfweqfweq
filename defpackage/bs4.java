package defpackage;

import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: bs4  reason: default package */
public abstract class bs4 {
    public final ou3 a;
    public final grd b;
    public final grd c;
    public final hcd d = icd.b(0, 0, 0, 7);
    public final hcd e = icd.b(0, 0, 0, 7);
    public final pj5 f;
    public final t97 g;
    public final t97 h;
    public final grd i;
    public final grd j;
    public es4 k;
    public final AtomicLong l;
    public final AtomicLong m;

    public bs4(ou3 ou3) {
        this.a = ou3;
        t97 d2 = z7b.a.d();
        grd a2 = hrd.a((Object) null);
        this.b = a2;
        grd a3 = hrd.a(hw4.a);
        this.c = a3;
        this.f = ez3.J(new v11(new ik5(a2, 2), a3, new z9(3, (Continuation) null, 10), 4), ((pae) d2.getValue()).a());
        this.g = ez3.O(3, new xd3(20));
        this.h = ez3.O(3, new xd3(21));
        this.i = hrd.a((Object) null);
        grd a4 = hrd.a((Object) null);
        this.j = a4;
        this.l = new AtomicLong();
        this.m = new AtomicLong();
        ez3.N(ez3.J(new ck5(a4, new zr4(this, (Continuation) null), 5), ((pae) d2.getValue()).a()), ou3);
    }

    public abstract void a(int i2);

    public abstract void b();

    public final ds4 c() {
        return (ds4) this.h.getValue();
    }

    public abstract boolean d();

    public abstract long e();

    public final ur4 f() {
        return (ur4) this.g.getValue();
    }

    public abstract void g(int i2);

    public abstract Object h(String str, RectF rectF, Continuation continuation);

    public abstract jue i();

    public abstract void j();

    public abstract void k();

    public abstract Object l(Continuation continuation);

    public abstract void m(int i2, String str);
}
