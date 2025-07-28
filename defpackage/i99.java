package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: i99  reason: default package */
public final class i99 {
    public final to8 a;
    public final a04 b;
    public final zpc c;
    public final n1b d;
    public final t52 e;
    public final rf4 f;
    public final tt0 g;
    public final pk h;
    public final jc5 i;
    public final m0c j;

    public i99(to8 to8, a04 a04, zpc zpc, n1b n1b, t52 t52, rf4 rf4, tt0 tt0, pk pkVar, jc5 jc5, m0c m0c) {
        this.a = to8;
        this.b = a04;
        this.c = zpc;
        this.d = n1b;
        this.e = t52;
        this.f = rf4;
        this.g = tt0;
        this.h = pkVar;
        this.i = jc5;
        this.j = m0c;
    }

    /* JADX WARNING: type inference failed for: r15v4, types: [tde, java.lang.Object] */
    public final void a(long j2, long j3, ym8 ym8) {
        long j4 = ym8.Y;
        to8 to8 = this.a;
        nec nec = ((hz3) to8.a).c;
        jp8 h2 = nec.d().h(j2, j4);
        vo8 vo8 = null;
        vo8 b2 = h2 != null ? nec.b(h2) : null;
        if (b2 != null) {
            if (b2.c == 0) {
                nec nec2 = ((hz3) this.b).c;
                s59 s59 = bp8.b;
                nec2.getClass();
                nec2.o(ym8, j2, false, (ls8) null);
                to8.w(b2, fu7.g(ym8.w0, this.c));
                nec nec3 = ((hz3) to8.a).c;
                jp8 h3 = nec3.d().h(j2, ym8.Y);
                if (h3 != null) {
                    vo8 = nec3.b(h3);
                }
                b2 = vo8;
            }
            if (b2 != null) {
                i22 S = this.e.S(b2.x0, j3, b2);
                this.d.b(S, b2);
                long j5 = b2.b;
                if (S != null) {
                    if (S.b.m == 0) {
                        this.j.b(S);
                    }
                    if (this.f.d()) {
                        ArrayList i2 = S.i();
                        ArrayList arrayList = new ArrayList(i2.size());
                        Iterator it = i2.iterator();
                        while (it.hasNext()) {
                            try {
                                arrayList.add(Long.valueOf(((tf3) it.next()).n()));
                            } catch (Throwable th) {
                                throw new RuntimeException(th);
                            }
                        }
                        ((gy9) this.h).u(arrayList);
                    }
                    long j6 = S.a;
                    ove ove = new ove(j6, j5, 0);
                    tt0 tt0 = this.g;
                    tt0.c(ove);
                    xm8 xm8 = S.c;
                    if (xm8 != null && xm8.a.b == j5) {
                        tt0.c(new mw2(Collections.singletonList(Long.valueOf(j6)), false));
                    }
                }
                if (b2.m()) {
                    for (o10 o10 : (List) b2.D0.a) {
                        a10 a10 = o10.b;
                        if (a10 != null && a10.X) {
                            String str = o10.r;
                            if (!r1g.p(str)) {
                                int i3 = lp.i;
                                if (str.endsWith(".mp4")) {
                                }
                            }
                            ? obj = new Object();
                            obj.a = j5;
                            obj.b = o10.q;
                            a10 a102 = o10.b;
                            obj.e = a102.w0;
                            obj.g = a102.x0;
                            this.i.a(new ude(obj));
                        }
                    }
                }
            }
        }
    }
}
