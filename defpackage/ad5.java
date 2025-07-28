package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.fragment.app.a;
import java.util.Collections;
import java.util.Objects;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: ad5  reason: default package */
public final class ad5 {
    public final Context a;
    public final kae b = oae.b();
    public final FrgBase c;
    public Object d;
    public final bd e;
    public final luf f;
    public final mg5 g;
    public long h;
    public long i;
    public String j;
    public boolean k;
    public int l;
    public boolean m;
    public pn1 n;
    public final c97 o;
    public final to8 p;

    public ad5(bd bdVar, luf luf, mg5 mg5, Context context, FrgBase frgBase, ms9 ms9, to8 to8) {
        this.a = context;
        this.c = frgBase;
        vl.b().p().getClass();
        new og0(848);
        this.e = bdVar;
        this.f = luf;
        this.g = mg5;
        this.p = to8;
        g95 g95 = new g95(28);
        ms9.getClass();
        c97 c97 = new c97(new xc5(this, 1), z3d.k, z3d.i);
        Objects.requireNonNull(c97, "observer is null");
        try {
            ms9.a(new st9(c97, g95, 0));
            this.o = c97;
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            ek8.a0(th);
            xs7.F(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final boolean a() {
        return this.d != null;
    }

    public final void b(xm8 xm8, o10 o10, a aVar, boolean z, boolean z2, int i2) {
        xm8 xm82 = xm8;
        o10 o102 = o10;
        boolean z3 = z2;
        if (xm82.a.w()) {
            this.j = null;
            this.k = false;
            this.m = false;
            this.l = 0;
            this.h = 0;
            if (!z3 || !ete.L(o10) || o102.n.c()) {
                boolean e2 = o102.n.e();
                to8 to8 = this.p;
                vo8 vo8 = xm82.a;
                v00 v00 = o102.j;
                String str = o102.q;
                if (!e2) {
                    g10 g10 = o102.n;
                    if (!g10.a() && !g10.b()) {
                        if (g10.c()) {
                            c(xm82, o102, z3);
                            return;
                        } else if (!g10.d()) {
                            return;
                        } else {
                            if (v00.a == 0) {
                                long j2 = vo8.x0;
                                xhd xhd = md4.o;
                                this.f.a(new j0d(j2, Collections.singletonList(Long.valueOf(vo8.b)), (j63) null, true, vo8.Y0));
                                return;
                            }
                            to8.u(vo8, str, g10.b);
                            return;
                        }
                    }
                }
                this.e.f("ACTION_FILE_DOWNLOAD");
                this.k = z;
                this.j = str;
                this.m = z3;
                this.l = i2;
                if (urd.j(this.a, urd.v())) {
                    to8.u(vo8, str, g10.X);
                    pk c2 = ((nqc) this.b).c();
                    long j3 = v00.a;
                    long j4 = vo8.b;
                    this.h = ((gy9) c2).x(v00.c, o102.q, j3, j4);
                    return;
                }
                urd.I(aVar, urd.v(), 167);
                return;
            }
            c(xm82, o102, true);
        }
    }

    public final void c(xm8 xm8, o10 o10, boolean z) {
        zc5 zc5 = new zc5(this, o10, z, xm8);
        yc5 yc5 = new yc5(1);
        mbe t = ((nqc) this.b).t();
        t.getClass();
        tic.a(zc5, ((nbe) t).a(), (j6) null, yc5, (qmc) null);
    }

    public final void d(String str, boolean z) {
        if (str != null && str.equals(this.j) && a() && ((FrgAttachVideo) this.d).s1 && this.c.h1() != null) {
            mv9 g2 = dhd.g(Collections.singletonList(((FrgAttachVideo) this.d).G1));
            nqc nqc = (nqc) this.b;
            yhd m2 = g2.m(((nbe) nqc.t()).b());
            mbe t = nqc.t();
            t.getClass();
            yhd i2 = new phd(m2.i(((nbe) t).a()), new e44(this, 11, str), 0).i(((nbe) nqc.t()).b());
            pn1 pn1 = new pn1(new qa5(this, str, z, 1), 2, new yc5(2));
            i2.k(pn1);
            this.n = pn1;
        }
    }

    @a1e
    @SuppressLint({"CheckResult"})
    public void onEvent(ove ove) {
        if (ove.c == this.i) {
            StringBuilder sb = new StringBuilder("UpdateMessageEvent: messageId = ");
            long j2 = ove.c;
            sb.append(j2);
            udd.q("ad5", sb.toString());
            nqc nqc = (nqc) this.b;
            sk7 m2 = nqc.m();
            m2.getClass();
            nx7 nx7 = new nx7(new jx7(sk7.b(m2, j2, false, 26), 0, new xc5(this, 3)), new g95(29), 1);
            mbe t = nqc.t();
            t.getClass();
            nx7.h(((nbe) t).a()).f(((nbe) nqc.t()).b()).a(new bx7(new xc5(this, 0), new yc5(0), z3d.i));
        }
    }

    @a1e
    public void onEvent(jh0 jh0) {
        int i2;
        if (this.h == jh0.a) {
            String str = jh0.b.b;
            int i3 = che.a;
            if ("file.not.found".equals(str)) {
                i2 = cic.d0;
            } else {
                i2 = cic.c0;
            }
            Context context = this.a;
            a06.H(0, context, context.getString(i2));
            if (a()) {
                ((FrgAttachVideo) this.d).getClass();
            }
        }
    }

    @a1e
    public void onEvent(bk4 bk4) {
        if (bk4.X != this.i) {
            d(bk4.o, false);
        } else if (a()) {
            FrgAttachVideo frgAttachVideo = (FrgAttachVideo) this.d;
            if (!frgAttachVideo.s1) {
                wx3.C(frgAttachVideo.w1, bk4, true);
            } else if (this.i != 0) {
                nqc nqc = (nqc) this.b;
                sk7 m2 = nqc.m();
                long j2 = this.i;
                m2.getClass();
                mv9 b2 = sk7.b(m2, j2, false, 26);
                mbe t = nqc.t();
                t.getClass();
                new nx7(new jx7(b2.m(((nbe) t).a()), 0, new yc5(3)), new yc5(4), 1).f(((nbe) nqc.t()).b()).a(new bx7(new xc5(this, 2), new yc5(5), z3d.i));
                this.i = 0;
            }
        }
    }

    @a1e
    public void onEvent(dk4 dk4) {
        if (dk4.o == this.i && a()) {
            FrgAttachVideo frgAttachVideo = (FrgAttachVideo) this.d;
            if (frgAttachVideo.s1) {
                this.i = 0;
                frgAttachVideo.k1();
                return;
            }
            wx3.C(frgAttachVideo.w1, dk4, true);
        }
    }
}
