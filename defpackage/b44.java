package defpackage;

import java.util.List;
import java.util.Locale;

/* renamed from: b44  reason: default package */
public final /* synthetic */ class b44 implements lh7, of3, m48, je8, le8, nf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;

    public /* synthetic */ b44(gd gdVar, int i, long j, long j2) {
        this.a = 0;
        this.o = gdVar;
        this.c = i;
        this.b = j;
    }

    public void accept(Object obj) {
        int i = this.c;
        long j = this.b;
        Object obj2 = this.o;
        switch (this.a) {
            case 1:
                l95 l95 = (l95) obj2;
                l95.getClass();
                Locale locale = Locale.ENGLISH;
                udd.s("l95", "onNotifMoved: failed to move id=" + j + " to position=" + i, (Throwable) obj);
                l95.f();
                return;
            case 2:
                fa5 fa5 = (fa5) obj2;
                fa5.getClass();
                Locale locale2 = Locale.ENGLISH;
                udd.s("fa5", "onNotifMoved: failed to move id=" + j + " to position=" + i, (Throwable) obj);
                fa5.c();
                return;
            default:
                xw3 xw3 = (xw3) obj;
                w1e w1e = (w1e) obj2;
                oyb.l(w1e.i);
                ws6 ws6 = xw3.a;
                w1e.c.getClass();
                byte[] k = m54.k(xw3.c, ws6);
                ija ija = w1e.d;
                ija.getClass();
                ija.E(k.length, k);
                boolean z = false;
                w1e.a.b(ija, k.length, 0);
                long j2 = xw3.b;
                if (j2 == -9223372036854775807L) {
                    if (w1e.i.s == Long.MAX_VALUE) {
                        z = true;
                    }
                    oyb.k(z);
                } else {
                    long j3 = w1e.i.s;
                    j = j3 == Long.MAX_VALUE ? j + j2 : j2 + j3;
                }
                w1e.a.a(j, this.c, k.length, 0, (zoe) null);
                return;
        }
    }

    public void f(nn6 nn6, int i) {
        nn6.P(((o48) this.o).c, i, this.c, this.b);
    }

    public void g(qza qza, ic8 ic8) {
        qza.r(((me8) this.o).J0(ic8, qza, this.c), this.b);
    }

    public Object h(cd8 cd8, ic8 ic8, int i) {
        int i2 = this.c;
        return cd8.q(ic8, (e8c) ((List) this.o), i2 == -1 ? cd8.s.p0() : i2, i2 == -1 ? cd8.s.k() : this.b);
    }

    public void invoke(Object obj) {
        ((hd) obj).M((gd) this.o, this.c, this.b);
    }

    public /* synthetic */ b44(Object obj, int i, long j, int i2) {
        this.a = i2;
        this.o = obj;
        this.c = i;
        this.b = j;
    }

    public /* synthetic */ b44(Object obj, long j, int i, int i2) {
        this.a = i2;
        this.o = obj;
        this.b = j;
        this.c = i;
    }
}
