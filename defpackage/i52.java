package defpackage;

import java.util.Collections;

/* renamed from: i52  reason: default package */
public final /* synthetic */ class i52 implements of3 {
    public final /* synthetic */ t52 a;
    public final /* synthetic */ vo8 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long o;

    public /* synthetic */ i52(t52 t52, vo8 vo8, boolean z, long j) {
        this.a = t52;
        this.b = vo8;
        this.c = z;
        this.o = j;
    }

    public final void accept(Object obj) {
        y52 y52 = (y52) obj;
        t52 t52 = this.a;
        t52.getClass();
        vo8 vo8 = this.b;
        if (vo8 == null) {
            y52.j = 0;
        } else {
            vo8 q = ((to8) t52.s.get()).q(y52.j);
            if (this.c || q == null || vo8.o > q.o) {
                t52.l0(y52, vo8);
            }
        }
        t52.m.c(new mw2(Collections.singletonList(Long.valueOf(this.o)), true));
    }
}
