package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: bz0  reason: default package */
public final class bz0 extends taf implements vj1 {
    public final t97 X;
    public final t97 Y;
    public final grd Z;
    public final po1 b;
    public final t97 c;
    public final t97 o;
    public final t0c w0;
    public final l05 x0 = new l05(0);

    public bz0(t97 t97, po1 po1, t97 t972, t97 t973, t97 t974) {
        this.b = po1;
        this.c = t972;
        this.o = t973;
        this.X = t97;
        this.Y = t974;
        grd a = hrd.a(hw4.a);
        this.Z = a;
        this.w0 = new t0c(a);
        vx0 vx0 = (vx0) t972.getValue();
        vx0.getClass();
        r((ea) ((py0) vx0).F0.getValue());
        ez3.N(new ck5(((py0) ((vx0) t972.getValue())).D0, new zy0(this, (Continuation) null), 5), this.a);
        ez3.N(new ck5(((py0) ((vx0) t972.getValue())).F0, new az0(this, (Continuation) null), 5), this.a);
        ((ep1) ((so1) t97.getValue())).d(this);
    }

    public final void j() {
        taf.o(this.x0, ch1.C);
    }

    public final vx0 q() {
        return (vx0) this.c.getValue();
    }

    public final void r(ea eaVar) {
        bz0 bz0 = this;
        ea eaVar2 = eaVar;
        while (true) {
            grd grd = bz0.Z;
            Object value = grd.getValue();
            List list = (List) value;
            lg7 c2 = hwf.c();
            hge hge = new hge(r1a.t);
            int i = p1a.c;
            c2.add(new wy0(0, hge));
            vy0 vy0 = r7;
            vy0 vy02 = new vy0(1, new hge(r1a.f), 0, (long) o1a.a, (hge) null, new z6d(eaVar2.b, true), Integer.valueOf(n1a.g), 304);
            c2.add(vy0);
            vy0 vy03 = r6;
            vy0 vy04 = new vy0(2, new hge(r1a.h), 0, (long) o1a.h, (hge) null, new z6d(eaVar2.c, true), Integer.valueOf(n1a.j), 304);
            c2.add(vy03);
            t97 t97 = bz0.o;
            kb5 kb5 = (jb5) t97.getValue();
            kb5.getClass();
            if (kb5.m(PmsKey.gsse, false)) {
                int i2 = n1a.s;
                hge hge2 = new hge(r1a.y);
                z6d z6d = new z6d(eaVar2.d, true);
                c2.add(new vy0(2, hge2, 0, (long) o1a.j, (hge) null, z6d, Integer.valueOf(i2), 304));
            }
            kb5 kb52 = (jb5) t97.getValue();
            kb52.getClass();
            if (kb52.m(PmsKey.grse, false)) {
                vy0 vy05 = r8;
                vy0 vy06 = new vy0(3, new hge(r1a.w), 0, (long) o1a.i, (hge) null, new z6d(eaVar2.e, true), Integer.valueOf(n1a.k), 304);
                c2.add(vy05);
            }
            c2.add(new xy0(new hge(r1a.u)));
            kb5 kb53 = (jb5) t97.getValue();
            kb53.getClass();
            if (kb53.m(PmsKey.gcwr, false)) {
                c2.add(new wy0(1, new hge(r1a.j)));
                vy0 vy07 = r6;
                vy0 vy08 = new vy0(4, new hge(r1a.A), 1, (long) o1a.k, new hge(r1a.B), new z6d(eaVar2.g, true), Integer.valueOf(n1a.G0), 272);
                c2.add(vy07);
            }
            if (!grd.b(value, hwf.a(c2))) {
                bz0 = this;
            } else {
                return;
            }
        }
    }
}
