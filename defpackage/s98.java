package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.view.Surface;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: s98  reason: default package */
public final class s98 implements ya9 {
    public final g15 X;
    public final j2b Y;
    public final h30 Z;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashSet c = new HashSet();
    public final Context o;
    public final ed3 w0;
    public final oa7 x0;
    public final jwa y0;
    public final f35 z0;

    public s98(Context context, g15 g15, j2b j2b, nb9 nb9, h30 h30, ed3 ed3, oa7 oa7, tf4 tf4, tg tgVar, to8 to8, l8f l8f, mbe mbe, r10 r10, fp fpVar, tt0 tt0, t52 t52, f35 f35) {
        nb9 nb92 = nb9;
        this.o = context;
        this.X = g15;
        this.Y = j2b;
        this.Z = h30;
        this.w0 = ed3;
        this.x0 = oa7;
        this.z0 = f35;
        jwa jwa = r3;
        jwa jwa2 = new jwa(context, oa7, tf4, j2b, tgVar, to8, l8f, mbe, new mn(20, new hy5(21, this)), r10, (swa) fpVar.n.getValue(), tt0, t52, g15);
        this.y0 = jwa;
        synchronized (nb92.o) {
            nb92.o.add(this);
        }
    }

    public final void a(long j, m68 m68) {
    }

    public final void b(long j, m68 m68) {
    }

    public final void c(long j, m68 m68, long j2, m68 m682) {
    }

    public final void d(long j, m68 m68) {
    }

    public final void e(long j, m68 m68, long j2) {
    }

    public final void f(long j, m68 m68) {
    }

    public final void g(long j, m68 m68) {
    }

    public final void h(long j, m68 m68) {
        HashMap hashMap = this.b;
        q98 q98 = (q98) hashMap.get(t98.c);
        if (q98 != null) {
            if (p()) {
                al7 al7 = (al7) q98;
                if (al7.i) {
                    al7.u();
                }
            }
            ((al7) q98).m();
        }
        q98 q982 = (q98) hashMap.get(t98.o);
        if (q982 != null) {
            ((al7) q982).m();
        }
    }

    public final void i(long j, m68 m68) {
    }

    public final void j(long j, m68 m68) {
    }

    public final void k(q98 q98) {
        if (!this.c.contains(q98)) {
            l((al7) q98);
            return;
        }
        throw new IllegalStateException("mediaPlayerController binded to lifecycleOwner -> you can't change lifecycle manually.");
    }

    public final void l(al7 al7) {
        p98 p98;
        udd.p("s98", "attachInternal %s", new Object[]{al7.a});
        HashMap hashMap = this.b;
        t98 t98 = al7.a;
        al7 al72 = (al7) hashMap.get(t98);
        if (!(al72 == null || al72 == al7 || (p98 = al72.e) == null)) {
            p98.W0();
        }
        hashMap.put(t98, al7);
    }

    public final al7 m(t98 t98, z40 z40) {
        t98 t982 = t98;
        z40 z402 = z40;
        HashMap hashMap = this.b;
        al7 al7 = (al7) hashMap.get(t982);
        if (al7 != null) {
            p98 p98 = al7.e;
            if (p98 != null) {
                p98.W0();
            }
            al7.g = null;
        }
        HashMap hashMap2 = this.a;
        n35 n35 = (n35) hashMap2.get(t982);
        if (n35 == null) {
            n35 = new n35(this.o, this.X, this.z0, this.x0, this.Y.a);
            hashMap2.put(t982, n35);
        }
        al7 al72 = new al7(t98, n35, this, this.o, z402.a ? 1.0f : 0.0f, z402.b, z402.c);
        hashMap.put(t982, al72);
        return al72;
    }

    public final void n(q98 q98) {
        if (!this.c.contains(q98)) {
            al7 al7 = (al7) q98;
            udd.p("s98", "detachInternal %s", new Object[]{al7.a});
            p98 p98 = al7.e;
            if (p98 != null) {
                p98.W0();
                return;
            }
            return;
        }
        throw new IllegalStateException("mediaPlayerController binded to lifecycleOwner -> you can't change lifecycle manually.");
    }

    public final void o(q98 q98) {
        q98 q982;
        fd9 fd9;
        al7 al7 = (al7) q98;
        t98 t98 = al7.a;
        t98 t982 = t98.c;
        if (t98 == t982) {
            boolean k = al7.k();
            jwa jwa = this.y0;
            if (k) {
                fd9 fd92 = jwa.F0;
                if (fd92 != null) {
                    fd92.pause();
                }
            } else {
                u2f u2f = jwa.F0 == null ? null : ((al7) ((q98) jwa.y0.get())).f;
                u2f u2f2 = al7.f;
                if (!(u2f == null || u2f2 == null || !r1g.c(u2f.l().toString(), u2f2.l().toString()) || (fd9 = jwa.F0) == null)) {
                    fd9.pause();
                }
            }
        } else if (t98 == t98.o && (q982 = (q98) this.b.get(t982)) != null) {
            u2f u2f3 = al7.f;
            al7 al72 = (al7) q982;
            u2f u2f4 = al72.f;
            if (u2f3 != null && u2f4 != null && r1g.c(u2f3.l().toString(), u2f4.l().toString())) {
                al72.m();
            } else if (!p() || !al72.i) {
                al72.m();
            } else {
                al72.u();
            }
        }
        if (al7.k()) {
            h30 h30 = this.Z;
            h30.getClass();
            udd.q("h30", "pause");
            nb9 nb9 = h30.c;
            if (nb9.x) {
                nb9.q();
            }
            r7e r7e = h30.y0;
            if (r7e.a()) {
                h30.o((PowerManager.WakeLock) r7e.getValue(), 0);
            }
        }
    }

    public final boolean p() {
        ed3 ed3 = this.w0;
        boolean g = ed3.g();
        wd3 b2 = ed3.b();
        j2b j2b = this.Y;
        int i = j2b.c.g.getInt("app.video.auto.play", 1);
        if (i != -1) {
            return i != 0 ? b2 == wd3.c : b2 == wd3.c || j2b.c.m() || !g;
        }
        return false;
    }

    public final void r(q98 q98) {
        if (!this.c.contains(q98)) {
            s((al7) q98);
            return;
        }
        throw new IllegalStateException("mediaPlayerController binded to lifecycleOwner -> you can't change lifecycle manually.");
    }

    public final void s(al7 al7) {
        udd.p("s98", "releaseInternal %s", new Object[]{al7.a});
        this.c.remove(al7);
        u2f u2f = al7.f;
        t98 t98 = al7.a;
        if (!(u2f == null || al7.g == null)) {
            udd.p("al7", "Release %s", new Object[]{t98});
            al7.g = null;
            p98 p98 = al7.e;
            if (p98 != null) {
                p98.W0();
            }
            n35 n35 = al7.b;
            n35.D();
            n35.u();
            udd.q("n35", "Clear");
            tgd tgd = n35.a;
            tgd.Z1();
            m45 m45 = tgd.c;
            m45.s2();
            m45.m2((Surface) null);
            m45.i2(0, 0);
            n35.Y = null;
            n35.Z = null;
            n35.w0 = 0.0f;
            n35.x0 = null;
            n35.y0 = 0;
            n35.z0 = 0;
            n35.A0 = 0;
            n35.B0 = false;
            al7.o();
        }
        HashMap hashMap = this.b;
        q98 q98 = (q98) hashMap.get(t98);
        if (q98 == al7) {
            hashMap.remove(((al7) q98).a);
        }
    }
}
