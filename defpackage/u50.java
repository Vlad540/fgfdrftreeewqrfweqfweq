package defpackage;

import java.util.List;

/* renamed from: u50  reason: default package */
public final /* synthetic */ class u50 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    public /* synthetic */ u50(Object obj, Object obj2, long j, long j2, int i) {
        this.a = i;
        this.X = obj;
        this.b = obj2;
        this.c = j;
        this.o = j2;
    }

    public final void run() {
        Object obj = this.b;
        Object obj2 = this.X;
        switch (this.a) {
            case 0:
                otf otf = (otf) obj2;
                otf.getClass();
                int i = mze.a;
                f44 f44 = ((g45) otf.b).a.G0;
                fd P = f44.P();
                f44.Q(P, 1008, new no3(P, (String) obj, this.o, this.c));
                return;
            case 1:
                qe4 qe4 = (qe4) obj2;
                qe4.getClass();
                int i2 = oze.a;
                g44 g44 = ((h45) qe4.c).a.H0;
                gd I = g44.I();
                g44.J(I, 1008, new o34(I, (String) obj, this.o, this.c, 0));
                return;
            case 2:
                for (ym8 f : (List) obj2) {
                    ((nec) obj).f(this.c, this.o, f, false);
                }
                return;
            case 3:
                v4b v4b = (v4b) obj2;
                v4b.getClass();
                int i3 = oze.a;
                g44 g442 = ((h45) v4b.c).a.H0;
                gd I2 = g442.I();
                g442.J(I2, 1016, new o34(I2, (String) obj, this.o, this.c, 2));
                return;
            default:
                d4b d4b = (d4b) obj2;
                d4b.getClass();
                int i4 = mze.a;
                f44 f442 = ((g45) d4b.c).a.G0;
                fd P2 = f442.P();
                f442.Q(P2, 1016, new q52(P2, (String) obj, this.o, this.c));
                return;
        }
    }
}
