package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: pv5  reason: default package */
public final class pv5 implements mua {
    public final Set a;
    public final lw5 b;
    public final j54 c;
    public final Long d;
    public final boolean e;
    public final Context f;
    public final t97 g;
    public final t97 h;
    public final t97 i;
    public final t97 j;
    public final t97 k;
    public final t97 l;
    public final grd m;
    public final t0c n;
    public List o = hw4.a;
    public final hcd p;
    public final s0c q;
    public final qe4 r;
    public final grd s;
    public final t0c t;
    public final t97 u;
    public final t97 v;
    public ou3 w;
    public boolean x;

    public pv5(Set set, lw5 lw5, j54 j54, Long l2, boolean z, Context context, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976) {
        this.a = set;
        this.b = lw5;
        this.c = j54;
        this.d = l2;
        this.e = z;
        this.f = context;
        this.g = t97;
        this.h = t972;
        this.i = t973;
        this.j = t974;
        this.k = t975;
        this.l = t976;
        grd a2 = hrd.a((Object) null);
        this.m = a2;
        this.n = new t0c(a2);
        hcd b2 = icd.b(0, Integer.MAX_VALUE, 2, 1);
        this.p = b2;
        this.q = new s0c(b2);
        this.r = new qe4(17);
        grd a3 = hrd.a(Boolean.TRUE);
        this.s = a3;
        this.t = new t0c(a3);
        this.u = ez3.O(3, new lv5(this, 0));
        this.v = ez3.O(3, new lv5(this, 1));
        if (!(!set.isEmpty())) {
            throw new IllegalStateException("You must specify messages to forward!".toString());
        }
    }

    public final void a() {
        this.w = null;
    }

    public final void b(zta zta) {
        ((AtomicReference) this.c.X).updateAndGet(new zx0(10, zta));
    }

    public final void c(ou3 ou3) {
        this.w = ou3;
        xs7.E(ou3, ((pae) this.g.getValue()).b(), (ru3) null, new ov5(this, (Continuation) null), 2);
    }

    public final void d() {
        ((AtomicReference) this.c.X).updateAndGet(new pb2(8));
    }

    public final void e(long j2) {
        ((AtomicReference) this.c.X).updateAndGet(new axc(j2));
    }

    public final void f() {
        t97 t97 = this.l;
        if (!((f03) t97.getValue()).g.getBoolean("app.onboarding.author_visibility", false)) {
            this.p.g(tv5.a);
            ((f03) t97.getValue()).i("app.onboarding.author_visibility", true);
        }
    }

    public final Drawable g() {
        return ((Boolean) this.s.getValue()).booleanValue() ? (Drawable) this.u.getValue() : (Drawable) this.v.getValue();
    }

    public final void h(CharSequence charSequence, Set set, boolean z) {
        Object obj;
        if (!set.isEmpty() && !this.x) {
            boolean z2 = true;
            this.x = true;
            Object U = o23.U(set);
            ((Number) U).longValue();
            yta yta = null;
            if (set.size() != 1) {
                U = null;
            }
            Long l2 = (Long) U;
            if (l2 == null || z) {
                if (l2 != null) {
                    Iterator it = ((Set) ((AtomicReference) this.c.X).get()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((zta) obj).a == l2.longValue()) {
                            break;
                        }
                    }
                    zta zta = (zta) obj;
                    if (zta != null) {
                        yta = zta.b;
                    }
                    if (yta != yta.a && this.d == null) {
                        z2 = false;
                    }
                }
                boolean z3 = z2;
                ou3 ou3 = this.w;
                if (ou3 != null) {
                    xs7.D(ou3, sk9.a.plus(((pae) this.g.getValue()).a()), ru3.c, new nv5(this, charSequence, set, z3, l2, (Continuation) null));
                    return;
                }
                return;
            }
            this.p.g(new qv5(l2, this.a, this.d, this.e, (gv5) null, 16));
        }
    }
}
