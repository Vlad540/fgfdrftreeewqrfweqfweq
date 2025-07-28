package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: fgb  reason: default package */
public final class fgb extends taf {
    public static final /* synthetic */ k77[] X0;
    public final t97 A0;
    public final t97 B0;
    public final t97 C0;
    public final d4b D0;
    public final l05 E0 = new l05(0);
    public final l05 F0 = new l05(0);
    public final e3 G0 = hwf.t();
    public final e3 H0 = hwf.t();
    public final e3 I0 = hwf.t();
    public final e3 J0 = hwf.t();
    public final t97 K0 = ez3.O(3, new k6b(12));
    public final t97 L0 = ez3.O(3, new k6b(13));
    public final t97 M0 = ez3.O(3, new k6b(14));
    public final grd N0;
    public final t0c O0;
    public final grd P0;
    public final t0c Q0;
    public final grd R0;
    public final t0c S0;
    public final h5b T0;
    public final AtomicReference U0;
    public final Context V0;
    public boolean W0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final r6b b;
    public final t97 c;
    public final t97 o;
    public final pab w0;
    public final t97 x0;
    public final t97 y0;
    public final t97 z0;

    static {
        Class<fgb> cls = fgb.class;
        X0 = new k77[]{new hc9(cls, "leaveChatJob", "getLeaveChatJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "attacheClickJob", "getAttacheClickJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "openCallJob", "getOpenCallJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "linkInterceptJob", "getLinkInterceptJob()Lkotlinx/coroutines/Job;")};
    }

    public fgb(long j, r6b r6b, boolean z) {
        h5b h5b;
        this.b = r6b;
        String name = fgb.class.getName();
        i6b i6b = i6b.a;
        r7e e = i6b.e();
        this.c = i6b.c();
        this.o = i6b.getAccessor().d(y8c.class);
        this.X = i6b.getAccessor().d(luf.class);
        this.Y = i6b.f();
        this.Z = i6b.getAccessor().d(oec.class);
        pab pab = (pab) i6b.getAccessor().c(pab.class);
        this.w0 = pab;
        this.x0 = i6b.getAccessor().d(qna.class);
        this.y0 = i6b.d();
        this.z0 = i6b.getAccessor().d(xzc.class);
        this.A0 = i6b.getAccessor().d(mg5.class);
        this.B0 = i6b.getAccessor().d(ef7.class);
        this.C0 = i6b.getAccessor().d(gg7.class);
        this.D0 = new d4b((bd) i6b.getAccessor().c(bd.class), 1, (f03) i6b.getAccessor().c(f03.class));
        hw4 hw4 = hw4.a;
        grd a = hrd.a(hw4);
        this.N0 = a;
        this.O0 = new t0c(a);
        grd a2 = hrd.a(hw4);
        this.P0 = a2;
        this.Q0 = new t0c(a2);
        grd a3 = hrd.a((Object) null);
        this.R0 = a3;
        this.S0 = new t0c(a3);
        this.U0 = new AtomicReference();
        this.V0 = (Context) i6b.getAccessor().c(Context.class);
        udd.q(name, "inited by " + r6b + ":#" + j);
        int ordinal = r6b.ordinal();
        if (ordinal == 0) {
            i22 i22 = (i22) ((aw2) t()).m(j).a.getValue();
            tf3 k = i22 != null ? i22.k() : null;
            if (i22 == null || !i22.F()) {
                h5b = (i22 == null || !i22.J() || k == null) ? new dk2(j, this.a) : new ym3(k.n(), this.a, z);
            } else if (k != null) {
                h5b = new jp0(k.n(), this.a);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else if (ordinal == 1) {
            h5b = new h5b(j);
        } else if (ordinal == 2) {
            tf3 tf3 = (tf3) ((ap3) e.getValue()).c(j).a.getValue();
            h5b = (tf3 == null || !tf3.t()) ? new ym3(j, this.a, z) : new jp0(j, this.a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.T0 = h5b;
        ez3.N(ez3.J(new ck5(new ik5(h5b.e, 2), new lfb(this, (Continuation) null), 5), u().a()), this.a);
        ez3.N(new ck5(new s0c(pab.b), new mfb(this, (Continuation) null), 5), this.a);
    }

    public final void A() {
        taf.o(this.E0, new web(new hge(l8a.o0), new kfb(this, 0)));
    }

    public final void B() {
        xeb xeb;
        xeb xeb2;
        l5b l5b = (l5b) this.R0.getValue();
        Object obj = l5b != null ? l5b.e : null;
        if (obj == null) {
            obj = "";
        }
        int k = this.T0.k();
        if (k != 0) {
            q5b q5b = (q5b) this.L0.getValue();
            q5b.getClass();
            int t = hr1.t(k);
            if (t != 0) {
                if (t == 1) {
                    hge hge = new hge(l8a.L0);
                    hge hge2 = new hge(l8a.M0);
                    lg7 c2 = hwf.c();
                    c2.add(new kc3(j8a.B, new hge(l8a.K0), 1, false));
                    c2.add(q5b.b());
                    xeb2 = new xeb(hge, hge2, hwf.a(c2), (Bundle) null);
                } else if (t == 2) {
                    hge hge3 = new hge(l8a.J0);
                    hge hge4 = new hge(l8a.I0);
                    lg7 c3 = hwf.c();
                    c3.add(new kc3(j8a.r, new hge(l8a.h0), 1, false));
                    c3.add(new kc3(j8a.A, new hge(l8a.H0), 1, false));
                    c3.add(q5b.b());
                    xeb2 = new xeb(hge3, hge4, hwf.a(c3), (Bundle) null);
                } else if (t == 3) {
                    xeb = q5b.c();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                xeb = xeb2;
            } else {
                jge jge = new jge(l8a.N0, cs.g0(new Object[]{obj}));
                lg7 c4 = hwf.c();
                c4.add(new kc3(j8a.r, new hge(l8a.h0), 1, false));
                c4.add(new kc3(j8a.B, new hge(l8a.K0), 1, false));
                c4.add(q5b.b());
                xeb = new xeb(jge, (mge) null, hwf.a(c4), (Bundle) null);
            }
            taf.o(this.E0, xeb);
        }
    }

    public final void C(boolean z) {
        taf.o(this.E0, new web(new hge(z ? l8a.m0 : l8a.p0), new g91(this, z, 2)));
    }

    public final void D() {
        this.U0.set((Object) null);
        taf.o(this.E0, new bfb(new hge(l8a.X), Integer.valueOf(phc.J)));
    }

    public final void p() {
        this.T0.d();
        pab pab = this.w0;
        pab.a.f(pab);
        k77[] k77Arr = X0;
        k77 k77 = k77Arr[0];
        e3 e3Var = this.G0;
        g37 g37 = (g37) e3Var.T0(this, k77);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        e3Var.o1(this, k77Arr[0], (Object) null);
        k77 k772 = k77Arr[1];
        e3 e3Var2 = this.H0;
        g37 g372 = (g37) e3Var2.T0(this, k772);
        if (g372 != null) {
            g372.cancel((CancellationException) null);
        }
        e3Var2.o1(this, k77Arr[1], (Object) null);
    }

    public final void q() {
        Long i = this.T0.i();
        if (i != null) {
            taf.o(this.E0, new web(new hge(l8a.A0), new yo3(this, i.longValue(), 1)));
        }
    }

    public final String r() {
        String h = this.T0.h();
        if (h == null) {
            return "";
        }
        if (hhd.y()) {
            taf.o(this.E0, new bfb(new hge(l8a.q1), Integer.valueOf(phc.v)));
        }
        return h;
    }

    public final void s() {
        Long i;
        if (!this.W0 && (i = this.T0.i()) != null) {
            long longValue = i.longValue();
            this.W0 = true;
            hu3 plus = u().b().plus(sk9.a);
            rfb rfb = new rfb(this, longValue, (Continuation) null);
            xs7.D(this.a, plus, ru3.c, rfb);
        }
    }

    public final bv2 t() {
        return (bv2) this.c.getValue();
    }

    public final pae u() {
        return (pae) this.Y.getValue();
    }

    public final void v(String str) {
        qod D = xs7.D(this.a, u().b(), ru3.b, new sfb(this, str, (Continuation) null));
        this.J0.o1(this, X0[3], D);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [l7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [k7c, java.lang.Object] */
    public final void w(boolean z) {
        ? obj = new Object();
        h5b h5b = this.T0;
        r6b l = h5b.l();
        if (l != null) {
            obj.a = l;
            ? obj2 = new Object();
            obj2.a = h5b.m();
            qod n = taf.n(this, (hu3) null, ru3.b, new yfb(obj, obj2, this, z, (Continuation) null), 1);
            this.I0.o1(this, X0[2], n);
        }
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [a07, java.lang.Object] */
    public final void x(int i, String str, sf7 sf7) {
        String str2;
        h5b h5b = this.T0;
        char c2 = 4;
        boolean z = h5b.p() ? true : h5b instanceof jp0 ? true : h5b.r() ? true : true;
        long m = h5b.m();
        d4b d4b = this.D0;
        d4b.getClass();
        int t = hr1.t(bm3.u(str) ? 3 : bm3.v(str) ? 2 : 1);
        if (t != 0) {
            if (t == 1) {
                c2 = 3;
            } else if (t == 2) {
                c2 = 2;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (sf7 != sf7.X) {
            c2 = 1;
        }
        int i2 = 1;
        if (c2 != 1) {
            i2 = 2;
            if (c2 != 2) {
                i2 = 3;
                if (c2 != 3) {
                    i2 = 4;
                    if (c2 != 4) {
                        throw null;
                    }
                }
            }
        }
        wia wia = new wia("element_type", Integer.valueOf(i2));
        wia wia2 = new wia("source_id", Long.valueOf(m));
        int i3 = 1;
        if (!z) {
            i3 = 2;
            if (!z) {
                i3 = 3;
                if (!z) {
                    i3 = 4;
                    if (!z) {
                        throw null;
                    }
                }
            }
        }
        Map T = ju7.T(new wia[]{wia, wia2, new wia("source_type", Integer.valueOf(i3))});
        ? obj = new Object();
        obj.a = System.currentTimeMillis();
        obj.c = "CHAT_PROFILE_CLICKABLE_ELEMENT_ACTIONS";
        if (i == 1) {
            str2 = "clicked_clickable_element";
        } else if (i == 2) {
            str2 = "clicked_open_context_menu";
        } else if (i == 3) {
            str2 = "clicked_copy";
        } else if (i == 4) {
            str2 = "clicked_in_context_menu";
        } else {
            throw null;
        }
        obj.o = str2;
        f03 f03 = (f03) d4b.c;
        obj.b = ((lqc) f03).s();
        obj.c(T);
        obj.X = ((i03) f03).D();
        ((bd) d4b.b).j(obj.d());
    }

    public final void y() {
        if (!((qna) this.x0.getValue()).b(qna.l)) {
            taf.o(this.E0, ueb.a);
            return;
        }
        xs7.E(this.a, u().b(), (ru3) null, new bgb(this, (Continuation) null), 2);
    }

    public final void z() {
        this.U0.set((Object) null);
        taf.o(this.E0, new bfb(new hge(l8a.X), Integer.valueOf(phc.J)));
    }
}
