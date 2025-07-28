package defpackage;

import android.content.Intent;
import android.graphics.Point;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: aj1  reason: default package */
public final class aj1 extends taf {
    public final t0c A0;
    public final grd B0;
    public final r7e C0 = new r7e(new ci1(this, 0));
    public final r7e D0 = new r7e(new ci1(this, 1));
    public final r7e E0 = new r7e(new ci1(this, 2));
    public final r7e F0 = new r7e(new ci1(this, 3));
    public final t0c G0;
    public final grd H0;
    public final grd I0;
    public final grd J0;
    public final t0c K0;
    public final grd L0;
    public final grd M0;
    public final grd N0;
    public final t0c O0;
    public final r7e P0;
    public final l05 Q0;
    public final t0c R0;
    public final t97 S0;
    public final t97 T0;
    public final kv2 X;
    public final xk1 Y;
    public final yl1 Z;
    public final fna b;
    public final po1 c;
    public final tz0 o;
    public final l11 w0;
    public final ync x0;
    public final t97 y0;
    public final t97 z0;

    /* JADX WARNING: type inference failed for: r7v10, types: [i26, l5e] */
    public aj1(t97 t97, fna fna, po1 po1, tz0 tz0, kv2 kv2, xk1 xk1, yl1 yl1, l11 l11, ync ync, t97 t972) {
        po1 po12 = po1;
        yl1 yl12 = yl1;
        t97 t973 = mqc.l;
        this.b = fna;
        this.c = po12;
        this.o = tz0;
        this.X = kv2;
        this.Y = xk1;
        this.Z = yl12;
        this.w0 = l11;
        this.x0 = ync;
        this.y0 = t972;
        this.z0 = t97;
        t0c t0c = po12.o;
        this.A0 = t0c;
        grd a = hrd.a(new u81());
        this.B0 = a;
        t0c t0c2 = new t0c(a);
        this.G0 = t0c2;
        this.H0 = hrd.a(iw4.a);
        raf raf = raf.a;
        bn1 bn1 = r15;
        bn1 bn12 = new bn1(raf, hw4.a, (bue) null, (a97) null, false, (mc0) null);
        grd a2 = hrd.a(new s21(bn12));
        this.I0 = a2;
        this.J0 = a2;
        v11 v11 = new v11(t0c, a, new c3(this, (Continuation) null, 5), 4);
        vye vye = vye.o;
        qr4 qr4 = ucd.a;
        this.K0 = ez3.d0(v11, this.a, qr4, vye);
        Boolean bool = Boolean.FALSE;
        this.L0 = hrd.a(bool);
        this.M0 = hrd.a(bool);
        grd a3 = hrd.a(yk1.d);
        this.N0 = a3;
        this.O0 = new t0c(a3);
        r7e r7e = new r7e(new a01(29));
        this.P0 = r7e;
        this.Q0 = new l05(0);
        this.R0 = ez3.d0(new uv(t0c, 28), this.a, qr4, raf);
        this.S0 = ez3.O(3, new ci1(this, 4));
        this.T0 = ez3.O(3, new di1(0));
        ez3.N(new ck5(((f5f) r7e.getValue()).d, new l5e(2, (Continuation) null), 5), this.a);
        ez3.N(new ck5(yl12.j, new hi1(this, (Continuation) null), 5), this.a);
        ez3.N(ez3.r(po12.c.e, t0c2, new uv(po1.e(), 29), new bc(po1.e(), 8, this), new ii1(this, (Continuation) null)), this.a);
        ez3.N(new ck5(new zi1(po1.f(), 0), new ji1(this, (Continuation) null), 5), this.a);
        xs7.E(this.a, ((pae) t973.getValue()).a(), (ru3) null, new li1(this, (Continuation) null), 2);
        xs7.E(this.a, ((pae) t973.getValue()).a(), (ru3) null, new ni1(this, (Continuation) null), 2);
        pj5 e = po1.e();
        pj5 uvVar = new uv(t0c, 24);
        pj5 uvVar2 = new uv(t0c2, 25);
        pj5 uvVar3 = new uv(t0c2, 26);
        pj5 uvVar4 = new uv(t0c2, 27);
        pj5[] pj5Arr = {e, uvVar, uvVar2, uvVar3, uvVar4};
        ez3.N(new bc(pj5Arr, 21, new ti1(this, (Continuation) null)), this.a);
        ez3.N(new ck5(((py0) po12.l).D0, new oi1(this, (Continuation) null), 5), this.a);
    }

    public final boolean q(boolean z) {
        return (!s().g && !z) || s().g || s().t;
    }

    public final void r() {
        Object value;
        grd grd = this.c.n;
        do {
            value = grd.getValue();
        } while (!grd.b(value, lm1.a((lm1) value, (le1) null, (le1) null, (le1) null, (raf) null, false, (vye) null, 119)));
    }

    public final u81 s() {
        return (u81) this.G0.a.getValue();
    }

    public final void t(boolean z) {
        grd grd;
        Object value;
        do {
            grd = this.L0;
            value = grd.getValue();
            ((Boolean) value).getClass();
        } while (!grd.b(value, Boolean.valueOf(z)));
    }

    public final boolean u() {
        return ((Boolean) this.C0.getValue()).booleanValue();
    }

    public final void v(le1 le1) {
        qja d = this.c.d();
        if (le1.equals(d.a.getId()) || d.a.m()) {
            taf.o(this.Q0, new lh1(le1));
        }
    }

    public final void w(boolean z, Intent intent) {
        Conversation a;
        po1 po1 = this.c;
        nnc nnc = po1.h;
        if (!z || !nnc.c()) {
            if (z && (a = ((bt3) nnc.a.getValue()).a()) != null && !a.isDestroyed() && intent != null) {
                CameraManager a2 = po1.e.a();
                if (a2 != null) {
                    a2.setCameraEnabled(false);
                }
                po1.g.a = intent;
                nnc.b(true);
            } else if (!z && nnc.c()) {
                nnc.b(false);
            }
        }
        iq1 iq1 = (iq1) this.z0.getValue();
        boolean z2 = ((u81) this.G0.a.getValue()).g;
        iq1.getClass();
        iq1.c(iq1, "SCREEN_SHARE", (String) null, (String) null, Integer.valueOf(z ? 1 : 0), (String) null, (String) null, z2, 54);
    }

    public final void x(le1 le1, Point point) {
        g21 a = this.Z.a(le1, point);
        if (a != null) {
            ((iq1) this.z0.getValue()).a(le1.a, (LinkedHashMap) a.c);
            taf.o(this.Q0, new th1(a));
        }
    }
}
