package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: qt5  reason: default package */
public final class qt5 extends taf {
    public final t0c A0;
    public boolean B0;
    public final s5a X;
    public final kdf Y;
    public final t97 Z;
    public final pae b;
    public final g5a c;
    public final td3 o;
    public final grd w0;
    public final t0c x0;
    public final grd y0;
    public final t0c z0;

    /* JADX WARNING: type inference failed for: r4v14, types: [k7c, java.lang.Object] */
    public qt5() {
        t97 t97 = mqc.y;
        tp2 tp2 = tp2.a;
        c5a c5a = (c5a) tp2.getAccessor().c(c5a.class);
        nqc nqc = nqc.a;
        pae s = nqc.s();
        s5a s5a = (s5a) tp2.getAccessor().c(s5a.class);
        tp2.getAccessor().d(v6a.class);
        this.b = s;
        this.c = (g5a) nqc.getAccessor().c(g5a.class);
        this.o = (td3) tp2.getAccessor().c(td3.class);
        this.X = s5a;
        this.Y = (kdf) tp2.getAccessor().c(kdf.class);
        this.Z = t97;
        lg7 c2 = hwf.c();
        List<r49> list = (List) ((AtomicReference) ((s49) s5a.c.getValue()).c).get();
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        boolean z = false;
        for (r49 r49 : list) {
            if (hhd.f(r49.a, "all.chat.folder")) {
                z = true;
            }
            dr5 dr5 = r10;
            dr5 dr52 = new dr5(r49.a, r49.b, (CharSequence) null, r49.c, r49.d);
            arrayList.add(dr5);
        }
        c2.addAll(arrayList);
        if (!z) {
            c2.add(0, new dr5("all.chat.folder", this.c.a.getString(cic.e0), (CharSequence) null, dv3.b, EnumSet.allOf(fr5.class)));
        }
        grd a = hrd.a(hwf.a(c2));
        this.w0 = a;
        this.x0 = new t0c(a);
        grd a2 = hrd.a(0);
        this.y0 = a2;
        this.z0 = new t0c(a2);
        ez3.N(ez3.J(new ck5(ez3.J(new v11(((v72) this.Z.getValue()).g(), c5a.f, new c3(this, (Continuation) null, 12), 4), this.b.a()), new kt5(this, (Continuation) null), 5), this.b.b()), this.a);
        int i = zp4.o;
        long e = zp4.e(mt0.P(2, eq4.SECONDS));
        ? obj = new Object();
        obj.a = System.currentTimeMillis();
        this.A0 = ez3.d0(ez3.z(ez3.P(ez3.z(vx3.M(new v11(ez3.h(new pt5(this, obj, (Continuation) null)), new bc(new t0c(this.o.a), 22, this), new ah1(3, (Continuation) null, 1), 4), mt0.P(500, eq4.MILLISECONDS))), new nt5(obj, e, (Continuation) null))), this.a, ucd.b, te6.c);
    }

    public final void q(String str) {
        if (str != null) {
            Iterator it = ((List) this.w0.getValue()).iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (hhd.f(((dr5) it.next()).a, str)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                this.y0.m((Object) null, Integer.valueOf(i));
            }
        }
    }
}
